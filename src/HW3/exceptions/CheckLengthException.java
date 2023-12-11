package HW3.exceptions;

public class CheckLengthException extends Exception{

    public static void checkLengthException(String message) {
        System.out.println(message);
        System.out.println("Должно быть введено 6 полей");
        System.out.println();
        }
}
