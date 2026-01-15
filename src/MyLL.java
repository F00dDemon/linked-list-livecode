public class MyLL{
    private class Node {
    public char value;
    public Node next;

    public Node(char value, Node next){
        this.value = value;
        this.next = next;
    }
}

private static Node head;

public MyLL(){
    head = null;
}
public static void printList(){
        Node current = head;
        
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static boolean contains(char toFind){
        Node current = head;
        while(current!= null){
            if(current.value == toFind){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static char remove(char toRemove){
        if(head == null){
            return '\0';
        }
        if(head.value == toRemove){
            head = head.next;
            return toRemove;
        }
        Node.current = head;
        
        while(head.next != null){
            if(head.next.value == toRemove){
                head.next = head.next.next;
                return toRemove;
            }
            head = head.next;
        }
        ;
    }
}