package polymorphismoverriding;

public class CollegeStudent1 extends Student1 {
	
	 int maxRollNo = 2000;
	/**
     * This method is used to show details of a college student.
     */
  /*  public void show(){
          System.out.println("College Student details.");
    }*/

    //main method
    public static void main(String args[]){
    	CollegeStudent1 obj = new CollegeStudent1();
     //subclass overrides super class method
     //hence method of CollegeStudent class will be called.
     obj.show();
    }
}


