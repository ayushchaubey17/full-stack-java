/**
 * ThreadWithRace
 */
public class ThreadWithRace {

    public static void main(String[] args) throws InterruptedException {
        

        Counter c = new Counter();

        Runnable a = ()->{
            for (int i = 0; i < 2000; i++) {
               c.increment();
            }
        };


        Runnable b = ()->{
            for (int i = 0; i < 2000; i++) {
            c.increment();
            // System.out.println(Thread.currentThread());
            }

        };


        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();


        t1.join();
        t2.join();

        // try {
        //     Thread.sleep(100);
        //     // System.out.println(Thread.currentThread());
        // } catch (InterruptedException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        System.out.println(c.count);
    }
}



class Counter{
    int count;

    public synchronized void  increment(){
        count++;
    }
}