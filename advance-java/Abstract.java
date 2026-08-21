/**
 * Abstract
 */
public class Abstract {
public static void main(String[] args) {
    
    Car obj = new Car() {
        @Override
        public void drive(){
            System.out.println("driving by mahendra");
        }

    };

    obj.drive();
    obj.playMusic();

    
}
    
}


abstract class Car{
    public abstract void drive();

    public void playMusic(){
        System.out.println("playing music");
    }
}

class Kia extends Car{
    @Override
    public void drive(){
        System.out.println("auto driving by kia");
    }

}