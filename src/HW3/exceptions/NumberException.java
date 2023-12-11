package HW3.exceptions;

public class NumberException extends Exception {
    public void numberException(String data) {
        System.out.println("Некорректный ввод цифр");
        System.out.printf("Вместо цифр введено: %s", data);
        System.out.println();
    }
}
