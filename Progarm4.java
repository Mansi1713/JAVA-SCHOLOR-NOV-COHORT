import java.util.*;
public class Progarm4 {

	public static void main(String[] args) {
	
		 String str, reverse = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + str.charAt(i);
	 
	      if (str.equals(reverse))
	         System.out.println(str+" Is a palindrome");
	      else
	         System.out.println(str+" Is not a palindrome");

	}

}
