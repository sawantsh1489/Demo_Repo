package polymorphismoverriding;

public class CollegeStudent3  extends Student1 {
    /**
     * This method is used to show details of a college student.
     */
    public void show(){
          System.out.println("College Student details.");
    }

    //main method
    public static void main(String args[]){
     //Super class can contain subclass object.   
     Student1 obj = new CollegeStudent3();

     //method call resolved at runtime
     obj.show();
    }
}

