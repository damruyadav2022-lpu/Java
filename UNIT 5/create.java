import java.io.*;

class create{
    public static void main(String[] args) throws IOException {
        File f = new File("java.txt");
        f.createNewFile();
        System.out.println("File created Successfully");

        FileWriter f1 = new FileWriter("java.txt");
        f1.write("I am Deepak studying in LPU");
        System.err.println("Successfully written");
        f1.close();
    }
}