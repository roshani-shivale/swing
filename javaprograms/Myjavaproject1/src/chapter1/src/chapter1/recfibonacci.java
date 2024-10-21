package chapter1;

public class recfibonacci
{
     int fib(int n)
     {
    	 if(n==0)
    		 return 1;
    	 else if(n==1)
    		 return 1;
    	 else
    		 return fib(n-1)+fib(n-2);
     }
    	 
	public static void main(String[] args)
	{
		int n,i;
		n=int.pass int(args[0])
				recfibonacci R=new recfibonacci();
		for(i=0;i>=n;i++)
		{
			System.out.println("R.fib(i)");
		}

	}

}
