package Blege_SingleLinkedList;
/*
* Blege Bright Edem
* 219CS01000078
* SinglyLinkedList Assignment
* */
class SinglyLinkedList {
     //Represent a node of the singly linked list
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represents the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    //addNode() adds a new node to the list
    public void numberAdd(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list:\n ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void push(int newdata){
        Node newnode =new Node(newdata);
        newnode.next=head;
        head=newnode;
    }
    public void insertAfter(Node prevnode, int data){

        if(prevnode ==null){
            System.out.println("The given node cannot be null");
            return;
        }
        Node newnode=new Node(data);
        newnode.next=prevnode.next;
        prevnode.next=newnode;

    }
    //Deleting via the recursive method.
    public void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    public void insertAtEnd(int data){

        Node new_node = new Node(data);

        if (head == null) {
            head = new Node(data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }



    public static void main(String[] args) {

        SinglyLinkedList lList = new SinglyLinkedList();

        //Add nodes to the list
        lList.numberAdd(11);
        lList.numberAdd( 10);
        lList.numberAdd(12);
        lList.numberAdd(16);
        lList.numberAdd(9);
        lList.numberAdd(14);

        //Displays the nodes present in the list
        lList.display();

        System.out.println("List after inserting 15 in front");
        lList.push(15);
        lList.display();

        System.out.println("List after inserting 25 after node 16");
        lList.insertAfter(lList.head.next.next.next.next, 25);
        lList.display();

        System.out.println("List after deleting node 9");
        lList.deleteNode(9);
        lList.display();

        System.out.println("List after adding 30 after node 10");
        lList.insertAfter(lList.head.next.next,30);
        lList.display();

        System.out.println("List after inserting 45 at the end");
        lList.insertAtEnd(45);
        lList.display();

        System.out.println("List after deleting node 8");
        lList.deleteNode(8);
        lList.display();


    }
}
