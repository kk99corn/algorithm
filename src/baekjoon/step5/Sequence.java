package baekjoon.step5;

import java.io.*;

/*
baekjoon
step: 5
title: 한수
url: https://www.acmicpc.net/problem/1065
*/
public class Sequence {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine());
		int answer = 0;

		if (n < 100) {
			answer = n;
		} else {
			answer = 99;
			for (int i = 100; i <= n; i++) {
				String numStr = Integer.toString(i);
				boolean is = true;
				int diff = 0;
				for (int j = 0; j < numStr.length() - 1; j++) {
					int diffTemp = Character.getNumericValue(numStr.charAt(j + 1)) - Character.getNumericValue(numStr.charAt(j));
					if (j == 0) {
						diff = diffTemp;
					} else {
						if (diff != diffTemp) {
							is = false;
							break;
						}
					}
				}
				if (is) answer++;
			}
		}
		bufferedWriter.write(answer + "\n");

		bufferedWriter.close();
	}
}
