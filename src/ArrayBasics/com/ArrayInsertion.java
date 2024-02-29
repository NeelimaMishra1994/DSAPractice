package ArrayBasics.com;
import java.util.Arrays;

public class ArrayInsertion {
    public static void main(String[] args) {
        int[] n = {10, 20, 30, 40, 50};
        int elementToInsert = 25;
        int insertionIndex = 2;
        int[] n1 = new int[n.length + 1]; // Initialize n1 with the same length + 1
        System.out.println("Array before: " + Arrays.toString(n));

        for (int i = 0, j = 0; i < n1.length; i++) {
            if (i == insertionIndex) {
                n1[i] = elementToInsert; // Insert the new element at the specified index
            } else {
                n1[i] = n[j++]; // Copy the old element
            }
        }
        System.out.println("Array after: " + Arrays.toString(n1));
    }
}
