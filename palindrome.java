import java.util.Scanner;


public class palindrome {

	
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s1=in.nextLine();
  StringBuffer s2=new StringBuffer(s1) ;
 StringBuffer s3=s1.reverse();
if (s1.contentEquals(s3))
{
	System.out.println("palindrome");
}
 
 else
 {
	 System.out.println("not palindrome");
 }
	}

}
}