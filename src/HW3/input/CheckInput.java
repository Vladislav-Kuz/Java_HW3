package HW3.input;

import HW3.exceptions.CheckLengthException;

public class CheckInput {

    public boolean checkDataLength(String data) {
        String[] outData = data.split(" ");
        if (outData.length == 6) {
            return false;
        } else if (outData.length < 6) {
            CheckLengthException.checkLengthException("Вы ввели не все данные");
            return true;
        } else {
            CheckLengthException.checkLengthException("Вы ввели слишком много полей");
            return true;
        }
    }
}