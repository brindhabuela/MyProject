package logical.Ms1;



public class Difference 
{
public static void main(String[] args) 
{
int[] a=new int[]{1,2,3,5,6};
int temp=0;
int temp1=0;
int x=0;
int i;
for(i = a.length-1; i >=0; i--)
{
	x+=a[i];
   
}
System.out.println("sum is:"+x);
temp=a[0];
for(i=0;i<=a.length;i++)
{
	temp1+=temp;
	temp+=1;
	
}
System.out.println(temp1);
System.out.println("Missing num is:"+(temp1-x));
}
}
