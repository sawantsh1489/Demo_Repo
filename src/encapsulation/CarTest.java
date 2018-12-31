package encapsulation;

public class CarTest {
	 public static void main(String args[]){
         //create Car class object
         EncapCar car1 = new EncapCar();          

         //set car details.
         car1.setColor("white");
         car1.setSpeed(120);           

         //get and print car details.
         System.out.println("Car color: " + car1.getColor());
         System.out.println("Car speed: " + car1.getSpeed());
   }
}
