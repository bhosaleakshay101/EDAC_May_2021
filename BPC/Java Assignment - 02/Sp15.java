class Sp15
{
	public static void main(String args[])
	{ 
		System.out.println("Assignment 2 : Star Pattern 15 ");
	 
		for(int i=1;i<=5;i++)
		{
		 	for(int j=1;j<=i;j++)
			{
				if(j==1||j==i||i==5)	
			 	{ 
					System.out.print("*");	 
				}
				
				else
				{
					System.out.print(" ");
				}				 
			}
			System.out.println();
		}	
	}
}	