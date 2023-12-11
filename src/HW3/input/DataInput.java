package HW3.input;
import java.util.Scanner;

public class DataInput {
    private Scanner scanner;
    private boolean flag;
    private String data;
    private CheckInput checkInput;
    public DataInput() {
        this.scanner = new Scanner(System.in);
        this.checkInput = new CheckInput();
        this.flag=true;
        this.data = null;
    }

    public String[] enterData() {
            while (flag) {
                System.out.println("Введите через пробел: Ф.И.О (Ф И О), дату рождения (дд.мм.гггг), номер телефона, пол (m/f): ");
                try {
                    data = scanner.nextLine();
                    flag = checkInput.checkDataLength(data);
                }catch(Exception e) {
                    data = scanner.nextLine();
                }
            }
            return data.split(" ");
        }
    }