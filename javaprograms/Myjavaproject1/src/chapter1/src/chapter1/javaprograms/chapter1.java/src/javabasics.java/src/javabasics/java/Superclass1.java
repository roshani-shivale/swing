package javabasics.java;

public class Superclass1
{
	int x=100;
	void display()
	{
		System.out.println("Superclass1 x"+x);
	}
   class Subclass extends Superclass1
   {
	   int x=200;
	   void display()
	   {
		   
		   System.out.println("Subclass x"+x);
	   }
   }
}
   class Main
   {
	public static void main(String[] args) 
	{
		Subclass s2=new Subclass();
		s2.display();

	}
   }


