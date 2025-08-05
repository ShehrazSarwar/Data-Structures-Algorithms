package dsa_1;

import java.util.Scanner;

public class DSA_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array: ");
        int len = sc.nextInt();
        
        String[] cars = new String[len];
        
        System.out.println("Enter names for Cars Array: ");
        
        for (int i = 0; i < cars.length; i++) {
            cars[i] = sc.next();
        }
        
        System.out.println("\nDisplaying Cars Array");
        
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
