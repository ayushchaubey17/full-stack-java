/**
 * MyThread
 */
public class MyThread {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread());

        A a = new A();
        B b = new B();

        a.setPriority(10);

        System.out.println(a.getPriority());  //5 default
        System.out.println(b.getPriority());  //5 by

        a.start();
        b.start();
    }
}

class A  extends Thread{
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("a");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("b");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}