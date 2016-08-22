package logical.Ms1;

public class Stri 
{


	    public static void main(String[] args) 
	    {
			
			char[] a={'p','r','o','g','r','a','m'};
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					if(j==i|| j==a.length-1-i)
					{
					System.out.println(a[j]);	
					}
					else
					{
						System.out.println(" ");
					}
					
				}
			}
			}
}
 
