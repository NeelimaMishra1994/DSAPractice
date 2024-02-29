package Arrays.com;

public class findNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {12,345,2,6,7896};
		findNumbers(nums);
		//int counter =0;

	}
	public static int findNumbers(int[] nums) {
		
		int counter =0;
		for(int i =0; i<nums.length;i++) {
			int count =0 ;
			while(nums[i]!=0) {
			nums[i] = nums[i]/10;
			count++;
	}
			if (count%2 ==0) {
				counter++;
			}
	}
		return counter;  
    }

}
