
public class Digits {

	
	public static void main(String[] args) {
		int count=0;
		int a=Integer.parseInt(args[0]);
		while(a!=0)
		{
			    a=a/10;
				count++;
				}
		System.out.println(count);
	}
}


