import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * StreamApi
 */
public class StreamApi {

    public static void main(String[] args) {
        

        List <Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(1);
        list.add(42);
        list.add(16);
        

        Stream stream = list.stream();

        System.out.println(stream);



        // Consumer<Integer> consumer = i ->   System.out.println(i);
            
            
        
        
        // Consumer<Integer> consumer = new Consumer<>() {

        //     @Override
        //     public void accept(Integer i){
        //         System.out.println(i);
        //     }
            
        // };
        list.forEach(n -> System.out.println(n));


    }
}