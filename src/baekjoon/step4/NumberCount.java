package baekjoon.step4;

import java.io.*;

/*
baekjoon
step: 4
title: 숫자의 개수
url: https://www.acmicpc.net/problem/2577
*/
public class NumberCount {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(bufferedReader.readLine());
		int b = Integer.parseInt(bufferedReader.readLine());
		int c = Integer.parseInt(bufferedReader.readLine());

		int[] arr = new int[10];
		String num = Integer.toString(a * b * c);

		for (int i = 0; i < num.length(); i++) {
			int x = Character.getNumericValue(num.charAt(i));
			arr[x] = arr[x] + 1;
		}

		for (int n: arr) {
			bufferedWriter.write(n + "\n");
		}

		bufferedWriter.close();
	}
}
