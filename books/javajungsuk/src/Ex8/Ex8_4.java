package Ex8;

public class Ex8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(args[0]);
            System.out.println(4);
        } catch (ArithmeticException ae){
            if (ae instanceof ArithmeticException)
                System.out.println("true");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println(6);
    }
}
