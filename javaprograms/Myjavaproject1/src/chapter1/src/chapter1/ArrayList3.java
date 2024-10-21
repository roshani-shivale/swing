package chapter1;

public class ArrayList3 {

	public static void main(String[] args) 
	{
		java.util.ArrayList<String> items=new java.util.ArrayList<>();
		items.add("item1");
		items.add("item2");
		items.add("item3");
		
		System.out.println("origional list:"+items);
		items.clear();
		System.out.println("list after clearing:"+items);

	}

}
