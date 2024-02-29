package binarySearch.com;

import java.util.Arrays;

public class FindInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,3,1};
		int target=3;
		//System.out.println(search(arr,target));
		System.out.println(Arrays.toString(search(arr,3)));


	}
	public  static int[] search (int[]arr,int target) {
		int peak = PeakIndexInMountainArray(arr);
		int firsttry=OrderAgonosticBS(arr,target,0,peak);
		int secondtry=OrderAgonosticBS(arr,target,peak+1,arr.length-1); 
		return new int[]{firsttry, secondtry};
	}
	public static int PeakIndexInMountainArray(int[]arr) {     
		int start =0;
		int end= arr.length-1;
		while(start < end) {
			int mid = start +(end-start)/2;
			if(arr[mid] > arr[mid+1]) {
				end=mid;
			}else {
				start = mid+1;
			}
		}
		return start;//you can return anything start end mid, all will be equal
	}
	
	public static int OrderAgonosticBS(int[]arr,int target,int start, int end) {	
		while(start <= end) {
			int mid= start +(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			boolean isAsc= arr[start] < arr[end];
			if(isAsc) {
				if(target > arr[mid]) {
					start = mid+1;
				}else {
					end = mid-1;
				}
			}else
				if(target > arr[mid]) {
					end = mid-1;
				}else {
					start = mid+1;
				}	
			}
		
			return -1;
	}
	
	
}
