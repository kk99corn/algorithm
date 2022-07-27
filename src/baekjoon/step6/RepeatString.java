package baekjoon.step6;

import java.io.*;

/*
baekjoon
step: 6
title: 문자열 반복
url: https://www.acmicpc.net/problem/2675
*/
public class RepeatString {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			String[] stringCase = bufferedReader.readLine().split(" ");
			int repeatN = Integer.parseInt(stringCase[0]);
			for (int j = 0; j < stringCase[1].length(); j++) {
				for (int x = 0; x < repeatN; x++) {
					bufferedWriter.write(stringCase[1].charAt(j));
				}
			}
			bufferedWriter.write("\n");
		}
		bufferedWriter.close();
	}
}
