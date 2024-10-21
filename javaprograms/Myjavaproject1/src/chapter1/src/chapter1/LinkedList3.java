package chapter1;

public class LinkedList3 {

	public static void main(String[] args) 
	{
		java.util.LinkedList<String> names=new java.util.LinkedList<>();
		names.add("charlie");
		names.add("alice");
		names.add("bob");
		System.out.println(names);
		names.addLast("rajkumar");
		System.out.println(names);
	}

}
