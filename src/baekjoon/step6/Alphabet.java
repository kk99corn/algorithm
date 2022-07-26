package baekjoon.step6;

import java.io.*;
import java.util.Arrays;

/*
baekjoon
step: 6
title: 알파벳 찾기
url: https://www.acmicpc.net/problem/10809
*/
public class Alphabet {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] alphabet = new int[26]; // 알파벳 전체 수만큼 초기화
		Arrays.fill(alphabet, -1);
		String s = bufferedReader.readLine();

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 97;
			if (alphabet[index] == -1) {
				alphabet[index] = i;
			}
		}

		for (int v : alphabet) {
			bufferedWriter.write(v + " ");
		}

		bufferedWriter.close();
	}
}
