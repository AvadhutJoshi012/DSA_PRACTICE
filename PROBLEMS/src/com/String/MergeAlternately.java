package com.String;

public class MergeAlternately {

	public static String alternate(String word1, String word2) {
		StringBuilder result = new StringBuilder();

		int i = 0;
		int j = 0;

		while (i < word1.length() || j < word2.length()) {
			if (i < word1.length()) {
				result.append(word1.charAt(i));
				i++;
			}
			if (j < word2.length()) {
				result.append(word2.charAt(j));
				j++;
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String word1 = "abc";
		String word2 = "xyzoo";

		String m=alternate(word1, word2);
		System.out.println(m);
	}

}
