import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close the streams
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
