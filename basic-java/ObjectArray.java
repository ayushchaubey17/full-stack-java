public class ObjectArray{
    public static void main(String[] ayush)
    {

        Student Student1 = new Student();
        Student1.roll = 12;

        Student []students  = new Student[3];

        students[0] = Student1;


int arr [] = new int[5];
arr[0] = arr[2] = 5;

for(int el :arr)System.out.print(el+"->");

System.out.println(arr.length);

        System.out.println(students[0].roll);

    }
}


class Student{
    int marks;
    String name;
    int roll;
}