package HW3.fileWrite;

public class FileNameCreator {
    public String setFileName(StringBuilder sb) {
        String[] arr = sb.toString().split(" ");
        return arr[0] + ".txt";
    }
}
