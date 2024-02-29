package LinearSearch.com;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {10,20,4,5,6,-1,19,-2,-40};
		int target = 5;
		int ans = LinearSearch(nums,target);
		System.out.println(ans);
		int ans1 = LinearSearch1(nums,target);
		System.out.println(ans1);
		

	}
	
	//linear search in the array : return the index if item found in the array 
	//otherwise if not found return -1;

	private static int LinearSearch(int [] arr, int target) {
		// TODO Auto-generated method stub
		if(arr.length == 0) {
			return -1;
		}
		//run the for loop
		for(int index =0; index< arr.length; index++) {
			if(target == arr[index]) {
				return index;
			}
		}
		return -1;	
		
	}
	private static int LinearSearch1(int [] arr, int target) {
		// TODO Auto-generated method stub
		if(arr.length == 0) {
			return -1;
		}
		//run the for loop
		for(int element : arr)
			if(element == target) {
				return element;
			}
		
		return -1;	
		
	}

}
