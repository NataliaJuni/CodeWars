package github.codewars;

public class CodeWars {

	public static void main(String[] args) {
		String s = "AA(XX(YY))(CC)";
		System.out.println(s);
		System.out.println(NestedBrackets.stringsInMaxDepth(s));
	}

}
