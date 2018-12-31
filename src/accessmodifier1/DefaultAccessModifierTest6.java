package accessmodifier1;

public class DefaultAccessModifierTest6 {
	
	 public static void main(String args[]){
         //creating Student class object
         Student5 obj = new Student5();

         //No compile time error because members of the class
         //of a class can be accessed in that package but can't be
         //accessed outside the package.
         System.out.println(obj.rollNo);
         obj.showRollNo();
   }

}
