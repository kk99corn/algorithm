package baekjoon.step3;

import java.io.*;

/*
baekjoon
step: 3
title: 기찍 N
url: https://www.acmicpc.net/problem/2742
*/
public class PrintNDesc {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int iter = Integer.parseInt(bufferedReader.readLine());

		for (int i = iter; i >= 1; i--) {
			bufferedWriter.write(i + "\n");
		}
		bufferedWriter.close();
	}
}