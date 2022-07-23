package baekjoon.step4;

import java.io.*;

/*
baekjoon
step: 4
title: 최댓값
url: https://www.acmicpc.net/problem/2562
*/
public class Max {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int max = 0;
		int index = 0;
		for (int i = 1; i <= 9; i++) {
			int n = Integer.parseInt(bufferedReader.readLine());
			if (n > max) {
				max = n;
				index = i;
			}
		}

		bufferedWriter.write(max + "\n");
		bufferedWriter.write(index + "\n");
		bufferedWriter.close();
	}
}
