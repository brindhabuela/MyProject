package mylogic;

import java.util.Scanner;

public class Alphabet
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
String n=s.next();
char[] ch=n.toCharArray();
for(int i=0;i<ch.length;i++)
{
	System.out.println(ch[i]);
	if(Character.isAlphabetic(i))
	{
		System.out.println("alphabets"+ch[i]);
	}
	else
	{
		System.out.println("Numbers"+ch[i]);
	}
}
}
}
