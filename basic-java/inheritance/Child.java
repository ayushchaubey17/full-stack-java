 package inheritance;

public class Child extends Father {
 public Child(){
    System.out.println("gen z");
 }


 @Override 
 public void cook(){
    System.out.println("using air frier");
 }
    
}