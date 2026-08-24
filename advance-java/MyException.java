
/**
 * MyException
 */
public class MyException {

    public static void main(String[] args) {

        int a = 20;
        int b = 0;

        try {
            if (b==0) {
                
            throw new ArithmeticException("can not able to divide");
            // throw new AyushException("df");
            }
            System.out.println(a / b);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            // TODO: handle exception
        } catch (ArithmeticException e) {
            System.out.println("its arithmetic exception");
        }

        catch (Exception e) {
            System.out.println("unknown exception");
        }

        System.out.println("jitdf");
    }
}


