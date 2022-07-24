package baekjoon.step5;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
baekjoon
step: 5
title: 셀프 넘버
url: https://www.acmicpc.net/problem/4673
*/
public class SelfNumber {
	int check(int n) {
		int num = n;
		while (n != 0) {
			num += (n % 10);
			n /= 10;
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		SelfNumber selfNumber = new SelfNumber();
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int MAX = 10000;
		boolean[] check = new boolean[MAX + 1];

		for (int i = 1; i <= MAX; i++) {
			int num = selfNumber.check(i);
			if (num <= MAX) {
				check[num] = true;
			}
		}

		for (int i = 1; i <= MAX; i++) {
			if (!check[i]) {
				bufferedWriter.write(i + "\n");
			}
		}
		bufferedWriter.close();
	}
}
