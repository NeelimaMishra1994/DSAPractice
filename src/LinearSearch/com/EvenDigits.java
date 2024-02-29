package LinearSearch.com;

public class EvenDigits {
	

	public static void main(String[] args) {
		int [] nums= {18,124,9,1764,98,1};
		int ans = findNumbers(nums);
		System.out.println(ans);

	}

	private static int findNumbers(int[] arr) {
		// TODO Auto-generated method stub
		int counter =0;
		int num=0;
		for(int i =0; i<arr.length; i++) {
			int count =0;
			while(arr[i]!=0) {
				arr[i]= arr[i]/10;
				count++;
			}
			if(count%2==0) {
				counter++;	
			}
		}
		return counter;
		
	}

}
