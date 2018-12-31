package abstraction;

public class AbstractClassExampleTest2 {
	
	  public static void main(String args[]){
          //GraphicObjects is the super class
          //hence it's reference can contain subclass object.
          GraphicObjects obj = new Circle();
          obj.showShape();
          obj.area(250);                               

          //call static method and variable with class name.
          GraphicObjects.displayGraphicObjects();
          System.out.println("static variable = "
           + GraphicObjects.str1);
     }           
}


