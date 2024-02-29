package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="NeelimaNN";
		int value=name.length();//1.it return the int length of string
		System.out.println(value);
		System.out.println(name.toLowerCase());//2.toLowerCase
		
		System.out.println(name.toUpperCase());//3.toUpperCase
		
		String notTrimmed = "       Hello    Mishra      ji        "; 
		System.out.println(notTrimmed.trim());//4.it removes all the the leading and trailing spaces but not from middle
		
		System.out.println(name.substring(2));//5.it takes start index and print till end start is inclusive
		
		System.out.println(name.substring(2,6));//6.it takes start and end both index but end index is exclusive
		
		String namenew = name.replace('N', 'M');//7.replace which replace the all occurance of character in the string
		
		String namenew1=name.replace("N", "mata");//8.this replace the string from another string and all ocuurance of that string
		System.out.println(namenew);
		System.out.println(namenew1);
		
		System.out.println(name.startsWith("Nee"));//method checks if this string starts with the given prefix. It returns true if this string starts with the given prefix; else returns false
		//public boolean startsWith(String prefix)  
		//public boolean startsWith(String prefix, int offset)  
		
		//offset-the index from where the matching of the string prefix starts.
		System.out.println(name.endsWith("Nee"));//method checks if this string ends with a given suffix. It returns true if this string ends with the given suffix; else returns false.
	}

}
