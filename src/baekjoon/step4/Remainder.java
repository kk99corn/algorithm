package baekjoon.step4;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/*
baekjoon
step: 4
title: 나머지
url: https://www.acmicpc.net/problem/3052
*/
public class Remainder {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			int num = Integer.parseInt(bufferedReader.readLine());
			set.add(num % 42);
		}
		bufferedWriter.write(set.size() + "\n");
		bufferedWriter.close();
	}
}
