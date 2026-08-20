/**
 * ObjectConcept
 */
public class ObjectConcept extends Object{

    public static void main(String[] args) {
        Bike  r15 = new Bike();
        System.out.println(r15.toString());

        Bike r2 = new Bike();
        System.out.println(r2);

        System.out.println(r15.equals(r2));

    }
    
}



class Bike{
    String model = "kia" ;
    int wheels = 3;


    
    public String toString(){
        return "the car having model "+this.model + ", having wheels "+this.wheels +".";
    }


    public boolean equals(Bike obj){
        return  (obj.wheels == this.wheels && obj.model.equals(this.model));
    }

}