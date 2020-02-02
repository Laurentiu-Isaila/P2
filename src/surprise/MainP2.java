package surprise;

import java.util.ArrayList;

public class MainP2 {

	public static void main(String[] args) {
		ArrayList<ISurprise> c = GatherSurprises.gather(7);
		for(int i = 0; i < c.size(); i++) {
			c.get(i).enjoy();
			
		}
		

	}

}
