package baekjoon.step3;

import java.io.*;

/*
baekjoon
step: 3
title: A+B - 5
url: https://www.acmicpc.net/problem/10952
*/
public class AplusBSpeed4 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String[] arr = bufferedReader.readLine().split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);

			if (a == 0 && b == 0) {
				break;
			}

			bufferedWriter.write((a + b) + "\n");
		}
		bufferedWriter.close();
	}
}