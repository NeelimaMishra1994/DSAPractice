package Sorting.com;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,5,4,2};
		selectionsort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void selectionsort(int[] arr) {
		for(int i =0; i< arr.length; i++) {
			//find max item and swap it with correct index
			int last = arr.length-i-1;
			int maxIndex=findMax(arr,0,last);
			swap(arr,maxIndex,last);
		}
		
	}
	public static void swap(int[] arr, int first,int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
	}
	private static int findMax(int[] arr,int start,int end) {
		int max = start;
		for(int i =0; i<=end; i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		return max;
	}

}
