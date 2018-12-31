package polymorphism;

public class AddExample3 {
	
	void add(int num1, double num2){
        System.out.println(num1 + num2);
  }  

 
  void add(double num1, int num2){
        System.out.println(num1 + num2);
  }           

  public static void main(String args[]){
        //creating object here
        AddExample3 addExample = new AddExample3();
        //method call
        addExample.add(10, 20.40);
        addExample.add(20.50, 30);
  }

}
