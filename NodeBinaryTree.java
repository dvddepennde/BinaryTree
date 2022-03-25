
public class NodeBinaryTree<T>
{
    private NodeBinaryTree<T> rightElement;
    private NodeBinaryTree<T> leftElement;
    private T elemnt;

    public NodeBinaryTree(T value)
    {
        elemnt = value;
    }

    public NodeBinaryTree(NodeBinaryTree left, NodeBinaryTree right, T val)
    {
        rightElement = right;
        leftElement = left;
        elemnt = val;
    }

    public void pushRight(T newRight)
    {
        rightElement = newRight;
    }

    public void pushLeft(T newLeft)
    {
        leftElement = newLeft;
    }

    private boolean hasOneChild()
    { 
        return (leftElement == null && rightElement != null) || (leftElement != null && rightElement == null);
    }
    
    public String inOrderPath()
    {
        String inOrder = "";
        
        if(hasOneChild()){
            throw new RuntimeException("A node with value: " + elemnt.toString()  + " has only one child.");
        }
        
        if(leftElement != null){
            inOrder += "(" + leftElement.inOrderPath();
        }
        
        inOrder += elemnt.toString();

        if(rightElement != null){
            inOrder += leftElement.inOrderPath() + ") ";
        }
        
        return inOrder;
    }

    public T getValue()
    {
        return elemnt;
    }
}