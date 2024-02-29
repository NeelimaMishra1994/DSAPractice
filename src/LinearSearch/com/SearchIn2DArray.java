package LinearSearch.com;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int [][] nums= {{23,4,1},
						{18,12,3,9},
						{78,99,34,56},
						{18,12}
						};
		int target =3;
		int[] ans= searchIn2DArray(nums,target);//format of return value {row, col}
		System.out.println(Arrays.toString(ans));
		int max= max(nums);
		System.out.println((max));	
		int min= min(nums);
		System.out.println((min));	
	}

	private static int[] searchIn2DArray(int[][] nums, int target) {
		for(int i =0; i<nums.length;i++) {
			for(int j =0; j<nums[i].length; j++) {
				int ans = nums[i][j];
				if(ans==target) {
					return new int[]{i,j};// this is the way to return row col value in 2d Array
				}
			}
			
		}
		return new int[]{-1,-1};
	}
	private static int max(int[][] nums) {
		int max=nums[0][0];
		for(int i =0; i<nums.length;i++) {
			for(int j =0; j<nums[i].length; j++) {
				int element = nums[i][j];
				if(element > max) {
					max = element;
				}
				
			}
		}
		
		return max;
	}
	private static int min(int[][] nums) {
		int min=nums[0][0];
		for(int i =0; i<nums.length;i++) {
			for(int j =0; j<nums[i].length; j++) {
				int element = nums[i][j];
				if(element < min) {
					min = element;
				}
				
			}
		}
		
		return min;
	}
}
