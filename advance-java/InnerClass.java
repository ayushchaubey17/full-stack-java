/**
 * InnerClass
 */
public class InnerClass {
public static void main(String[] args) {
    Temp obj = new Temp();
    obj.showAge();


    Temp.InnerInnerClass obj2 = obj.new InnerInnerClass();
    obj2.showAInner();
}



}


 class Temp {

    private int age;


    public void showAge(){
        System.out.println("your age is "+this.age);
    }

   class InnerInnerClass {
    
      public void showAInner(){
        System.out.println("its inner ");
      }
        
    }
    
}