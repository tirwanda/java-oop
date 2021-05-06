package practice.java.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
//        BufferedReader reader = null;
//
//        try{
//            reader = new BufferedReader(
//                    new FileReader("Readme.md")
//            );
//
//            while(true) {
//                String line = reader.readLine();
//                if(line == null) {
//                    break;
//                }
//                System.out.println(line);
//            }
//
//        } catch (Throwable throwable) {
//            System.out.println("Error Reading File " + throwable.getMessage());
//        } finally {
//            if(reader != null) {
//                try {
//                    reader.close();
//                    System.out.println("Success Closing File");
//                } catch (IOException exception) {
//                    System.out.println("Error closing resource: " + exception.getMessage());
//                }
//            }
//        }

        try(BufferedReader reader = new BufferedReader(new FileReader("Readme.md"))) {
            while (true) {
                String line = reader.readLine();
                if(line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error Reading a File " + throwable.getMessage());
        }
    }
}
