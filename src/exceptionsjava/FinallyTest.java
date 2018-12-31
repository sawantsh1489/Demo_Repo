package exceptionsjava;
/**
 *  A finally block of code always executes whether or not exception has occurred. 
 *  A finally block appears at the end of catch block.
 */

public class FinallyTest {
	public static void main(String[] args)
	 {
	  int a[]= new int[2];
	  System.out.println("out of try");
	  try 
	  {
	   System.out.println("Access invalid element"+ a[3]);
	   /* the above statement will throw ArrayIndexOutOfBoundException */
	  }
	  finally 
	  {
	   System.out.println("finally is always executed.");
	  }
	 }

}
