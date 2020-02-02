package surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {
	
	static ArrayList<String> candyTypes = new ArrayList<String>(Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));
	String candyType;
	int candyNo;
	private static Random rand = new Random();
	
	public String getCandyType() {
		return candyType;
	}
	public int getCandyNo() {
		return candyNo;
	}
	
	private Candies(int type, int no) {
		this.candyType = candyTypes.get(type);
		this.candyNo = no;
	}
	
	
	public static Candies generate() {
		int randomType = rand.nextInt(candyTypes.size() -1);
		int randomNo = rand.nextInt(1000);
		return new Candies(randomType, randomNo);			
	}
	
	public void enjoy() {
		System.out.println("Yaay, you just got " + this.getCandyNo() + " " + this.getCandyType() + " candies !");
	}

}
