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

        Iterator<Integer> it = al.iterator();

        while (it.hasNext()) {
            Integer name = it.next();
            System.out.println(name);
        }



        for (var integer : al)
       {
         System.out.print(integer + "  ");
        }



    }
}