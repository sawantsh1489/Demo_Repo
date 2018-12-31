package abstraction;

public class AbstractClassExampleTest1 {

	public static void main(String args[]) {
		// GraphicObjects is the super class
		// hence it's reference can contain subclass object.
		GraphicObjects obj = new Circle();
		obj.showShape();
		obj = new Rectangle();
		obj.showShape();
		//obj = new Triangle();
		//obj.showShape();
	}

}
