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
			int x = Integer.valueOf(data[0]);
			int y = Integer.valueOf(data[1]);
            int gcd_limit = 1;
            int lcm_limit = 1;
			if(x <= y){
				gcd_limit = x;
				lcm_limit = y;
			}else{
				gcd_limit = y;
				lcm_limit = x;	
		    }
            
			int gcd = 1;
			for(int i=1; ;i++){
				int divisor = gcd_limit / i;
				if(lcm_limit % divisor == 0 && gcd_limit % divisor == 0){
                    gcd = divisor;
					break;
				}
			}

			int lcm = lcm_limit;
			for(int i=1; ;i++){
				int multiple = lcm_limit * i;
				if(multiple%gcd_limit == 0){
                    lcm = multiple;
					break;
				}
			}

			System.out.printf("%d %d\n",gcd,lcm);
		}
	}
}