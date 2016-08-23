package mylogic;


public class Solution 
{
public static void main(String[] args) 
{
	String s="abacdd";
	char ch;
	System.out.println(s);
	int m[]=new int[27];
	for(int i=0;i<s.length();i++)
	{
		ch=s.charAt(i);
		int n=ch-96;
		m[n]++;
		}
	for(int i=0;i<m.length;i++)
	{
		int rem=0;
		int sum=0;
		if(m[i]>0)
		{
		
			
			//System.out.println((char)(i+96)+"="+m[i]);
			m[i]=(int) Math.pow(m[i], m[i]);
			//System.out.println(m[i]);

			while(m[i]>0)
			{
				 rem=m[i]%10;
				 sum+=rem;
				 m[i]=m[i]/10;
			}
			m[i]=sum;
			System.out.println(m[i]);
	}
	}
	}
}
 