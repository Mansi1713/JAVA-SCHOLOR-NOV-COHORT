import java.util.*;
public class Program3 {

	public static void main(String[] args) {
		int ans=1, num;
		System.out.println("Enter the number to find factorial:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for(int i=1;i<=num;i++)
		{
			ans = ans * i;

		}
		System.out.println("Factorial of the given number is: "+ans);
	}

}
