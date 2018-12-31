package polymorphismoverriding;


 
public class CollegeStudent2 extends Student1 {
      /**
       * This method is used to show details of a college student.
       */
      protected void show(){//compile-time error
            System.out.println("College Student details.");
      }
 
      //main method
      public static void main(String args[]){
       CollegeStudent2 obj = new CollegeStudent2();
       //subclass overrides super class method
       //hence method of CollegeStudant class will be called.
       obj.show();
      }
}