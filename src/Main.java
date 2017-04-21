import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String line = in.readLine();
        String line2 = in.readLine();

        for (int i = 0; i <= line.length(); i++) {

            String newName = line2.substring(0,i) +" "+line.substring(i);
            System.out.println(newName);
        }

        in.close();
    }
}