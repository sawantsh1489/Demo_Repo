package finaltest;

/**
 * This program is used to show that the value of 
 * final variable can't be change. 
 */

public class Final1 {
	//final variable
	 final int num = 100;
	 
	 //method for try to change the value of final variable.
	 public void show(){
	  //error because value of final variable can't be change.
	  num = 200;
	  System.out.println("Num = " + num);
	 }
	 
	

}
