
public class sample2 {
	public static void main(String[] args) {
	int num=Integer.parseInt(args[0]);
	if(args.length==0)
	{
		System.out.println("enter an integer");
	}
	if(num==0||num==1)
	{
		System.out.println("neither prime nor composite");
	}
	else
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		 if(flag==0)
			{
				System.out.println(" prime number");
			}
				else{
	            System.out.println("not prime number");
				}
			}
		}
	}

	


