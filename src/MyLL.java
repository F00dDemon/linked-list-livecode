public class MyLL<T>{
    private class Node<T> {
    public T value;
    public Node<T> next;
    public Node<T> prev;

    public Node(T value, Node<T> next, Node<T> prev){
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}

private Node<T> head;
private Node<T> tail;

public MyLL(){
    head = null;
    tail = null;
}
public void printList(){
        Node<T> current = head;
        
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
public void printBackList(){
        Node<T> current = tail;
        
        while(current != null){
            System.out.println(current.value);
            current = current.prev;
        }
    }

    public  boolean contains(T toFind){
        Node<T> current = head;
        while(current!= null){
            if(current.value.equals(toFind)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
public void addToBack(T toAdd){
    Node<T> newNode = new Node<>(toAdd, tail, head);

    if(head == null){
        head = newNode;
        tail = newNode;
        return;
    }
    Node<T> current = head;
    while(current.next != null){
        current = current.next;
    }
    current.next = newNode;
}

    // public  T remove(T toRemove){
    //     if(head == null){
    //         return null;
    //     }
    //     if(head.value.equals(toRemove)){
    //         head = head.next;
    //         return toRemove;
    //     }

        
    //     while(head.next != null){
    //         if(head.next.value.equals(toRemove)){
    //             head.next = head.next.next;
    //             return toRemove;
    //         }
    //         head = head.next;
    //     }
    //     ;
    // }
}