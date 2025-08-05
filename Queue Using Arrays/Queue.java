package queue;

class queueClass {

    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;

    queueClass() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if (rear == SIZE - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    void enqueue(int element) {
        if (isFull()) {
            System.out.println("\nQueue is Full\n");
            return;
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Inserted: " + element);
        }
    }

    int dequeue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is Empty\n");
            return -1;
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Item Deleted: " + element);
            return element;
        }
    }
    
    void display(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            for(int i = front; i<= rear; i++){
                System.out.print(items[i] + " ");
            }
            System.out.println("");
        }
    }
}

public class Queue {

    public static void main(String[] args) {
        queueClass Q = new queueClass();
        Q.dequeue();
        
        Q.enqueue(1);
        Q.enqueue(2);
        Q.enqueue(3);
        Q.enqueue(4);
        Q.enqueue(5);
        Q.enqueue(6);
        
        System.out.println("Displaying Queue:");
        Q.display();

        Q.dequeue();
        Q.dequeue();
        Q.dequeue();
        Q.dequeue();
        Q.dequeue();
        Q.dequeue();
        
        System.out.println("Displaying Queue:");
        Q.display();
    }

}
