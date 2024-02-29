package Arrays2024;

import java.util.Arrays;

public class ReverseArray {
	//for reverse programme we have to take two pointers
	public static void main(String[] args) {
		int arr[] = {3, 5, 4, 1, 9};
		int temp =0;
		for(int i =0,j=arr.length-1; i<=j;i++,j--) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
