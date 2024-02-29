package Arrays.com;

import java.util.Arrays;

public class arrayShuffle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr = {1,2,3,4,5,6};
		int [] arr = {1,4,3,2,1,6};
		//output {1,2,4,1,3,6}
		int[] ans = shuffle(arr,3);
		
		System.out.println(Arrays.toString(ans));
		
		//output[1,4,2,5,3,6]

	}
	public static int[] shuffle(int[] nums, int n) {
		int[] ans= new int[2*n];
		int count =0;
		for(int i =0; i<n; i++) {
			ans[count] = nums[i];
			ans[count+1]=nums[i+n];
			count +=2;
		}
		
		return ans;
	}

}
