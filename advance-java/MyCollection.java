import java.util.ArrayList;
import java.util.Collection;

/**
 * MyCollection
 */
public class MyCollection {

    public static void main(String[] args) {
        

        Collection collection = new ArrayList<>();
        collection.add(51);
        collection.add(52);
        collection.add(53);
        collection.add(54);
        collection.add(55);

        System.out.println(collection);

        for (Object object : collection) {
            System.out.print(object+"--->");
        }
    }
}