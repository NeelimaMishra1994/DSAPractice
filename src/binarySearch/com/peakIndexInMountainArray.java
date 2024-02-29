package binarySearch.com;

public class peakIndexInMountainArray {//also known as biotonic arrya

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,5,7,4,3,2};
		System.out.println(PeakIndexInMountainArray(arr));

	}
	public static int PeakIndexInMountainArray(int[] arr) {
		int start =0;
		int end = arr.length-1;
		while(start < end) {
			int mid = start +(end-start)/2;
			if(arr[mid]<arr[mid+1]) {
				start = mid+1;
			}else {
				//you are in dec part of array
				//this may be ans but look at left 
				//this is why end!=mid -1;because there is no need of lesser element
				end=mid;
			}
		}
		return start;   
	   }

}
