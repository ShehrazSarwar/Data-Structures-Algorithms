// write a java language program to find the smallest number from an array
package dsa_1;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 values of an Array: ");

        for (int i = 0; i < arr.length; i++) {
            
             arr[i] = sc.nextInt();
            
        }

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest);

    }
}
