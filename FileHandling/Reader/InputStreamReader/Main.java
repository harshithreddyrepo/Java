package FileHandling.Reader.InputStreamReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        System.out.println("Enter some text:");
        int letter;
        System.out.println("after invoking the read() method");
        while(isr.ready()){
            letter=isr.read();
            System.out.println((char)letter);
        }

        isr.close();
    }
}
