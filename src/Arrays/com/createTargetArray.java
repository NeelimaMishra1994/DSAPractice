package Arrays.com;

import java.util.Arrays;
import java.util.*;

public class createTargetArray {

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		int [] index = {0,1,2,2,1};
		List<Integer> list = new ArrayList<>();
	       for(int i =0; i<index.length; i++)
	           list.add(index[i], nums[i]);
	           int[] res = new int[nums.length];
	           for(int i =0; i<list.size();i++)
	           res[i]= list.get(i);
	           //return res;
	           System.out.println(Arrays.toString(res));
	}

}
