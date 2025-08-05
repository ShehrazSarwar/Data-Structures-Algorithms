package linearsearch;
import java.util.Scanner;

public class LinearSearch {
    public static int search(int target, int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter Elements Of The Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter Target: ");
        int target = sc.nextInt();
        
        int index = search(target, arr);
        System.out.println("At Index: " + index);
    }
}
