package Sorting.com;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		

	}
	
	public static void bubbleSort(int [] arr) {
		boolean swapped;
		for(int i =0; i<arr.length-1;i++) {
			swapped=false;
			int temp =0;
			for(int j=1; j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		
	}

}
