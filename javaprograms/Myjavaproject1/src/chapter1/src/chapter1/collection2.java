package chapter1;

public class collection2 {

	public static void main(String[] args)
	{
		java.util.ArrayList<String> al=new java.util.ArrayList<>();
		al.add("ravi");
		al.add("ravi");
		al.add("ravi");
		for(String obj:al)
			System.out.println(obj);
		al.set(al.indexOf("ravi"),"rohit");
		System.out.println(al);

	}

}
