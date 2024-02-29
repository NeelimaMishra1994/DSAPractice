package patterns;

public class pattern {
	
	//patter trick to solve any pattern problem
	//1.  no. of line=no.of row = no.of time outer loop will run
	//2.  Identify for every row no ,how many cols is there & type of element to print
	//3.what do you need to print
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1(5);
		pattern2(4);
		pattern3(5);
		pattern4(5);
		pattern5(5);
	}
	
//1.	//* * * * *
		//* * * * *
		//* * * * *
		//* * * * *
		//* * * * *	
	
	static void pattern1(int n) {
		for(int row =1; row<=n; row++) {
			for(int col= 1; col <=n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
//2.	//*
		//* *
		//* * *
		//* * * *
	static void pattern2(int n) {
		for(int row =1; row <= n;row++) {
			for(int col = 1; col <=row;col++ ) {
				System.out.print("* ");
			}
			//when one row is printed we need to add new line
			System.out.println();
		}
		System.out.println();
	}

//3. //* * * * *
	//* * * *
	//* * *
	//* *
	//*
	static void pattern3(int n) {
		for(int row =1; row <= n;row++) {
			for(int col = 5; col >= row;col-- ) {
				System.out.print("* ");
			}
			//when one row is printed we need to add new line
			System.out.println();
		}
		System.out.println();
	}
	
//4.	1
	//	1 2
	//	1 2 3
	//	1 2 3 4
	//	1 2 3 4 5
	static void pattern4(int n) {
		for(int row =1; row <= n;row++) {
			for(int col = 1; col <= row;col++ ) {
				System.out.print(col +" ");
			} 
			//when one row is printed we need to add new line
			System.out.println();
		}
		System.out.println();
	}
//5.
			//1*
			//2* *
			//3* * *
			//4* * * *
			//5* * * * *
			//6* * * *//when row no. is grater than n
			//7* * *
			//8* *
			//9*
	
	static void pattern5(int n) {
		for(int row =1; row <2*n;row++) {
			for(int col = 1; col <=row;col++ ) {
				System.out.print("* ");
			} 
			System.out.println();
		}
		System.out.println();
	}

}
