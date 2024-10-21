package javabasics.java;

public class constructor 
{
   int num;
   constructor()
   {
	   num=10;
   }
   constructor(int a)
   {
	   num=a;
   }
   void display()
   {
	   System.out.println("num="+num);
   }
   public class cdemo
   {
	   public static void main(String[]args)
	   {
		  constructor obj1=new constructor();
		  constructor obj2=new constructor(56);
		  obj1.display();
		  obj2.display();
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
