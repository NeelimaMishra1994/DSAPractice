package Arrays.com;

import java.util.Arrays;

public class arrayConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,1};
		int [] ans = new int[6];
		for(int i =0; i<nums.length; i++) {
			ans[i] = nums[i];
			ans[i +nums.length]=nums[i];
		}
		
		System.out.println(Arrays.toString(ans));

	}
	
	
	

}
