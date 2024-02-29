package string;

import java.util.Arrays;

public class Comparison {
	
	public static void main(String[] args) {
		String a="Neelima";
		String b="Neelima";
		System.out.println(a==b);//because these refrences a, b pointing to same object but object in string pool is only one
		System.out.println(a.equals(b));
		String name = new String("neelima");
		String name1 = new String("neelima");
		System.out.println(name==name1);// you are creating two sep object using new keyword so here its' two object in heap not in pool thats why false
		System.out.println(name.equals(name1));//equals method checks the value
		System.out.println(56);
		System.out.println("Neelima");
		System.out.println(Arrays.toString(new int[] {2,3,4}));
	}

}
