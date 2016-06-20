import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.valueOf(reader.readLine());

		while(testcases-- > 0 ){

			String[] data = reader.readLine().split(" ");
			long a = Long.valueOf(data[0]);
			long b = Long.valueOf(data[1]);

			if(a > b)
				System.out.println(">");
			else if(a < b)
				System.out.println("<");
			else
				System.out.println("=");
		}
	}
}