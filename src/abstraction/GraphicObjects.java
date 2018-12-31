package abstraction;

abstract class GraphicObjects { 
	// abstract method declaration
	abstract void showShape();

	int var1 = 50;

	// static data member
	static String str1 = "www.google.com";

	// abstract method declaration

	// non abstract, non static method
	/**
	 * @param area
	 */
	void area(int area) {
		System.out.println("Area = " + area);
	}

	// non abstract, static method
	/**
	 * 
	 */
	static void displayGraphicObjects() {
		System.out.println("Graphic objects.");
	}
}
