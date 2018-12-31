package inheritance;

public class CollegeStudent2 extends Student1 {
    String className = "MCA";     
    
    /**
     * This method is used to show details of a student.
     
     */
    public void showDetail(){
       System.out.println("Student name = " + name);
       System.out.println("Student class name = " + className);
    }     

    public static void main(String args[]){
     //creating subclass object  
    	CollegeStudent2 obj = new CollegeStudent2();

     //method call
     obj.showDetail();
    }
}


