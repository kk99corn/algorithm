package baekjoon.step4;

import java.io.*;
import java.util.Arrays;

/*
baekjoon
step: 4
title: 최소, 최대
url: https://www.acmicpc.net/problem/10818
*/
public class MaxMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine());
		int[] numArr = new int[n];

		String nums = bufferedReader.readLine();
		String[] numStrArr = nums.split(" ");
		for (int i = 0; i < n; i++) {
			numArr[i] = Integer.parseInt(numStrArr[i]);
		}
		Arrays.sort(numArr);
		bufferedWriter.write(numArr[0] + " " + numArr[n - 1]);
		bufferedWriter.close();
	}
}
