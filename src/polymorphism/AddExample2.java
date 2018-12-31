package polymorphism;

public class AddExample2 {

	void add(int num1, int num2){
        System.out.println(num1 + num2);
  }     

 
  void add(int num1, int num2, int num3){
        System.out.println(num1 + num2 + num3);
  }           

  public static void main(String args[]){
        //creating object here
        AddExample2 addExample = new AddExample2();
        //method call
        addExample.add(10, 20);
        addExample.add(20, 30, 40);
  }
}
