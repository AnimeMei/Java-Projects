package List;

public class Node {
    public Object item;
    public Node next;

    public Node(Object newItem) {
        item = newItem;
        next = null;
    }

    public Node(Object newItem, Node nextNode) {
        item = newItem;
        next = nextNode;
    }
}


// Usage: (You can use this class as follows)
// Node n = new Node(new Integer(6));
// Node first =  new Node(new Integer(9), n);
