public class Overloading{
 public static  void main(String a[]){
    Calculator obCalculator = new Calculator();
    System.out.println(obCalculator.add(5,6 ));
    System.gc();
 }
}


class Calculator{


    public int add (int a , int b){
        return a+b;
    }
}