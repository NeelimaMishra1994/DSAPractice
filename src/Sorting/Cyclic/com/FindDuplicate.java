package Sorting.Cyclic.com;

import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		int [] nums= {1,3,4,2,2};
		findDuplicate(nums);
		System.out.println(Arrays.toString(nums));

	}
	public static int findDuplicate(int[] nums) {
        int i =0;
	    while(i < nums.length) {
           if(nums[i]!=i+1){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]) {
                swap(nums,i,correct);
            }else {
                return nums[i];
            }
          }
            else{
                i++;
            }
	    }
        return -1;
		
	}
        
    private static void swap(int[] nums, int i, int correct) {
		int temp = nums[i];
		nums[i]=nums[correct];
		nums[correct]=temp;
	}

}
