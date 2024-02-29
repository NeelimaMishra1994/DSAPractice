package Arrays.com;

import java.util.Arrays;

public class flippingImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]image = {{1,1,0},
						{1,0,1},
						{0,0,0}
					};	
		flipAndInvertImage(image);
		
	}
	 public static int[][] flipAndInvertImage(int[][] image) {
		 int n = image.length;
		 for(int i =0; i<n;i++) {
			 for(int j =0,k=n-1;j<=k;j++,k--) {
				 if(image[i][j]==image[i][k]) {
					 image[i][j]=1-image[i][j];
					 image[i][k]=image[i][j];
				 }
			 }
		 }	
		 System.out.println(Arrays.deepToString(image));
		return image; 
		
	 }
}
	
		




