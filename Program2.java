
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,i,cnt=20;
		System.out.println(n1+" "+n2);
		for(i=2;i<cnt;++i)
		{
			n3=n1+n2;
			System.out.println(+n3);
			n1=n2;
			n2=n3;  
		}

	}

}
