package HW3.exceptions;

public class DateException extends Exception {
    public DateException() {
    }

    public void dateException(String data) {
        System.out.println("Некорректный формат даты");
        System.out.printf("Вместо 'дд.мм.гггг' вы ввели: %s", data);
        System.out.println();
    }
}
