package baekjoon.step3;

import java.io.*;

/*
baekjoon
step: 3
title: N 찍기
url: https://www.acmicpc.net/problem/2741
*/
public class PrintN {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int iter = Integer.parseInt(bufferedReader.readLine());

		for (int i = 1; i <= iter; i++) {
			bufferedWriter.write(i + "\n");
		}
		bufferedWriter.close();
	}
}