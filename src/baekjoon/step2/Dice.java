package baekjoon.step2;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
baekjoon
step: 2
title: 주사위 세개
url: https://www.acmicpc.net/problem/2480
*/
public class Dice {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new TreeMap<>();
		int max = 0;
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		max = A;
		if (B > max) max = B;
		if (C > max) max = C;

		map.put(A, map.getOrDefault(A, 0) + 1);
		map.put(B, map.getOrDefault(B, 0) + 1);
		map.put(C, map.getOrDefault(C, 0) + 1);

		if (map.size() == 1) {
			System.out.println(10000 + A * 1000);
		} else if (map.size() == 2) {
			for (Integer key : map.keySet()) {
				if (map.get(key) == 2) {
					System.out.println(1000 + key * 100);
				}
			}
		} else {
			System.out.println(max * 100);
		}
	}
}
