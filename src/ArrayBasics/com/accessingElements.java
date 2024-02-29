package ArrayBasics.com;
import java.util.*;

public class accessingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ArrayAsInput();
			
		}

	
	//Q1.Take an array as input from the user.search for the given number X and print the index 
	//at which it occurs 
	public static void ArrayAsInput(){
		System.out.println("enter the array size: ");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		//for input
		for(int i =0; i<size;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("enter the x element to be found");
		int x =sc.nextInt();
		//for output
		for(int i =0; i<size;i++) {
			if(arr[i] == x) {
				System.out.println("X found at index:" +" " +i);
			}
			//System.out.println(arr[i]);
		}
	}

}
