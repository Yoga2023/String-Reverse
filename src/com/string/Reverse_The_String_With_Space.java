package com.string;

public class Reverse_The_String_With_Space {
	public static void main(String[] args) {
		String a = "My name is Yoga";
		String b[] = a.split(" ");
		/*
		 * for (String c : b) { System.out.println(c); }
		 */
		StringBuffer sb = new StringBuffer(a);
		sb.reverse();

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				sb.insert(i, " ");
			}
		}
		
		System.out.println(sb);

	}
}
