package chapter1;

import java.util.Iterator;
public class collection6 {

	public static void main(String[] args)
	{
		java.util.ArrayList<String> al=new java.util.ArrayList<>();
        al.add("ravi");
        al.add("ravi");
        al.add("ravi");
        java.util.ArrayList<String> al2=new java.util.ArrayList<>();
        al2.add("ravi");
        al2.add("ravi");
        al.retainAll(al2);
        Iterator<String> itr=al.iterator();
        while(itr.hasNext())
        	{
        	System.out.println(itr.next());
        	}
        	}

}
