package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    public String fileName;
    public ArrayList<WordPair> wordPairList;

    public FileHandler() {
        this.fileName = "szotar.txt";
        this.wordPairList = new ArrayList<>();
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
        Scanner scanner = new Scanner(file,"utf-8");
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] lineArray = line.split(":");
            WordPair wordPair = new WordPair(lineArray[0], lineArray[1]);
            this.wordPairList.add(wordPair);
            // System.out.println(line);
        }

        scanner.close();
    }
}
