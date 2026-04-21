import java.io.*;

// Student class
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Main class
public class serialize_Input{
    public static void main(String args[]) throws Exception {

        Student s1 = new Student(1, "Deepak");

        FileOutputStream fos = new FileOutputStream("file.txt");

        // Convert data to string
        String data = s1.id + " " + s1.name;

        // Convert string to bytes and write
        fos.write(data.getBytes());

        fos.close();

        System.out.println("Data written successfully");
    }
}