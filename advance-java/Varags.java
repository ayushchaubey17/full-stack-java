public class Varags {
    public static void main(String[] args) {
        System.out.println(sum(2,3));
    }

    public static  int  sum (int ...a){
        return a[0];
    }
    public static  int  sum (int a, int b,int c){
        return a+b+c;
    }
    public static  int  sum (int a, int b, int d, int c){
        return a+b+c+d;
    }
}
