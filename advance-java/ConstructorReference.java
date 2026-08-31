import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ConstructorReference
 */
public class ConstructorReference {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("ayush","piyush","priti");
        List<Student> students = new ArrayList<>();


        // for(String name:names) students.add(new Student(name));

        // students.forEach(System.out::println);


        names.stream().map(Student::new).forEach(System.out::println);
        names.stream().map(name-> new Student(name)).forEach(System.out::println);



    }
}

class Student {

    private int age;
    private String name;

    public Student(){

    }

    public Student(String name) {this.name = name;}

    public Student(String name , int age){
        this.name = name ;
         this.age = age;
    }
    @Override 
    public String toString(){
        return this.name+" :"+this.age;
    }

    
}