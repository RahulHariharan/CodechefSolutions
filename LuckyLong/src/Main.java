import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.valueOf(reader.readLine());
        while (testcases-- > 0) {
            String number = reader.readLine();
            int count = 0;
            for (int i = 0; i < number.length(); i++) {
                if (!(number.charAt(i) == '4' || number.charAt(i) == '7')) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
