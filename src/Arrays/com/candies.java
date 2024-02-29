package Arrays.com;
import java.util.*;

public class candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Boolean> res = new ArrayList<>();
		int [] candies = {2,3,5,1,3};
		int max = candies[0];//first element as maximum
		for(int i =0; i<candies.length; i++) {
			max = Math.max(max, candies[i]);
		}		
		System.out.println(max);
		
	   int extracandies =3;
	    int res1;
	
		for(int i =0; i<candies.length; i++) {
			res1 = candies[i]+extracandies;
			if(res1 >= max) {
				res.add(true);
			}else {
				res.add(false);
			}
		}
		System.out.println(res);

	}
}


