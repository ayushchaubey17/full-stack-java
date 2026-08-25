import java.util.ArrayList;
import java.util.Iterator;

/**
 * GenericArrayList
 */
public class GenericArrayList {


    public static void main(String[] args) {
 
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(23);
        al.add(34);


             for (var integer : al)
             {
            System.out.print(integer+" ");
           
             }

        
    }
}