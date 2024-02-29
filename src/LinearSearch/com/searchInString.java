package LinearSearch.com;

public class searchInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "neelima";
		char target = 'l';
		System.out.println(searchInString(str,target));
		

	}

	private static boolean searchInString(String str,char target) {
		if(str.length()==0) {
			return false;
		}
		for(int i =0; i <str.length();i++) {
			if(str.charAt(i)==target) {
				return true;
			}
		}
		return false;
	}
}
