package casting;

/**
 * Cast
 */
public class Cast {

    public static void main(String[] args) {
        

        Father father  =(Father) new Son();


       father = new Father();








    }
}


 class Father {

    public void show(){
        System.out.println("father is showing his skill");
    }
    
}


class Son  extends Father{

    @Override
 public void show(){
    // super.show();
    System.out.println("now the sun is showing his skills");
 }

}