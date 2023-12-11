package HW3.exceptions;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Некорректный ввод пола");
        System.out.printf("Вместо 'm' или 'f' вы ввели: %s", i);
        System.out.println();
    }
}
