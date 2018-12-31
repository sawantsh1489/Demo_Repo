package polymorphism;

public class AddExample1 {

	void add(int var1, int var2){
        System.out.println(var1 + var2);
  }     

  
  void add(double var1, int var2){
        System.out.println(var1 + var2);
  }     


  void add(String var1, String var2){
        System.out.println(var1 + var2);
  }     

  public static void main(String args[]){
        //creating object here
        AddExample1 addExample = new AddExample1();
        //method call
        addExample.add(10, 20);
        addExample.add(12.50, 30);
        addExample.add("hello ", "java.");
  }
}
