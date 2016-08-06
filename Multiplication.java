import java.util.Scanner;


public class Multiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      int a=sc.nextInt();
	      int n=10;
	      int m = 0;
	      for(int i=1;i<=n;i++)
	      {
	    	  m=i*a;
	    	  System.out.println(m);
	      }
	      
	}

}
