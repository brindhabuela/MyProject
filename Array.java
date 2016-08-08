package logical.Ms1;

public class Array 
{
public static void main(String[] args) 
{
	int[] a=new int[]{10, 5, 3, 4, 3, 5, 6};
	int temp=0;
	int temp1=0;
	int x=0;
	int i;
	for(i = a.length-1; i >=0; i--)
	{
		x=a[i];
	   
	
	System.out.print(x);
}
	temp=a[0];
	for(i=0;i>=a.length;i--)
	{
	while(temp==a[a.length-1])
		{
			System.out.println("First number is:"+temp);
			temp++;
			}
		
	}
		temp1=a[a.length-1];
		while(temp1==a[i])
		{
			//System.out.println("\n"+temp1);
			temp1++;
		}
		System.out.println("\n"+temp1);
}
}