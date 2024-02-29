package Arrays.com;

import java.util.Arrays;

public class smallerNumbersThanCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {6,5,4,8};
		int[] ans = new int[nums.length];
		for(int i =0; i<nums.length;i++) {
			int count =0;
			for(int j =0; j<nums.length;j++) {
				if(nums[i]>nums[j]) { 
				count++;
				}
			}
			ans[i]=count;
			System.out.println(count);	
		}
		System.out.println(Arrays.toString(ans));

	}

}
