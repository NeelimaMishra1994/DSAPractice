package Arrays.com;

import java.util.Arrays;

public class runningSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,3,4};
		int []ans = new int [nums.length]; int temp=0;
		for(int i =0; i < nums.length;i++) {
			temp = temp+nums[i];
			ans [i]= temp;
		
			
		}
		System.out.println(Arrays.toString(ans));

	}

}
