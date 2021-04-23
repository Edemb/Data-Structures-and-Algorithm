package Blege_Queue;
/*
 * Blege Bright Edem
 * 219CS01000078
 * Queue Assignment
 * */
class Queue {
    int SIZE = 6;
    int items[] = new int[SIZE];
    int front, rear;

    Queue() {
        front = -1;
        rear = -1;
    }
    // Code to check if the queue is full
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }

    //Code to check if the queue is empty

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

// Denoting the first element of the queue

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so the queue has to be reset after deleting it. */
            else {
                front++;
            }
            System.out.println("Deleted -> " + element);
            return (element);
        }
    }

    void display() {
        // Function code to display elements of Queue
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            System.out.println("\nRear index-> " + rear);
        }
    }

    public static void main(String[] args) {
        Queue que = new Queue();

        // deQueue is not possible on an empty queue
        que.deQueue();

        // enQueue's 6 elements
        que.enQueue(10);
        que.enQueue(2);
        que.enQueue(23);
        que.enQueue(5);
        que.enQueue(8);
        que.enQueue(6);

        // 7th element can't be added because the queue is full
        que.enQueue(7);

        que.display();

        // deQueue removes element entered first i.e. 10
        que.deQueue();

        // Now we have just 5 elements
        que.display();

    }
}