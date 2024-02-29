//package Arrays.com;
//
//public class checkIfPangram {
//	public static void main(String [] args) {
//		System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
//	}
//
//	public static boolean checkIfPangram(String sentence) {
//	    // Convert the input sentence to lowercase to make it case-insensitive
//	    sentence = sentence.toLowerCase();
//	    
//	    // Check if the input sentence is null, and return false if it is
//	    if (sentence == null)
//	        return false;
//
//	    // Create an array of boolean values to track the presence of letters from 'a' to 'z'
//	    
//
//	    boolean[] alphabet=false;
//		// Iterate through each character in the sentence
//	    for (int i = 0; i < sentence.length(); i++) {
//	        char c = sentence.charAt(i);
//	        
//	        // Check if the character is a letter between 'a' and 'z'
//	        if ('a' <= c && c <= 'z') {
//	            // Mark the letter as seen by setting the corresponding element in the 'alphabet' array to 'true'
//	            // For example, if 'c' is encountered, 'alphabet[2]' will be set to 'true' because 'c' is the third letter in the alphabet
//	            alphabet[c - 'a'] = true;//c - 'a' calculates the offset or position of the character c relative to 'a'. For example:
//
//					//If c is 'a', then c - 'a' would be 0 because 'a' minus 'a' equals 0.
//					//If c is 'b', then c - 'a' would be 1 because 'b' minus 'a' equals 1.
//					//If c is 'c', then c - 'a' would be 2 because 'c' minus 'a' equals 2.
//	        }
//	    }
//
//	    // After scanning the entire sentence, check if all letters from 'a' to 'z' are present
//	    for (boolean letterPresent : alphabet) {
//	        if (!letterPresent) {
//	            return false; // If any letter is missing, it's not a pangram, so return false
//	        }
//	    }
//
//	    // If all letters from 'a' to 'z' are present, return true, indicating it's a pangram
//	    return true;
//	}
//
//		
//}
