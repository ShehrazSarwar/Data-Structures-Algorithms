// Undo Program Using Stack (Data Structure)

package stack;

import java.util.Scanner;

class StackClass {

    private int SIZE;
    private int top;
    private char stackArray[];

    StackClass(int size) {
        SIZE = size;
        stackArray = new char[size];
        top = -1;
    }

    boolean isFull() {
        if (top == SIZE - 1) {
            return true;
        } else {
            return false;
        }
    }

    void push(char element) {
        if (isFull()) {
            System.out.println("Stack is FULL, can not push!");
            return;
        } else {
            System.out.println("Character Pushed: " + element);
            stackArray[++top] = element;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    char pop() {
        if (isEmpty()) {
            return '0';
        } else {
            return stackArray[top--];
        }
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i]);
        }
    }
}

public class UndoProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stack Size: ");
        int size = sc.nextInt();
        StackClass S = new StackClass(size);
        int choice;
        while (true) {
            if (!S.isFull()) {
                System.out.println("Enter String (one character at a time): ");
                S.push(sc.next().charAt(0));
            } else if(S.isFull()){
                System.out.println("Stack is Full");
            }
            System.out.println("Enter 1 for undo last character else any number to continue push: ");
            choice = sc.nextInt();
            while (choice == 1) {
                S.pop();
                if (S.isEmpty()) {
                    System.out.println("Stack is Empty Exiting Program!");
                    return;
                }
                System.out.println("Updated Stack: ");
                S.display();
                System.out.println("\nEnter 1 for undo last character again else any number to continue push: ");
                choice = sc.nextInt();
            }

        }
    }

}