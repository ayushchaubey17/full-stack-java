/**
 * MultiThreadingUsingRunnable
 */
public class MultiThreadingUsingRunnable {

    public static void main(String[] args) {
        Runnable a = new A();
        Runnable b = new B();

        Thread first = new Thread(a);
        Thread second = new Thread(b);

        first.start();
        second.start();
    }
    
}


class A implements Runnable{
    @Override
    public void run(){

        for (int i = 0; i < 100; i++) {
            System.out.println("A");
        }
    }

}

class B implements Runnable{
    @Override
    public void run(){

        for (int i = 0; i < 100; i++) {
            System.out.println("B");
        }
    }

}