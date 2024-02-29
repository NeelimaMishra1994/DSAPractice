package ArrayBasics.com;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {10,20,30,40,50};
		int reversedArray[] = new int [nums.length];
		for(int i =nums.length-1,j=0; i>=0; i--,j++) {
			reversedArray[j]=nums[i];
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(reversedArray));

	}	

}
