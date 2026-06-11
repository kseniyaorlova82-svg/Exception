public class MainExceptionTest {
    public static void main(String[] args) {
        int a = 6;
        int b = 0;
        try{
        int c = a/b;
        System.out.println("c = " +c);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("The end");
    }
}
