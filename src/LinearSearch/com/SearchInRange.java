package LinearSearch.com;

public class SearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {18,12,-7,3,14,28};
		int target =-7;
		int ans= searchInRange(nums,target,1,4);
		System.out.println(ans);
	}

	private static int searchInRange(int[]arr, int target,int start, int end) {
		// TODO Auto-generated method stub
		if(arr.length ==0) {
			return -1;
		}
		//for loop
		for(int index =start; index<=end;index++) {
			int element = arr[index];
			if(element==target) {
				return index;
			}
		}
		return -2;
		
	}

}
