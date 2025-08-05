package stack;

class stackusingclass {

    private int maxSize;
    private int top;
    private int[] stackArray;

    public stackusingclass(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot puch " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed into the stack.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            System.out.println("Element popped: " + stackArray[top] );
            return stackArray[top--];
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == maxSize - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void display() {
        System.out.println("\nDisplaying Stack");
        if (!isEmpty()) {
            for (int s = 0; s <= top; s++) {
                System.out.println(stackArray[s]);
            }
        } else {
            System.out.println("Stack is empty.");
        }

    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

}

public class Stack {

    public static void main(String[] args) {
        stackusingclass s1 = new stackusingclass(5);
        s1.push(1);
        s1.push(2);
        s1.display();

        System.out.println("\nStack top value is: " + s1.peek());
        
        s1.pop();
        s1.pop();
        s1.pop();

    }

}
