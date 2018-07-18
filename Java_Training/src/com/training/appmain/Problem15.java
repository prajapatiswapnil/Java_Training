package com.training.appmain;

public class Problem15 {

	public static void main(String[] args) {
		String s = "(())))()(";

		System.out.println(Solution15.solution(s));

	}

}

class Solution15 {

	public static int solution(String s) {

		if (s.length() <= 1)
			return 0;

		char openBracket = '(';
		char closeBracket = ')';

		int countOpen = 0;
		int countClose = 0;
		int i, j;

		for (i = 0; i < s.length(); i++) {

			if (s.charAt(i) == openBracket) {
				countOpen++;
			}

			for (j = i + 1; j < s.length(); j++) {
				if (s.charAt(j) == closeBracket) {
					countClose++;
				}
			}

			if (countOpen == countClose)
				return i + 1;
			else
				countClose = 0;
		}

		return i;

	}

}
