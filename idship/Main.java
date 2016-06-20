import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;


public class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.valueOf(reader.readLine());

		HashMap<String,String> map = new HashMap<String,String>();
        map.put("b","BattleShip");
        map.put("c","Cruiser");
        map.put("d","Destroyer");
        map.put("f","Frigate");

		while(testcases-- > 0 ){

			String ship = reader.readLine().toLowerCase();
			System.out.println(map.get(ship));
		}

		map = null;
	}

	
}