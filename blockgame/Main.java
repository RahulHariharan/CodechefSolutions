import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.valueOf(reader.readLine());

		while(testcases-- > 0 ){

			int num = Integer.valueOf(reader.readLine());
            System.out.println(isPalindrome(num));
		}
	}

	private static String isPalindrome(int num){
		
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while(num > 0){
			int digit = num % 10;
			digits.add(digit);
			num = num / 10;
	    }
        
        int length = digits.size();
        if(length %2 != 0){
        	digits.remove(length/2);
        	length--;
        }
        
       
        int mid = (length/2) - 1;
        boolean isPalindrome = true;
	    for(int i=0; i<=mid;i++){
	    	if(digits.get(i) != digits.get(length-i-1)){
	    		isPalindrome = false;
	    		break;
	    	}
	    }

	    if(isPalindrome)
	    	return "wins";
	    else
	    	return "losses";
	}
}