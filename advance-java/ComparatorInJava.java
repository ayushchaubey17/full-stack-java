import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ComparatorInJava
 */
public class ComparatorInJava {

    public static void main(String[] args) {
        

        Comparator<Integer> comparator = new Comparator<>() {
            
            @Override
            public int compare(Integer i1 , Integer i2){

                if(i1%10 >i2%10){
                    return 1;
                }
                else  return- 1;
            }
        };


        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(20);
        list.add(43);
        list.add(19);
        list.add(27);


        System.out.println("before sorting "+ list);

        Collections.sort(list,comparator);

        System.out.println("after sorting "+ list );
        
    }


    
}