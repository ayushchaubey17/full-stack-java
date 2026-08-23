/**
 * LambdaExpression
 */
public class LambdaExpression {

    public static void main(String[] args) {
       A obj = () ->   System.out.println("hello");


        obj.show();


        }


       
    }


@FunctionalInterface
interface A{

    void show();
}