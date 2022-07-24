package baekjoon.step5;

/*
baekjoon
step: 5
title: 정수 N개의 합
url: https://www.acmicpc.net/problem/15596
*/
public class Sum {
	long sum(int[] a) {
		long ans = 0;
		for (int num: a) {
			ans += num;
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] a = {1, 3, 5, 8};
		Sum sum = new Sum();
		long sum1 = sum.sum(a);
		System.out.println("sum1 = " + sum1);
	}
}
