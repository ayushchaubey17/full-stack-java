interface P {
    int add(int a , int b);
}


/**
 * InterfaceAndItsType
 */
public class InterfaceAndItsType {

    
    public static void main(String[] args) {
        P obj = (a,b)-> (a+b);

        System.out.println(obj.add(3, 120));
    }
}