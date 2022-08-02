package baekjoon.step6;

import java.io.*;

/*
baekjoon
step: 6
title: 크로아티아 알파벳
url: https://www.acmicpc.net/problem/2941
*/
public class Croatia {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] replaceWords = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		String s = bufferedReader.readLine();

		for (String word : replaceWords) {
			s = s.replaceAll(word, "0");
		}

		bufferedWriter.write(Integer.toString(s.length()));
		bufferedWriter.close();
	}
}