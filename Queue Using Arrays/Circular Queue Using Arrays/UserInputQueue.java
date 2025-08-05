package circularqueue;

import java.util.Scanner;

class CircularQueue_{
    int front,rear;
    int maxSize;
    int [] items;
    
    CircularQueue_(int size){
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

public class UserInputQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size for Queue: ");
        int size = sc.nextInt();
        
        CircularQueue_ q = new CircularQueue_(size);
        System.out.println("Enter Elements: ");
        
        while(!q.isFull()){
            q.enQueue(sc.nextInt());
        }
        sc.nextLine();
        
        System.out.println("Enter no of elements you wanted to dequeue: ");
        int elements = sc.nextInt();
        while(elements > size){
            System.out.println("Must be equal or less than size of the Queue");
            System.out.println("Enter Again: ");
            elements = sc.nextInt();
        }
        for(int i = 0; i < elements; i++){
            q.deQueue();
        }
        
        System.out.println("\nUpdated Queue: ");
        q.display();
        
    }
}

