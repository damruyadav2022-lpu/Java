//package UNIT 5;
import java.util.*;
import java.io.*;

public class FileCreate {
    public static void main(String args[]) throws IOException {
        File f = new File("f1.txt");
        
        if (f.createNewFile()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }
    }
}
