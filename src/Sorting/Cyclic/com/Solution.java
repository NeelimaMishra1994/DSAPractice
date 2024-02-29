package Sorting.Cyclic.com;
class Solution {
    public int missingNumber(int[] nums) {
    	
        int i = 0;
        while( i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int index =0; index < nums.length;index++){
            if(nums[index]!=index){
            	System.out.println("index"+index);
                return index;
            }
        }
        return nums.length;
    }
    public static void swap(int[]nums,int first,int second){
        int temp =nums[first];
        nums[first]= nums[second];
        nums[second]=temp;
    }
}