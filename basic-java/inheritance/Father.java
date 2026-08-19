package inheritance;

 /**
  * Father
  */
  public class Father extends GrandFather {
   public Father(){
    // super(20);
    this(20);
    
        System.out.println(" that father legacy");
    }


    public Father(int a){
        super(12);
        System.out.println("ye le 1000");
    }
 
    @Override
  public  void cook(){
      System.out.println( " using lpg gas");
    }
    
 }