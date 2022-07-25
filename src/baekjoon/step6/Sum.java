package baekjoon.step6;

import java.io.*;

/*
baekjoon
step: 6
title: 숫자의 합
url: https://www.acmicpc.net/problem/11720
*/
public class Sum {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine());
		String numStr = bufferedReader.readLine();
		int total = 0;

		for (int i = 0; i < n; i++) {
			if (numStr.charAt(i) != '0') {
				total += Character.getNumericValue(numStr.charAt(i));
			}
		}
		bufferedWriter.write(Integer.toString(total));
		bufferedWriter.close();
	}
}
