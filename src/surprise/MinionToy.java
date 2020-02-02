package surprise;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {
	
	 static int count = -1; 
	 static ArrayList<String> minionNames = new ArrayList<String>(Arrays.asList(
			"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));
	 
	 String name;
	 
	 private MinionToy(int name) {
		 this.name = minionNames.get(name);
	 }
	 
	 public static MinionToy generate() {
		 if(count >= minionNames.size() -1) {
			 count = -1;
		 }
		 count++;
		 return new MinionToy(count);		 
		 
	 }
	 
	 public void enjoy() {
		 System.out.println("Your new MinionToy friend is " + this.name);
	 }
	 
	 
	 
}
