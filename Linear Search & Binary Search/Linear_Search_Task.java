package Linear_Search_Task;
import java.util.Scanner;

public class Linear_Search_Task {
    
    static int Search(String[] books, String target) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(target)) 
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {"DSA", "Java", "Python", "C++", "Algorithms"};
        
        System.out.print("Enter the book name to search: ");
        String bookName = sc.nextLine();
        
        int index = Search(books, bookName);
        
        if (index != -1) {
            System.out.println("Book found at index: " + index);
        } else {
            System.out.println("Book not found.");
        }
    }
}
