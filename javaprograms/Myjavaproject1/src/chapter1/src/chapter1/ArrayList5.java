package chapter1;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList5 {

	public static void main(String[] args) 
	{
		java.util.ArrayList<String> names=new java.util.ArrayList<>();
		names.add("charlie");
		names.add("alice");
		names.add("bob");
		Collections.sort(names);
		System.out.println("sorted names:"+names);

	}

}
