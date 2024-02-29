package Arrays2024;

public class MaxAndMin {
	
	//To find Max and Min together in one programme, we need to write separate for loop for min & Max both

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 5, 4, 1, 9};
		//int arr[] = {9, 1, 4, 5, 3};
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i = 0; i <= arr.length-1; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		  }
		for(int i = 0; i <= arr.length-1; i++) {
			 if(arr[i]>max) {
				max=arr[i];
			}
		  }
		System.out.println("Min:"+min);
		System.out.println("Max:"+max);
	}
}
