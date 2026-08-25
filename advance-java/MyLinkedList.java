import java.util.LinkedList;
import java.util.List;

/**
 * MyLinkedList
 */
public class MyLinkedList {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(23);
        list.add(23);
        list.add(34);


        System.out.println(list);
    }
}