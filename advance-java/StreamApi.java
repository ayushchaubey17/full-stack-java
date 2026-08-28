import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
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
        

        Predicate<Integer> predicate = new Predicate<>() {
            @Override
            public boolean test(Integer n){

                return n%2 ==0;
            }
            
        };
        Stream<Integer> stream = list.stream();
        Stream<Integer> stream2 = stream.filter(predicate);
        // Stream<Integer> stream2 = stream.filter(n -> n%2 == 0);



        // list.stream().filter(n -> n%2 != 0 ).forEach(n -> System.out.println(n));


        // BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>(){

        //     @Override

        //     public Integer apply(Integer integer1 ,Integer integer2){
        //         return integer1+integer2;
        //     }

        // }



        System.out.println(
            list.stream()
            .filter(n -> n%2==0)
            .map(n-> 2*n)
            .reduce(0,(a,b)->a+b)
        );



        // System.out.println(stream);

        // stream2.forEach(el-> System.out.print(el+" "));



        // Consumer<Integer> consumer = i ->   System.out.println(i);
            
            
        
        
        // Consumer<Integer> consumer = new Consumer<>() {

        //     @Override
        //     public void accept(Integer i){
        //         System.out.println(i);
        //     }
            
        // };

        // list.forEach(n -> System.out.println(n));


    }
}