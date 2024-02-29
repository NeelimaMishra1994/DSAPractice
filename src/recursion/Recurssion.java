package recursion;

public class Recurssion {//recursion is something which calls itself but you have to find a condition to break the loop
						// function that calls itself

	public static void main(String[] args) {
		print(1);
	}
	static void print(int n) {
		if(n==5) {//this is base condition.condition where our recursion will stop making new calls
			System.out.println(5);
			return;
		}
		System.out.println(n);
		//recursive call
		//if you are calling a function again and again ,you can treat it as separate call in the stack
		print(n + 1);
		
	}

}
//why recursion?
//it helps us in solving bigger/complex problems in a simple way
//you can convert recursion solution in iteration visa versa
//space complexity is not constant becuase of recursive calls
