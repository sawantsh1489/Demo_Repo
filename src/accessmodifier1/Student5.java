package accessmodifier1;

/**
 * Classes, data members, methods and constructors that are not declared with any access modifier are treated as default. 
 * They can be accessed into all classes within the same package only.
 *
 */
public class Student5 {
	
	 //private members of the class
    int rollNo = 5;

    void showRollNo(){
         System.out.println("RollNo = " + rollNo);
    }

}
