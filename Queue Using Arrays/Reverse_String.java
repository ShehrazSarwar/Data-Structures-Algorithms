package queue;


class queueClass_ {

    int SIZE = 5;
    char items[] = new char[SIZE];
    int front, rear;

    queueClass_() {
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

    void enqueue(char element) {
        if (isFull()) {
            System.out.println("\nQueue is Full");
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

    char dequeue() {
        char element;
        if (isEmpty()) {
            System.out.println("\nQueue is Empty");
            return ' ';
        } else {
            element = items[front];
            if (front >= rear) {
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
            for(int i = SIZE -1; i>=0;i--){
                System.out.print(items[i]);
            }
            System.out.println("");
        }
    }
}

public class Reverse_String {

    public static void main(String[] args) {
        String word = "IQRA";
        System.out.println("String: " + word);
        queueClass_ Q = new queueClass_();
        Q.dequeue();
        
        for(int i = 0; i < word.length();i++){
            Q.enqueue(word.charAt(i));
        }

        System.out.println("\nDisplaying Queue In Reverse:");
        Q.display();
        
        System.out.println("");
        Q.dequeue();
        Q.dequeue();
        Q.dequeue();
        Q.dequeue();
        Q.dequeue();
        
    }

}
