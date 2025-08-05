package stack;

class stackusingclass_ {

    private int maxSize;
    private int top;
    private char[] stackArray;

    public stackusingclass_(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot puch " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed into the stack.");
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return ' ';
        } else {
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

    public char peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty.");
            return ' ';
        }
    }

}


public class Reverse_String {
        public static void main(String[] args) {
        String word = "Shehraz";
        int size = word.length();
        
        System.out.println(word + "\n");

        stackusingclass_ s1 = new stackusingclass_(size);
        
        for(int i = 0; i < size; i++){
            s1.push(word.charAt(i));
        }
        
        System.out.println("\nIn Reversed: ");
        for(int i = 0; i < size; i++){
            System.out.print(s1.pop());
        }
        System.out.println("");
    }
}