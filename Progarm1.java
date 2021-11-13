import java.util.*;
public class Progarm1 {

	public static void main(String[] args) {

		int n1,n2,answer=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1-Addition 2-Subtraction 3-Multilplication 4-Division");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			System.out.println("Enter any two numbers");
			n1=sc.nextInt();
			n2=sc.nextInt();
			switch(ch)
			{
			case 1: 
				answer=n1+n2;
				System.out.println("Answer is "+answer);
				break;
			case 2:
				answer=n1-n2;
				System.out.println("Answer is "+answer);
				break;
			case 3:
				answer=n1*n2;
				System.out.println("Answer is "+answer);
				break;
			case 4:
				answer=n1/n2;
				System.out.println("Answer is "+answer);
				break;
			}
			System.out.println("Do you want to continue press yes!");
		}while(sc.next().equals("yes"));
		System.out.println("--------THANK-YOU!!-------------");
	}

}
