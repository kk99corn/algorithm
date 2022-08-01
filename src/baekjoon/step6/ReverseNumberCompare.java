package baekjoon.step6;

import java.io.*;

/*
baekjoon
step: 6
title: 상수
url: https://www.acmicpc.net/problem/2908
*/
public class ReverseNumberCompare {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder word = new StringBuilder(bufferedReader.readLine());
		String[] strArr = word.reverse().toString().split(" ");
		if (Integer.parseInt(strArr[0]) > Integer.parseInt(strArr[1])) {
			bufferedWriter.write(strArr[0]);
		} else {
			bufferedWriter.write(strArr[1]);
		}

		bufferedWriter.close();
	}
}