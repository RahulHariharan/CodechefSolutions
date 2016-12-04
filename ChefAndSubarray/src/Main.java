import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.valueOf(reader.readLine());
        String[] data = reader.readLine().split(" ");
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = Integer.valueOf(data[i]);
        }

        int count = 0;
        int max_count = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] != 0) {
                count++;
            } else count = 0;

            max_count = Math.max(count, max_count);
        }

        System.out.println(max_count);
    }

}
