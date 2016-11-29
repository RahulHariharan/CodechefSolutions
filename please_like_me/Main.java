import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int testCases = Integer.valueOf(reader.readLine());
            while (testCases-- > 0) {
                String[] input = reader.readLine().split(" ");
                long l = Integer.valueOf(input[0]);
                long d = Integer.valueOf(input[1]);
                long s = Integer.valueOf(input[2]);
                long c = Integer.valueOf(input[3]);

                int days = 0;
                while (days < d - 1) {
                    s = s + (c * s);
                    days++;
                    if(s >= l){
                        break;
                    }
                }

                if (s >= l) {
                    System.out.println("ALIVE AND KICKING");
                } else {
                    System.out.println("DEAD AND ROTTING");
                }

            }
            reader.close();
        } catch (Exception exception) {

        }
    }
}
