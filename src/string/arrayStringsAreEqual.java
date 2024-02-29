package string;

public class arrayStringsAreEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word1 = {"ab", "c"};
		String [] word2 = {"a", "bc"};
		System.out.println(arrayStringsAreEqual(word1,word2));

	}
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String strarray1=String.join("word2");
		String strarra21=String.join("word");
		if(strarray1.equals(strarra21)) {
			return true;
		}
		return false;
    }
}
