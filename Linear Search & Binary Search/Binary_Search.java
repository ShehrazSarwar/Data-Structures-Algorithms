package Binary_Search;
import java.util.Scanner;

public class Binary_Search{
    static int binarySearch(String[] contacts, String target) {
        int low = 0;
        int high = contacts.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            // for comparing each character as unicode we use .compareTo()
            int compare = contacts[mid].compareTo(target); 
            
            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] contacts = {"Aaraiz","Afsa","Hina","Maryam","Moiz","Shehraz"};
        
        System.out.println("Available Contacts:");
        for (String contact : contacts) {
            System.out.println(contact);
        }
        
        System.out.print("\nEnter contact name to search: ");
        String name = sc.nextLine();
        
        int index = binarySearch(contacts, name);
        
        if (index != -1) {
            System.out.println("Contact found at index: " + index);
        } else 
        {
            System.out.println("Contact not found.");
        }
    }
}
