public class Demo{
    public static void main(String[] args) {
      String str =  playMusic(); 
      System.out.println(str);


      Computer obj = new Computer();
      obj.getMyPain();
    }




    public static String playMusic(){
        return "Your music is  playing";
    }
}

 class  Computer  {


    public void getMyPain()
    {
        System.out.println("its your pen");
    }
    
}