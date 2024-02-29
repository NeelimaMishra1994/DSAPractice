package string;

public class HalvesAreAlike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "book";
		System.out.println(halvesAreAlike(s));
	}
	public static boolean halvesAreAlike(String s) {
		int half=s.length()/2;
		String a = s.substring(0, half);
		String b = s.substring(half);
        int counta=0;
        a=a.toLowerCase();
        b=b.toLowerCase();
        for(int i =0; i<a.length();i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' ||a.charAt(i)=='i' || 
            a.charAt(i)=='o' || a.charAt(i)=='u'){
                counta++;
            }
        }
        int countb=0;
        for(int i =0; i<b.length();i++){
            if(b.charAt(i)=='a' || b.charAt(i)=='e' ||b.charAt(i)=='i' || 
                b.charAt(i)=='o' || b.charAt(i)=='u'){
                    countb++;
                }
        }
        if(counta == countb){
            return true;
        }
        return false;
    }
}
