package exceptionsjava;

public class ExceptionDemo4 {
	
	public static void main(String args[])
	   {
	      try{
		 String str="easysteps2buildwebsite";
		 System.out.println(str.length());;
		 char c = str.charAt(40);
		 System.out.println(c);
	      }catch(StringIndexOutOfBoundsException e){
		  System.out.println("StringIndexOutOfBoundsException!!  occured");
	       }
	   }

}
