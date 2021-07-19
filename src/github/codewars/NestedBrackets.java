package github.codewars;

import java.util.ArrayList;
import java.util.List;

public class NestedBrackets {
	public static List<String> stringsInMaxDepth(String s) {
		int rank = 0, maxRank = 0;
		List<String> strList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (char e : s.toCharArray()) {
			switch (e) {
			case '(':
				rank++;
				sb.setLength(0);
				if (rank > maxRank) {
					maxRank = rank;
					strList.clear();
				}
				break;
			case ')':
				if (rank == maxRank) {
					strList.add(sb.toString());
					sb.setLength(0);
				}
				rank--;
				break;
			default:
				if (rank == maxRank) {
					sb.append(e);
				}
			}
		}
		if (rank == maxRank) {
			strList.add(sb.toString());
		}
		return strList;
	}
}
