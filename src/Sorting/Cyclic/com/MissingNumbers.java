package Sorting.Cyclic.com;

import java.util.Arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		int arr[]= {3,0,1};
		missingNumber(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public static int missingNumber(int[] nums) {
		int i =0;
		while(i < nums.length) {
			int correct = nums[i];
			if(nums[i] < nums.length && nums[i]!=nums[correct]) {
				swap(nums,i,correct);
			}else {
				i++;
			}
		}
		for(int index =0; index< nums.length;index++) {
			if(nums[index]!=index) {
				return index;
			}
		}
		return nums.length;

	}
	private static void swap(int[] nums, int i, int correct) {
		int temp = nums[i];
		nums[i]=nums[correct];
		nums[correct]=temp;
	}
}
