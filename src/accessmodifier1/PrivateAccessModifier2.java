package accessmodifier1;

public class PrivateAccessModifier2 {

	 public static void main(String args[]){
         //creating Student class object
         Student1 obj = new Student1();

         //compile time error because private members
         //of a class can be accessed in that class only.
         System.out.println(obj.rollNo);

         obj.showRollNo();
  }
}package accessmodifier1;

public class PrivateAccessModifier2 {

}
