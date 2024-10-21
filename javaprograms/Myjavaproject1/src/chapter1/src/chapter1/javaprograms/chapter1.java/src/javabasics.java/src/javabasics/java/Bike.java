package javabasics.java;

public class Bike 
{
 void run()
 {
	 System.out.println("running");
 }
 class Platina extends Bike
 {
	 void run()
	 {
		 System.out.println("running safely with 80 km ");
	 }
	 
 }
	public static void main(String[] args) 
	{
		Bike b=new Bike();
		b.run();

	}

}
