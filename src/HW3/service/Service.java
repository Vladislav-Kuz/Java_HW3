package HW3.service;

import HW3.fileWrite.FileNameCreator;
import HW3.fileWrite.FileWriter;
import HW3.input.DataInput;
import HW3.parser.ParseInputData;

public class Service {
    private DataInput dataInput;
    private ParseInputData parseInputData;
    private FileNameCreator filename;
    private FileWriter fileWriter;

    public Service() {
        this.dataInput = new DataInput();
        this.parseInputData = new ParseInputData();
        this.filename = new FileNameCreator();
        this.fileWriter = new FileWriter();
    }

    public void operations() {
        String[] data = dataInput.enterData();
        if (parseInputData.parseInputData(data)) {
            StringBuilder outData = parseInputData.getSb();
            String filePath = filename.setFileName(outData);
            fileWriter.writeFile(outData.toString(), filePath);
        }
    }
    public void printer(){
        if(!parseInputData.getSb().toString().isEmpty()){
        System.out.println("Введена запись: " + parseInputData.getSb().toString());
        }
        else System.out.println();
    }
}
