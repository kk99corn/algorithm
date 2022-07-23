package baekjoon.step3;

import java.io.*;

/*
baekjoon
step: 3
title: 별 찍기 - 2
url: https://www.acmicpc.net/problem/2439
*/
public class PrintStar2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int iter = Integer.parseInt(bufferedReader.readLine());

		for (int i = 1; i <= iter; i++) {
			bufferedWriter.write(" ".repeat(Math.max(0, iter - i)) + "*".repeat(Math.max(0, i)) + "\n");
		}
		bufferedWriter.close();
	}
}