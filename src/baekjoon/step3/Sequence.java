package baekjoon.step3;

import java.io.*;

/*
baekjoon
step: 3
title: X보다 작은 수
url: https://www.acmicpc.net/problem/10871
*/
public class Sequence {
	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = bufferedReader.readLine().split(" ");
		String[] arr = bufferedReader.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);

		StringBuilder answer = new StringBuilder();
		for (String num: arr) {
			if (Integer.parseInt(num) < x) {
				if (answer.toString().equals("")) {
					answer.append(num);
				} else {
					answer.append(" ").append(num);
				}
			}
		}
		bufferedWriter.write(answer.toString());
		bufferedWriter.close();
	}
}
