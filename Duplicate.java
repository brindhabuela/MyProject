package mylogic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate 
{
public static void main(String[] args) 
{
	int[] arr = { 1, 5, 23, 2, 1, 6, 3, 1, 8, 12, 3 };
	 Set<Integer> hashSet = new HashSet<Integer>();

	    for(int i=0; i < arr.length; i++){
	        boolean unique = hashSet.add(arr[i]);
	        if(unique == false)
	            System.out.println("duplication " + arr[i]);
	    }     
}
}
