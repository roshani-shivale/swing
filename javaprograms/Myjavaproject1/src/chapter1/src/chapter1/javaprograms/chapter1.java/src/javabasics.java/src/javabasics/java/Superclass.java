package javabasics.java;

 class Superclass 
{
	int x;
	Superclass(int m)
	{
		x=m;
	}
class Subclass Extends Superclass
	{
		int y;
		Subclass(int m,int n)
		{
			Super(m);
			y=n;
		}
		void display()
		{
			System.out.println("x="+x "y="+y);
		}
	}
public class Demo
{
   public static void main(String[] args) 
   {
		Subclass obj1=new Subclass(10,20);
		obj1.display();

	}
}
}
