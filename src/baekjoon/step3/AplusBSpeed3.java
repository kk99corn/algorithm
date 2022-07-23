package baekjoon.step3;

import java.io.*;

/*
baekjoon
step: 3
title: A+B - 8
url: https://www.acmicpc.net/problem/11022
*/
public class AplusBSpeed3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int iter = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < iter; i++) {
			String[] arr = bufferedReader.readLine().split(" ");
			bufferedWriter.write("Case #" + (i + 1) + ": " + Integer.parseInt(arr[0]) + " + " + Integer.parseInt(arr[1]) + " = " + (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])) + "\n");
		}
		bufferedWriter.close();
	}
}