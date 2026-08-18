public class Encapsulation{

public static void main(String[] args) {
    Car  car = new Car();
    car.setWheels(5);
    // car.setWheels(5,car);
    System.out.println(car.getWheels());
}
}



class Car{

   private int wheels;
   private String model;

    public void setWheels(int wheels ){
        this.wheels = wheels;
    }
    

    public int getWheels(){
        return wheels;
    }

}