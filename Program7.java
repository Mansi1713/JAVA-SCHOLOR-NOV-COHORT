import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		String nstr="";
		char ch;
		Scanner sc=new Scanner(System.in); 
		System.out.println(" Enter Original word: ");
		String str1=sc.next();   
		for (int i=0; i<str1.length(); i++)
		{
			ch= str1.charAt(i);
			nstr= ch+nstr;
		}
		System.out.println("Reversed word: "+ nstr);
	}

}
