package Blege_DoublyLinkedList;

/*
 * Blege Bright Edem
 * 219CS01000078
 * Doubly inkedList Assignment
 * */
class DoublyLinkedList {
    //A node class for doubly linked list
    class Node{
        int unit;
        Node previous;
        Node next;

        public Node(int unit) {
            this.unit = unit;
        }
    }
    //head and tail is set to null initially
    Node head, tail = null;

    //add a node to the list
    public void addNode(int unit) {
        //Creating a new node
        Node newNode = new Node(unit);

        //if list is empty, head and tail points to newNode
        if(head == null) {
            head = tail = newNode;
            //head's previous will be null
            head.previous = null;
            //tail's next will be null
            tail.next = null;
        }
        else {
            //Adds newNode to the end of list i.e tail->next set to newNode
            tail.next = newNode;
            //newNode->previous set to tail
            newNode.previous = tail;
            //newNode becomes new tail
            tail = newNode;
            //tail's next point to null
            tail.next = null;
        }
    }

    //print all the nodes of doubly linked list
    public void printNodes() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("Doubly Linked List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            //Print each node and then go to next.
            System.out.print(current.unit + " ");
            current = current.next;
        }
    }
}
class Main{
    public static void main(String[] args) {
        //Create a DoublyLinkedList object
        DoublyLinkedList dl_List = new DoublyLinkedList();
        //Add nodes to the list
        dl_List.addNode(100);
        dl_List.addNode(20);
        dl_List.addNode(011);
        dl_List.addNode(90);
        dl_List.addNode(300);

        //Print the nodes of DoublyLinkedList
        dl_List.printNodes();
    }
}