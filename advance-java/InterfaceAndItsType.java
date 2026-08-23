interface A {
    int add(int a , int b);
}


/**
 * InterfaceAndItsType
 */
public class InterfaceAndItsType {

    
    public static void main(String[] args) {
        A obj = (a,b)-> (a+b);

        System.out.println(obj.add(3, 120));
    }
}