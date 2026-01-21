public class Practice {
    public static void main(String[] args) {
    //     // Node noNode = null;
    //     // System.out.println(noNode.value);
    //     Node head = new Node('g', null);
    //     System.out.println();
    //     // System.out.println((head.value));
    //     // System.out.println(head.next);

    //     Node ryan = new Node('s', null);
    //     head.next = ryan;
    //     ryan.next = new Node('t', null);

    //     // Node end = ryan;
    //     // end.next;

    //     ryan.next.next = new Node('x', null);

    //     head = head.next;

    //     printList(head);

    //     System.out.println(contains(head, 'x'));
    //     System.out.println(contains(head, 't'));
    //     remove(head, 't');
    //     System.out.println(contains(head, 't'));
    MyLL<Character> list = new MyLL<>();
    list.addToBack('x');
    list.addToBack('m');
    list.addToBack('v');
    list.addToBack('o');
    list.printBackList();

    MyLL<Integer> intList = new MyLL<>();
    // intList.addToBack(9);
    // intList.addToBack(67);
    // intList.addToBack(7);
    // intList.addToBack(23);
    // intList.printBackList();
    }

    public static void printList(Node start){
        Node<?> current = start;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static boolean contains(Node start, char toFind){
        Node current = start;
        while(current!= null){
            if(current.value.equals(toFind)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static char remove(Node head, char toRemove){
        Node current = head;

        while(current.next != null){
            if(current.next.value.equals(toRemove)){
                current.next = current.next.next;
                return toRemove;
            }
            current = current.next;
        }
        return '\0';
    }
}
