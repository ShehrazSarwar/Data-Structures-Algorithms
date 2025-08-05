package circularqueue;

class CQueue{
    int front,rear;
    int maxSize;
    int [] items;
    
    CQueue(int size){
        maxSize = size;
        items = new int[maxSize];
        front = -1;
        rear = -1;
    }
    
    boolean isEmpty(){
        return (front == -1);
    }
    
    boolean isFull(){
        return (front == (rear + 1) % maxSize);
    }
    
    void enQueue(int element){
        if(isFull()){
            System.out.println("Queue Is Full!");
        } else{
            if(isEmpty()){
                front = 0;
            }
            rear = (rear+1)% maxSize;
            items[rear] = element;
            System.out.println("Item Insereted: " + element);
        }
    }
    
    int deQueue(){
        if(isEmpty()){
            System.out.println("Queue Is Empty!");
            return -1;
        }
        int element = items[front];
        if(front == rear){
            front = -1;
            rear = -1;
        } else{
            front = (front+1) % maxSize;
        }
        System.out.println("Item Deleted " + element);
        return element;
    }
    
    void display(){
        int i;
        if(isEmpty()){
            System.out.println("Queue Is Empty!");
            return;
        }
        for(i = front; i!= rear; i = (i+1)%maxSize){
            System.out.print(items[i] + " ");
        }
        System.out.print(items[i] + " ");
        System.out.println("");
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        CQueue Q = new CQueue(5);
        Q.enQueue(1);
        Q.enQueue(2);
        Q.enQueue(3);
        Q.enQueue(4);
        Q.enQueue(5);
        Q.enQueue(6);
        
        System.out.println("\nDisplaying Queue: ");
        Q.display();
        
        System.out.println("");
        Q.deQueue();
        Q.deQueue();
        
        Q.enQueue(6);
        Q.enQueue(7);
        
        System.out.println("\nDisplaying Queue: ");
        Q.display();
        System.out.println("");
        
        Q.deQueue();
        Q.deQueue();
        Q.deQueue();
        Q.deQueue();
        Q.deQueue();
        Q.deQueue();
        
        System.out.println("\nDisplaying Queue: ");
        Q.display();
    }
    
}
