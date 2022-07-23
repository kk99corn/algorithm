package baekjoon.step3;

import java.io.*;

/*
baekjoon
step: 3
title: A+B - 4
url: https://www.acmicpc.net/problem/10951
*/
public class AplusBSpeed5 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = "";
		while ((str = bufferedReader.readLine()) != null) {
			String[] arr = str.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);

			bufferedWriter.write((a + b) + "\n");
		}
		bufferedWriter.close();
	}
}