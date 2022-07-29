package baekjoon.step6;

import java.io.*;

/*
baekjoon
step: 6
title: 단어의 개수
url: https://www.acmicpc.net/problem/1152
*/
public class WordCount {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = bufferedReader.readLine().trim();
		int count = 0;
		if (s.length() > 0) {
			count = s.trim().split(" ").length;
		}
		bufferedWriter.write(Integer.toString(count));
		bufferedWriter.close();
	}
}
