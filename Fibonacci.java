package homework6;

public class Fibonacci {

	public static int fib(int n) {
		   if(n == 0)
			   return 0;
		   else if(n == 1)
			   return 1;
		   else
			   return fib(n - 2) + fib(n - 1);
	   }   
	
	public static void main(String[] args) {
		   for(int i = 0; true; i++) {
			   int fn = fib(i);
			   if(fn > 100)
				   break;
			   System.out.println(fn);
		   }
	
	   }     
}