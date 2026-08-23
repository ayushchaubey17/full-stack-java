/**
 * QUiz
 */
public class QUiz {

    public static void main(String[] args) {
        var message = new Message();
        message.print(5);
    }
}



class Message{

    public void print (Integer number){
        System.out.println("non -primitive"+number);
    }

    public  void print(int number){
        System.out.println("primitive "+ number);
    }
}