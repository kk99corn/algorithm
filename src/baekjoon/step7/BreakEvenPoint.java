package baekjoon.step7;

import java.io.*;

/*
baekjoon
step: 6
title: 손익분기점
url: https://www.acmicpc.net/problem/1712
*/
public class BreakEvenPoint {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int answer = 0;
		String[] data = bufferedReader.readLine().split(" ");
		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[1]);
		int c = Integer.parseInt(data[2]);

		if (b >= c) {
			answer = -1;
		} else {
			answer = (a / (c - b)) + 1;
		}

		bufferedWriter.write(Integer.toString(answer));
		bufferedWriter.close();
	}
}