import java.util.Scanner;


public class prime {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int s=in.nextInt();
		int sum=0;
		while(s!=0)
		{
		int n=s%10;
		sum=sum+n;
		s=s/10;
		}
		System.out.println(sum);
	}
}