package mylogic;

public class Power 
{
public static void main(String[] args) 
{
	int[] n={7,8,6};
	int sum=0;
	int t=0;
	for(int i=0;i<n.length;i++)
			{
		
			sum+=Math.pow(n[i], t);
			t=n[i];
			}
			System.out.println(sum);
			
			
	}
}

