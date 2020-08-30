package level1;
import java.util.Scanner;
class Count {
 public static void main(String args[]) 
	{ 
		 Scanner myObj = new Scanner(System.in); 
                   System.out.println("Enter string");
                      String str = myObj.nextLine(); 
                         System.out.println("string is :" + str);
int upper=0; 

		for(int i = 0; i < str.length(); i++) 
		{ 
			char ch = str.charAt(i); 
			if (ch >= 'A' && ch <= 'Z') 
				upper++; 
		} 
		System.out.println("Upper case letters : " + upper); 
	} 
} 


