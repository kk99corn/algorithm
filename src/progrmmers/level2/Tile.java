package progrmmers.level2;

/*
programmers
level: 2
title: 2 x n 타일링
url: https://programmers.co.kr/learn/courses/30/lessons/12900
*/
public class Tile {
	public int solution(int n) {
		int[] arr = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			if (i <= 2) {
				arr[i] = i;
			} else {
				arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
			}
		}
		return arr[n];
	}

	public static void main(String[] args) {
		Tile tile = new Tile();
		int solution = tile.solution(4);
		System.out.println("solution = " + solution);
	}
}
