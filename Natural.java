import java.util.Scanner;


public class Natural {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum=0;
		Scanner sc=new Scanner(System.in);
	      int a=sc.nextInt();
	      while(i<=a)
	      {
	    	  sum=sum+i;
	    	  i++;
	      }
	      
	    System.out.println(sum);	  

	}
}


