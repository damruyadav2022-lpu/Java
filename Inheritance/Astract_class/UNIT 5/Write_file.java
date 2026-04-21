import java.io.*;
import java.util.*;
public class Write_file {
    public static void main(String args[])throws IOException{
        FileWriter fw = new FileWriter("l1.txt");
        fw.write("MY name is Deepak Kumar\n I am studying in LPU");
        fw.close();
        System.out.println("File written Successfully" );
    

    }
}
