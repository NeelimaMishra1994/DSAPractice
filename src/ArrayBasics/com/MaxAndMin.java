package ArrayBasics.com;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {20,10,30,5,50,2};
		int max =0;
		int min =50;
		 Max(nums, max);
		 Min(nums,min);

	}
	public static void Max(int[]nums,int max) {
		for(int i =0; i<nums.length; i++) {
			if(nums[i] > max) {
				max=nums[i];
			}
		}
		System.out.println("Max: "+max);
	}
	public static void Min(int[]nums,int min) {
		for(int i =0; i<nums.length; i++) {
			if(nums[i] < min) {
				min=nums[i];
			}
		}
		System.out.println("MIN: "+min);
			
	}
}
