package HW3.parser;

import HW3.exceptions.DateException;
import HW3.exceptions.NumberException;
import HW3.exceptions.SexException;
import HW3.exceptions.TextException;

import java.time.LocalDate;

public class ParseInputData {
    private StringBuilder sb;
    private String lastname;
    private String name;
    private String patronomic;
    private String date;
    private String phone;
    private String sex;
    private boolean flag = true;

    public boolean parseInputData(String[] data) {
        sb = new StringBuilder();
        if (data[0].matches("[A-Za-z]+") || data[0].matches("[А-Яа-я]+")) {
            lastname = data[0];
        } else {
            try {
                throw new TextException();
            } catch (TextException e) {
                e.textException(data[0]);
            }
        }
        if (data[1].matches("[A-Za-z]+") || data[1].matches("[А-Яа-я]+")) {
            name = data[1];
        } else {
            try {
                throw new TextException();
            } catch (TextException e) {
                e.textException(data[1]);
            }
        }
        if (data[2].matches("[A-Za-z]+") || data[2].matches("[А-Яа-я]+")) {
            patronomic = data[2];
        } else {
            try {
                throw new TextException();
            } catch (TextException e) {
                e.textException(data[2]);
            }
        }

        if (data[3].matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
            String[] arrayDate = data[3].split("\\.");
            if (Integer.parseInt(arrayDate[0]) <= 0 || Integer.parseInt(arrayDate[0]) > 31 || Integer.parseInt(arrayDate[1]) <= 0 ||
                    Integer.parseInt(arrayDate[1]) > 12 || Integer.parseInt(arrayDate[2]) <= 0 ||
                    Integer.parseInt(arrayDate[2]) > LocalDate.now().getYear()) {
            } else flag = false;
        }
        if (!flag) {
            date = data[3];
        } else {
            try {
                throw new DateException();
            } catch (DateException e) {
                e.dateException(data[3]);
            }
        }

        if (data[4].matches("[0-9]+")) {
            long number = Long.parseLong(data[4]);
            phone = Long.toString(number);
        } else {
            try {
                throw new NumberException();
            } catch (NumberException e) {
                e.numberException(data[4]);
            }
        }
        if (data[5].length() == 1 & (data[5].equals("f") || data[5].equals("m"))) {
            sex = data[5];
        } else try {
            throw new SexException();
        } catch (SexException e) {
            e.sexException(data[5]);
        }

        if (lastname != null & name != null & patronomic != null & date != null & phone != null & sex != null) {
            sb.append(
                    lastname + " "
                    + name + " "
                    + patronomic + " "
                    + date + " "
                    + phone + " "
                    + sex
                    + "\n");
            return true;
        }
        else return false;
    }

    public StringBuilder getSb() {
        return sb;
    }
}
