package binarySearch.com;

import java.util.Arrays;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,7,7,8,8,10};
		int target = 8;
		System.out.println(Arrays.toString(searchRange(nums,target)));
		
	}
	
		public static int[] searchRange(int[] nums, int target) {
			int [] ans = {-1,-1};
			int start = search(nums,target,true);
			int end=search(nums,target,false);
			ans[0]=start;
			ans[1]=end;
			return ans;     
		  }
	static int search(int[] arr, int target, boolean findStartIndex) {
		int ans=-1;
		int start =0;
		int end= arr.length-1;
		while(start <= end) {
			int mid = start +(end - start)/2;
			if(target > arr[mid]) {
					start= mid+1;
				}else if (target < arr[mid]) {
					end=mid-1;
				}else {
					//potential ans found
					ans=mid;
					if(findStartIndex) {
						end=mid-1;
					}else {
						start= mid+1;
					}
					
				}
			}
		return ans;
	}
}
	//2nd solution
	
//	public int[] searchRange(int[] nums, int target) {
//        int start = -1;
//        int end = -1;
//
//        // First pass: Find the start index.
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                start = i;
//                break;
//            }
//        }
//
//        // Second pass: Find the end index.
//        for (int i = nums.length - 1; i >= 0; i--) {
//            if (nums[i] == target) {
//                end = i;
//                break;
//            }
//        }
//
//        return new int[]{start, end};
//}
