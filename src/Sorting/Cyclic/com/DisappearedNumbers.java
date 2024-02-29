package Sorting.Cyclic.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {

	public static void main(String[] args) {
		int [] arr  = {4,3,2,7,8,2,3,1};
		findDisappearedNumbers(arr);
		System.out.println(Arrays.toString(arr));
		

	}
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		int i =0;
		while(i < nums.length) {
			int correct = nums[i]-1;
			if(nums[i]!=nums[correct]) {
				swap(nums,i,correct);
			}else {
				i++;
			}
		}
		List<Integer> ans = new ArrayList<>();
		for(int index =0; index< nums.length;index++) {
			if(nums[index]!=index+1) {
				ans.add(index+1);
			}
		}
		//System.out.println(ans);
		return ans;
    }
	private static void swap(int[] nums, int i, int correct) {
		int temp = nums[i];
		nums[i]=nums[correct];
		nums[correct]=temp;
	}

}
