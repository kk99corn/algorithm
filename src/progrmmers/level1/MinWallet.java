package progrmmers.level1;

/*
programmers
level: 1
title: 최소직사각형
url: https://programmers.co.kr/learn/courses/30/lessons/86491
*/
public class MinWallet {
	public int solution(int[][] sizes) {
		int width = 0;
		int height = 0;
		for (int[] size : sizes) {
			int max = Math.max(size[0], size[1]);
			int min = Math.min(size[0], size[1]);
			if (width < max) width = max;
			if (height < min) height = min;
		}
		return width * height;
	}

	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		MinWallet minWallet = new MinWallet();
		int result = minWallet.solution(sizes);
		System.out.println("result = " + result);
	}
}
