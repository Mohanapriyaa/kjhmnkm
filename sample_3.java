
public class sample_3 {

	public static void main(String[] args) {
		int fact=1,i;
		int n=Integer.parseInt(args[0]);
				if(args.length==0)
				{
					System.out.println("plese enter an integer" +n);
				}
				else if(n==0)
				{
					System.out.println("The factorial of 0 is 1");
				}
				else
				{
					for(i=1;i<=n;i++)
					{
						fact=fact*i;
					}
					{
						System.out.println("The factorial of "+n+" is"+fact);
					}
					}
					
				}

}


