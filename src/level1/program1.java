package level1;

import java.util.Scanner;

public class program1 {
       static void program1(String name) 
    { 
        if (name.length() == 0) 
            return; 
        String words[] = name.split(" "); 
        for(String word : words) { 
            System.out.print(Character.toUpperCase(word.charAt(0)) + "."); 
        } 
    } 
    public static void main(String args[]) 
    { 
        Scanner myObj = new Scanner(System.in); 
          System.out.println("Enter name");
          String name = myObj.nextLine(); 
             System.out.println("name: " + name);
        program1(name); 
    } 
}   
