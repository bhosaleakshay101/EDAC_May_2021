class Sp9
{
	public static void main(String args[])
	{ 
		System.out.println("Assignment 2 : Star Pattern 9 ");
	 
		for(int i=1;i<=5;i++)
		{	 	
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println(); 
		}
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println(); 
		}
	}
}