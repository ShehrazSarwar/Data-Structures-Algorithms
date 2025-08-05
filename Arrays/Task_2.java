/*write a java language program to ask the user 10 different numbers 
and find the sum of only even numbers.
 */
package dsa_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 different values of an Array: ");

        for (int i = 0; i < arr.length; i++) {
            
             arr[i] = sc.nextInt();
            
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }

        System.out.println("Sum: " + sum);

    }
}
