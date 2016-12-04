import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.valueOf(reader.readLine());
        while (testCases-- > 0) {
            int matches = Integer.valueOf(reader.readLine());
            String[] data = reader.readLine().split(" ");
            Integer[] goals = new Integer[data.length];
            for (int i = 0; i < matches; i++) {
                goals[i] = Integer.valueOf(data[i]);
            }

            int min = goals[0];
            int max_difference = 0;
            for (int i = 1; i < matches; i++) {
                int match_score = goals[i];
                if (match_score < min) {
                    min = match_score;
                } else {
                    max_difference = Math.max(match_score - min, max_difference);
                }
            }

            if (max_difference > 0) {
                System.out.println(max_difference);
            } else {
                System.out.println("UNFIT");
            }
        }
    }


}
