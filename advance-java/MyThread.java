/**
 * MyThread
 */
public class MyThread {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread());

        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}

class A  extends Thread{
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("a");
        }
    }
}

class B extends Thread{
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("b");
        }
    }
}