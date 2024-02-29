package binarySearch.com;

public class OrderAgonostic {

	public static void main(String[] args) {
		//int [] nums= {2,4,6,9,11,12,14,20,36,48};
		int [] nums= {90,80,75,22,11,10,5,2,-3};
		int target = 10;
		int ans = OrderAgonosticBS(nums,target);
		System.out.println(ans);
	}

	private static int OrderAgonosticBS(int[]arr,int target) {
		int start =0 ;
		int end = arr.length-1;	
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
		
		return 0;
	}

}
