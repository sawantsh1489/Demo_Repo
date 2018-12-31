package inheritance;

public class McaStudent3 extends CollegeStudent2{
    String semester = "3rd sem.";
    
    /**
     * This method is used to show details of a student.
     
     */
    public void showDetail(){
       System.out.println("Student name = " + name);
       System.out.println("Student class name = " + className);
       System.out.println("Student semester = " + semester);
    }
}


