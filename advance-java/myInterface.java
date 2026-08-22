public class myInterface {

    public static void main(String[] args) {
        Gps moto = new Mobile();
        moto.getLocation();
    }
     
}


interface Gps{
  
     public static final int MAX_RANGE_IN_METER = 10;

    void getLocation();
    String isLocationAvailable();
}


class Mobile implements Gps{
    @Override
    public void getLocation(){
        System.out.println( " this is your location "+ Gps.MAX_RANGE_IN_METER);
    }


    @Override
    public String isLocationAvailable(){
        return "yes";
    }
}