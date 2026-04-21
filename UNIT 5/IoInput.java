import java.io.FileInputStream;
import java.io.IOException;

class IoInput {
    public static void main(String[] args) throws IOException {
        
            // Make sure file.txt is in the same folder
            FileInputStream fi = new FileInputStream("file.txt");

            int x;
            while ((x = fi.read()) != -1) {   // read till end of file
                System.out.print((char) x);   // print character
            }

            fi.close();   // close file after reading

        } 
    }
