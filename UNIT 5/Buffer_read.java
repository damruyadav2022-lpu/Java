import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Buffer_read {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("java.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}