package Arrays.com;

public class richestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {
				{1,2,3,4},
				{3,2,1}
				};
		int maxi =Integer.MIN_VALUE;
		for(int person =0 ; person< arr.length; person++) {
			//for each colum
			int sum =0;
			for(int accountmoney = 0; accountmoney<arr[person].length;accountmoney++) {
				sum = sum +arr[person][accountmoney];	
			}
			maxi = Math.max(maxi, sum);	
		}
		System.out.println(maxi);
		
	}

}
