import java.util.*;
/**
 * OptionalClass
 */
public class OptionalClass {

    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("ayuh","mohan", "rohan","anita");


        String name = list.stream().filter(n -> n.contains("s")).findFirst().orElse("not got");
        // Optional<String> name = list.stream().filter(n -> n.contains("s")).findFirst();

        // System.out.println(name.orElse("not found"));
        System.out.println(name);
    }
}