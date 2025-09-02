package FileHandling.Reader.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {


//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//            System.out.println(br.readLine());
//
//
//        }
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){

            while(br.ready()){
                System.out.println(br.readLine());
            }


        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
