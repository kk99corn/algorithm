package baekjoon.step4;

import java.io.*;

/*
baekjoon
step: 4
title: OX퀴즈
url: https://www.acmicpc.net/problem/8958
*/
public class OXQuiz {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			String result = bufferedReader.readLine();
			int sum = 0;
			int x = 1;
			for (int j = 0; j < result.length(); j++) {
				if (result.charAt(j) == 'O') {
					sum += x;
					x++;
				} else {
					x = 1;
				}
			}
			bufferedWriter.write(sum + "\n");
		}
		bufferedWriter.close();
	}
}