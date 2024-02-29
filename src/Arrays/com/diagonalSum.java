package Arrays.com;

public class diagonalSum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] mat = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		diagonalSum(mat);

	}
	public static int diagonalSum(int[][] mat) {
		int n=mat.length;
		int sum=0;
		for(int i =0,j=0;i<n && j<=i; i++,j++  ) {
			sum = sum + mat[i][j];
			
		}
		System.out.println("sum:" +sum);
		for(int i =0, j=mat.length-1;i<n && j>=0;i++,j--) {
			if(i!=j) {
				sum=sum +mat[i][j];
			}
		}
		System.out.println("sum:" +sum);
		
		return sum;
	       
    }

}
