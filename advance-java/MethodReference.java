import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * MethodReference
 */
public class MethodReference {

    public static void main(String[] args) {
        List<String>  names =  Arrays.asList("mohan","sohan","suresh","Mahesh");

        Stream stream = names.stream().map(String::toUpperCase);

        stream.forEach(System.out::println);


        
    }
}