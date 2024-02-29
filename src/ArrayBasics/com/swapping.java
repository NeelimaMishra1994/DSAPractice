package ArrayBasics.com;

import java.util.Arrays;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {10,20,30,40,50};
		int index1 = 1;
		int index2 = 2;
		for(int i =0; i<nums.length;i++) {
			int temp = nums[index1];
			nums[index1]=nums[index2];
			nums[index2]=temp;
			
//			int[] arr = {10, 20, 30, 40};
//			int index1 = 1; // Index of the first element to swap
//			int index2 = 2; // Index of the second element to swap
//
//			arr[index1] = arr[index1] + arr[index2];
//			arr[index2] = arr[index1] - arr[index2];
//			arr[index1] = arr[index1] - arr[index2];

		}
		System.out.println(Arrays.toString(nums));
		

	}

}
