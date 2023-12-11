package HW3.fileWrite;

import java.io.IOException;

public class FileWriter {
    public void writeFile(String data, String path) {
            try (java.io.FileWriter fw = new java.io.FileWriter(path, true)) {
                fw.append(data);
                fw.append("\n");
                System.out.println("Создан файл: "+ path);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
