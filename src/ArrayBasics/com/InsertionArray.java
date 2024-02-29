package ArrayBasics.com;

import java.util.Arrays;

public class InsertionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {10,20,30,40,50};
		insertAtspecificPosition(num,25,2);
		insertAt0thPosition(num,25,2);
		insertAtLastPosition(num,25,num.length);
	}
	public static void insertAtspecificPosition(int []num,int elementToinsert, int elementAtIndex) {
		int num1[] =new int[num.length +1];
		System.out.println("Array before :" +Arrays.toString(num));
		for(int i = 0,j=0; i<num1.length;i++) {
			if(i ==elementAtIndex ) {
				num1[i]=elementToinsert;
				
			}else {
				num1[i]=num[j++];
			}
		}
		System.out.println("Array after :" +Arrays.toString(num1));

		
	}
	public static void insertAt0thPosition(int []num,int elementToinsert, int elementAtIndex) {
		int num1[] =new int[num.length +1];
		System.out.println("Array before :" +Arrays.toString(num));
		for(int i = 0,j=0; i<num1.length;i++) {
			if(i ==elementAtIndex ) {
				num1[i]=elementToinsert;
				
			}else {
				num1[i]=num[j++];
			}
		}
		System.out.println("Array after :" +Arrays.toString(num1));
		
	}
	
	public static void insertAtLastPosition(int []num,int elementToinsert, int elementAtIndex) {
		int num1[] =new int[num.length +1];
		System.out.println("Array before :" +Arrays.toString(num));
		for(int i = 0,j=0; i<num1.length;i++) {
			if(i ==elementAtIndex ) {
				num1[i]=elementToinsert;
				
			}else {
				num1[i]=num[j++];
			}
		}
		System.out.println("Array after :" +Arrays.toString(num1));
		
	}
	

}
