package binarySearch.com;

public class RotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {4,5,6,7,0,1,2};
		int target =0;
		System.out.println(search(nums,target));
		

	}
	public static int search(int[] nums, int target) {
		int pivot = pivotelement(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarysearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }

        return binarysearch(nums, target, pivot + 1, nums.length - 1);
	        
	    }
	public static int pivotelement(int[]nums) {
		int start =0;
		int end =nums.length-1;
		while(start <= end) {
			int mid = start +(end-start)/2;
			//4 cases here to find mid
			if(mid < end && nums[mid] >nums[mid+1] ) {
				return mid;
			}
			if(mid > start && nums[mid]< nums[mid -1]) {
				return mid-1;
			}
			if(nums[mid] <= nums[start]) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
	public static int binarysearch(int[]nums, int target,int start, int end) {
		while(start <= end) {
			int mid = start +(end-start)/2;
			if(nums[mid] == target ) {
				return mid;
			}else {
				if(nums[mid] < target) {
					start = mid+1;
				}else {
					end=mid-1;
				}
			}
		}
		
		return -1;
	}

}
