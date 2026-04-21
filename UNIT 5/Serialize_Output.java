import java.io.*;

// Student class
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Main class
public class Serialize_Output {
    public static void main(String args[]) throws Exception {

        Student s1 = new Student(1, "Deepak");

        FileOutputStream fos = new FileOutputStream("file.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Writing object
        oos.writeObject(s1);

        // Closing streams
        oos.close();
        fos.close();

        System.out.println("Object serialized successfully");
    }
}