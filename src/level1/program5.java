package level1;
import java.util.Scanner;
public class program5 {
  public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = sc.nextLine();
        System.out.print("Number of words in the string: " + countWords(str)+"\n");
    }

 public static int countWords(String str)
    {
       int count = 0;
        if (!(" ".equals(str.substring(0,1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }
        return count; 
    }
 }
