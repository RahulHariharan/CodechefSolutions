import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.valueOf(reader.readLine());

		while(testcases-- > 0 ){

			String[] data = reader.readLine().split(" ");
		    int quantity = Integer.valueOf(data[0]);
		    int price = Integer.valueOf(data[1]);
		    double total = quantity * price;
		    if(quantity > 1000){
		    	total =  total - ((10 * total) / 100);
		    }

		    System.out.printf("%.6f\n",total);
		}
	}
}