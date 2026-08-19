public class AnonymousClassAndObject {

    public static void main(String[] args) {
        new Payment().pay();;   //Anonymous object


        // its Anonymous clas 
        Payment ePayment = new Payment(){
            @Override
            public void pay(){
                System.out.println("its online");
            }
        };


        ePayment.pay();
    }
}



class Payment{
    int amount;


    public Payment(){
        System.out.println("for payment");
    }

    public void pay()
    {
        System.out.println("paid by cash");
    }
}