package surprise;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {
	private static Random rand = new Random();
	
	public static ISurprise gather() {
		
		int option = rand.nextInt(2);
		switch (option) {
		case 0:
			return Candies.generate();
			
			
		case 1:
			return FortuneCookie.generate();
			
			
		case 2:
			return MinionToy.generate();
			
		}
		return null;
		
		
	}
	
	public static ArrayList<ISurprise> gather(int n) {
		ArrayList<ISurprise> array = new ArrayList<ISurprise>();
		for(int i = 0; i < n; i++) {
			array.add(GatherSurprises.gather());
		}
		return array;		
		
	}
	
	

}
