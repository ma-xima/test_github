package Arrays;

public class Umsatzsteigerung {
	 int[]dailyGains = new int[31];
	 
	 int count5PercentJumps(int[]gains) {
		 for(int i = 0; i < dailyGains.length; i++) {
			 if(dailyGains[i] + dailyGains[i++] >= dailyGains[i]+ dailyGains[i]*0.5) {
				 System.out.println("f�r den Tag gibt es einen Bonus");
			 }
			 
		 }
		 
	 }

}

