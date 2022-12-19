package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {
    public String fileName;

    public FileHandler() {
        this.fileName = "szotar.txt";
    }

    public void readFile(){
        try{
            tryReadFile();
        }
        catch(FileNotFoundException e){
            System.out.println("Hiba ! A file nem található");
        }
    }

    public void tryReadFile() throws FileNotFoundException{
        File file = new File(this.fileName);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }
}
