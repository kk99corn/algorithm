package baekjoon.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
baekjoon
step: 6
title: 아스키 코드
url: https://www.acmicpc.net/problem/11654
*/
public class Ascii {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String str = bufferedReader.readLine();
		System.out.println(str.charAt(0) + 0);
	}
}
