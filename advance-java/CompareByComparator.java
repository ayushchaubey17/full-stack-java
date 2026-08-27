import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * CompareByComparator
 */
public class CompareByComparator {

    public static void main(String[] args) {

        // Comparator<Student> comparator = new Comparator<>() {

        // @Override
        // public int compare(Student a , Student b){

        // return a.age>b.age ?1 : -1;
        // }

        // };

        Comparator<Student> comparator = (a,  b) ->  a.age > b.age ? 1 : -1;
            

    

        List<Student> list = new ArrayList<>();

        list.add(new Student(12, "eyush"));
        list.add(new Student(7, "cyush"));
        list.add(new Student(19, "byush"));
        list.add(new Student(22, "dayush"));
        list.add(new Student(5, "ayush"));

        System.out.println(list);
        Collections.sort(list, comparator);

        System.out.println(list);

    }

}

/**
 * S
 */
class Student {

    int age;
    private String name;

    public Student(int age, String name) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {

        return this.name + " :" + this.age;
    }

}