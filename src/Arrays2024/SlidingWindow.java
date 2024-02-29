package Arrays2024;

public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 5, 4, 1, 9,5,7,8};
		int k =3;
		findmax(arr,k);
	}
	public static void findmax(int[] arr,int size) {
		int max=Integer.MIN_VALUE;
		for(int i = 0; i<arr.length-size;i++) {
			int sum=0;
			for(int j = i;j < i+size; j++) {
				sum =sum+arr[j];
			}
			max=Math.max(max, sum);
		}
		System.out.println("max:"+max);
		
	}
		
}
