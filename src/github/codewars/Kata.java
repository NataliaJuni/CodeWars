package github.codewars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
	 public static int[] arrayDiff(int[] a, int[] b) {
		    Integer[] arrA = new Integer[a.length];
		    Integer[] arrB = new Integer[b.length];
		    Arrays.setAll(arrA, i -> a[i]);
		    Arrays.setAll(arrB, i -> b[i]);
		    List<Integer> listA = new ArrayList<>(Arrays.asList(arrA));
		    List<Integer> listB = Arrays.asList(arrB);
		    listA.removeAll(listB);
		    int[] c = new int[listA.size()];
		    for (int i = 0; i < listA.size(); i++) {
		      c[i] = listA.get(i);
		    }
		    return c;
		  }
}
