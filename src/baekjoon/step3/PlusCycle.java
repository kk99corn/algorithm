package baekjoon.step3;

import java.io.*;

/*
baekjoon
step: 3
title: 더하기 사이클
url: https://www.acmicpc.net/problem/1110
*/
public class PlusCycle {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String num = bufferedReader.readLine();
		int n = 0;

		//  먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
		//  그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다.

		String temp = num;
		while (true) {
			if (temp.length() < 2) {
				temp = "0" + temp;
			}
			int a = Character.getNumericValue(temp.charAt(0));
			int b = Character.getNumericValue(temp.charAt(1));

			String temp2 = "" + (a + b);
			if (temp2.length() < 2) {
				temp2 = "0" + temp2;
			}
			int b2 = Character.getNumericValue(temp2.charAt(1));

			if (b == 0) {
				temp = "" + b2;
			} else {
				temp = b + "" + b2;
			}
			n++;
			if (num.equals(temp)) {
				break;
			}
		}
		bufferedWriter.write(n + "\n");
		bufferedWriter.close();
	}
}
