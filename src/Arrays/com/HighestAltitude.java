package Arrays.com;

import java.util.Arrays;

public class HighestAltitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] gains = {-5,1,5,0,-7};
		int result = HighestAltitudeMethod(gains);
		System.out.println(result);

	}
	 public static int HighestAltitudeMethod(int [] gains) {
		 int maxAltitude = 0;
		 int currentAltitude =0;
		 
		 for(int i =0; i< gains.length; i++) {
			 currentAltitude += gains[i];
			 maxAltitude = Math.max(currentAltitude, maxAltitude);
		 }
		 System.out.println();
		return maxAltitude;
	
		 
	 }

}



