package javabasics.java;

public class Overload
{
	
int add(int a,int b)

	{
		int ans=a+b;
		System.out.println("Result="+ans);
	}
int add(int a,int b,int c)

	{
		int ans=a+b+c;
		System.out.println("Result="+ans);
	}
	public class Demo
	{
		public static void main(String[]args)
		{
			Overload obj1=new Overload();
			obj1.add(10,20,30);
		}
}
}

