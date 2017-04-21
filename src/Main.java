import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter two equal length strings: ");
        String line1 = in.readLine();
        String line2 = in.readLine();

        if (line1.length() != line2.length()) {
            System.out.println("Strings are not equal in length! Please enter the strings again.");
            line1 = in.readLine();
            line2 = in.readLine();
        }

        for (int i = 0; i <= line1.length(); i++) {

            String newName = line2.substring(0, i) + " " + line1.substring(i);
            System.out.println(newName);
        }

        in.close();
    }
}