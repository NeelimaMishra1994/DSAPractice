package Arrays.com;

import java.util.Arrays;

public class CountOddcell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] indices= {
				{0,1},
				{1,1}
				};
		oddCells(2,3,indices);

	}
	    public static int oddCells(int m, int n, int[][] indices) {
	    int [][] matrix = new int[m][n];
	    for(int index =0; index<indices.length; index++){
	        int row = indices[index][0];
	        int col = indices[index][1];
	       
	       

	        //increment the row
	        for(int j=0; j<n;j++){
	            matrix[row][j]++;
	        }
	        //increment the column
	        for(int k =0; k<m;k++){
	            matrix[k][col]++;
	        }
	    }
	    System.out.println(Arrays.deepToString(matrix));
	    int count =0;
	    for(int i =0; i<matrix.length; i++){
	    	System.out.println(matrix[0].length);
	        for(int j=0; j<=matrix.length;j++){
	            if(matrix[i][j]%2!=0){
	            count++;
	        }
	        } 
	    }
	    System.out.println(count);
	    return count;
	   
	}

}
