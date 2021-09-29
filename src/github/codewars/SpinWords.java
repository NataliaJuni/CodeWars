package github.codewars;

public class SpinWords {
	public String spinWords(String sentence) {
		String[] myString = sentence.split(" ");
		sentence = "";
		for (int i = 0; i < myString.length; i++) {
			if (myString[i].length() >= 5) {
				myString[i] = new StringBuffer(myString[i]).reverse().toString();
			}
			sentence = sentence + myString[i] + " ";
		}
		return sentence.trim();
	}
}
