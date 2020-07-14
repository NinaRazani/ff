package w3source;

public class LinkedList {

    static Node head;
    static class Node{
        int data;
        Node next_node;
        Node(int d){
            data = d;
            next_node = null;
        }
    }

    /*reverse the linked list*/
    Node reverse(Node node){
        Node prev_Node = null;
        Node current_Node = node;
        Node next_Node = null;
        while (current_Node != null){
            next_Node = current_Node.next_node;
            current_Node.next_node = prev_Node;
            prev_Node = current_Node;
            current_Node = next_Node;
        }
        node = prev_Node;
        return node;
    }

    // delete duplicate elements in linked list
    public static void removeDup(LinkedList link){
        Node node ;
        if (head == null)
            return;
        for (node =link.head ; node != null ; node = node.next_node){
            if (node.next_node.data == node.data){
                node.next_node = node.next_node.next_node;
            }
        }
    }

    void printList(Node node){
        while (node!=null){
            System.out.print(node.data + " ");
            node = node.next_node;
        }
    }

    public static void main(String[] args) {
        LinkedList List = new LinkedList();
        List.head = new Node(12); // the manner of access to static inner class
        List.head.next_node = new Node(12);
        List.head.next_node.next_node = new Node(13);
        List.head.next_node.next_node.next_node = new Node(14);
        List.head.next_node.next_node.next_node.next_node = new Node(15);
        List.head.next_node.next_node.next_node.next_node.next_node = new Node(15);
        List.head.next_node.next_node.next_node.next_node.next_node.next_node = new Node(16);
        List.head.next_node.next_node.next_node.next_node.next_node.next_node.next_node = new Node(17);
        List.head.next_node.next_node.next_node.next_node.next_node.next_node.next_node.next_node = new Node(17);

        System.out.println("Original Linked list:");
        List.printList(head);
        List.removeDup(List);

//        head = List.reverse(head);
        System.out.println("");
//        System.out.println("Reversed Linked list:");
        List.printList(head);
    }

}
