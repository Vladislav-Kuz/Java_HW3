package HW3.exceptions;

public class TextException extends Exception{
    public TextException() {
    }

    public void textException(String data) {
        System.out.println("Некорректный формат ввода текста");
        System.out.printf("Вы ввели: %s", data);
        System.out.println();
    }
}
