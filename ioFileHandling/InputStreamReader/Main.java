package ioFileHandling.InputStreamReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStreamReader isr=new InputStreamReader(System.in);
        try {
            int val=isr.read();
            while(isr.ready()){
                System.out.println((char)val);
                val=isr.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
