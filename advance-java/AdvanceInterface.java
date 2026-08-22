/**
 * AdvanceInterface
 */
public class AdvanceInterface {
    public static void main(String[] args) {

    }

}

interface Payment {
    int MAX_RETURN_TIME = 7;

    void pay();

    default void refund() {
        System.out.println("your payment is refunded" + returnDate());
    }

    private int returnDate() {
        return MAX_RETURN_TIME;
    }


    public static String getTermsAndCndition(){
       return " read all convenience fee before paying";
    }
}

class Upi implements Payment {
    @Override
    public void pay() {
        System.out.println("use any upi app to pay");
    }
}

class Card implements Payment {
    @Override
    public void pay() {
        System.out.println("use credit or debit card to pay ");
    }
}