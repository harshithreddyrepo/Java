package FileHandling.Reader.FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File f = new File("file.txt");

        if(!f.exists()){
            f.createNewFile();
        }
        try(FileReader fr = new FileReader("file.txt")){

            int letter=fr.read();

            while(fr.ready()){
                System.out.println((char) letter);
                letter=fr.read();
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
