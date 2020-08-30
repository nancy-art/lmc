package level1;
import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
          System.out.println("Enter string");
          String line = sc.nextLine(); 
             System.out.println("Entered string is: " + line);
        int vowels = 0;

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
        }
        System.out.println("string is: " + line);
        System.out.println("Vowels are: " + vowels);
    }
}

