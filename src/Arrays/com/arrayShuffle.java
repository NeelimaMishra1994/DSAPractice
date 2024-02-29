package Arrays.com;

import java.util.Arrays;

public class arrayShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] arr = {2,5,1,3,4,7};
			int []ans = shuffle(arr,3);
			System.out.println(Arrays.toString(ans));
			
	}
	public static int[] shuffle(int[] nums, int n) {
	      int len = 2*n;
	      int [] ans = new int[len];
	      int x =0; int y =n; 
	      int a =0;
	      while(a <len){
	          ans[a++]=nums[x++];
	          ans[a++]=nums[y++];
	      } 
	      return ans; 
	    }

}
