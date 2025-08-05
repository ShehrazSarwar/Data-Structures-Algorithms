/*write  a java language program to ask the user length and values of an array 
and display the sum of the values 
*/
package dsa_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array: ");
        int len = sc.nextInt();
        
        int [] arr = new int[len];
        
        System.out.println("Enter values of an Array: ");
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        
        System.out.println("Sum: " + sum);
        
  }
}
