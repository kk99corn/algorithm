package baekjoon.step6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
baekjoon
step: 6
title: 그룹 단어 체커
url: https://www.acmicpc.net/problem/1316
*/
public class GroupWordCheck {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine());

		int answer = 0;
		for (int i = 0; i < n; i++) {
			if (check(bufferedReader.readLine())) {
				answer++;
			}
		}

		bufferedWriter.write(Integer.toString(answer));
		bufferedWriter.close();
	}

	public static boolean check(String s) {
		StringBuilder temp = new StringBuilder();
		List<Character> list = new ArrayList<>();
		list.add(s.charAt(0));
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) != s.charAt(j)) {
					if (list.contains(s.charAt(j))) {
						return false;
					}
					list.add(s.charAt(j));
					i = j;
				}
			}
		}
		return true;
	}
}