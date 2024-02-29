package LinearSearch.com;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {18,12,-7,3,14,28};
		int ans = min(nums, nums[0]);
		System.out.println(ans);

	}

	private static int min(int[] arr, int min) {
		for(int i =0; i <arr.length;i++) {
			if(arr[i]< min) {
				min=arr[i];
			}
		}
		return min;
	}
}
