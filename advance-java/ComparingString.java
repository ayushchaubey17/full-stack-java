import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ComparingString
 */
public class ComparingString {

    public static void main(String[] args) {

        Integer

        Comparator<String> comparator = new Comparator<>() {
            
            @Override
            public int compare(String s1, String s2){
                return s1.length()>s2.length()?1:-1;

            }
        };
        List <String> list = new ArrayList<>();
        list.add("ayush");
        list.add("bysh");
        list.add("cyush");
        list.add("aysfsfssh");
        list.add("myush");



        System.out.println(list);


        Collections.sort(list,comparator);

        System.out.println(list);
    }
}