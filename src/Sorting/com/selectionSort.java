package Sorting.com;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int [] arr= {4,5,1,2,3};
		 selectionsort(arr);
		 System.out.println(Arrays.toString(arr));
	}
	static void selectionsort(int[] arr) {
		for(int i =0; i<arr.length-1;i++) {
			//find the maiximum item in the remaining array and swap with correct index
			int last = arr.length-i-1;
			int maxIndex=getmaxIndex(arr,0,last);
			swap(arr,maxIndex,last);
		}
		
	}
	private static int getmaxIndex(int[] arr,int start, int end) {
		int max= start;
		for( int i = start; i<= end; i++) {
			if(arr[max] < arr[i]) {
				max=i;
			}
		}
		return max;
		
	}
	static void swap( int[] arr,  int first,int second) {	
			int temp=arr[first];
			arr[first]=arr[second];
			arr[second]=temp;	
			
		}

}
