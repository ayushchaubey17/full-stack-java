public class MyClassLoader {
    public static void main(String[] args) {
        ClassLoader classLoader = MyClassLoader.class.getClassLoader();

        System.out.println(MyClassLoader.class.getName());
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
    
}
