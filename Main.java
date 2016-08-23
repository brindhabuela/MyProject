package mylogic;

import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        // Create a link list which stores integer elements
        List<Integer> l = new LinkedList<Integer>();
 
        // Now add elements to the Link List
        l.add(2);
        l.add(3);
        l.add(4);
 
        // Make another Link List which stores integer elements
        List<Integer> s=new LinkedList<Integer>();
        s.add(7);
        s.add(8);
        s.add(9);
 
        // Iterator to iterate over a Link List
        for (Iterator<Integer> itr1=l.iterator(); itr1.hasNext();)
        {
        	Integer i = itr1.next();
            for (Iterator<Integer> itr2=s.iterator(); itr2.hasNext();)
            {
            	Integer j = itr2.next();
                if (i<j)
                {
                    System.out.println(itr1.next());
                }
            }
        }
    }
}
