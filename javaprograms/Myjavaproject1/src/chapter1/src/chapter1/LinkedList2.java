package chapter1;

public class LinkedList2 {

	public static void main(String[] args)
	{
		java.util.LinkedList<String> names=new java.util.LinkedList<>();
		names.add("charrlie");
		names.add("alice");
		names.add("bob");
		System.out.println(names);
		names.addFirst("ram");
		System.out.println(names);

	}

}
