package Arrays.com;

import java.util.Arrays;

public class arrayPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,2,1,5,3,4};
		int[] ans = new int[7];
		for(int i =0; i<nums.length; i++) {
			ans[i] = nums[nums[i]];
		}
		System.out.println(Arrays.toString(ans));

	}

}
