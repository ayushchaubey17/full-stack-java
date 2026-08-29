import java.util.*;
import java.util.stream.Stream;

/**
 * ParallelStream
 */
public class ParallelStream {

    public static void main(String[] args) {




        int size = 10_000;
        List<Integer> list = new ArrayList<>(size);
     
        Random random = new Random();
        for (int i = 0; i < size; i++) 
            list.add(random.nextInt(100));


        long t1 = System.currentTimeMillis();

        var sum1  = list.stream().map(n->
            {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                return n*2;
            }
        ).reduce(0,(c,e)->c+e);

        long t2 = System.currentTimeMillis();
        var sum2 = list.parallelStream().map(n-> {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                // TODO: handle exception
            }
            return n*2;
        }).reduce(0, (a,b)-> a+b);

        long t3 = System.currentTimeMillis();

        System.out.println("a: "+ sum1+"  b: "+sum2);

        long t4 = System.currentTimeMillis();

        

        System.out.println(t2-t1+" :"+(t4-t3));

    }
}