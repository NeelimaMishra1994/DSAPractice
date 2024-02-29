package string;

public class SortingSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "is2 sentence4 This1 a3";
		
		System.out.println(sortSentence(s));

	}

	public static String sortSentence(String s) {
		 String [] str = s.split(" ");
		 String [] newArray = new String[str.length];
		 
		 for(String words:str) {
			 int index=words.charAt(words.length()-1)-'0';//to convert char to int you have to substract '0' Ascii value which is 48
			 String wordToAdd = words.substring(0, words.length() - 1);
			 newArray[index-1] = wordToAdd;
			 
			 
		 }
		return String.join(" ", newArray);
	 }

}
