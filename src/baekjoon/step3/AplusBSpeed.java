package baekjoon.step3;

import java.io.*;

/*
baekjoon
step: 3
title: 빠른 A+B
url: https://www.acmicpc.net/problem/15552

+ BufferedReader/BufferedWriter 설명
https://jhnyang.tistory.com/92
*/
public class AplusBSpeed {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int iter = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < iter; i++) {
			String[] arr = bufferedReader.readLine().split(" ");
			bufferedWriter.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
		}
		bufferedWriter.close();
	}
}