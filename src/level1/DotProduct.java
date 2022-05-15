package level1;

/*
programmers
level: 1
title: 내적
url: https://programmers.co.kr/learn/courses/30/lessons/70128
*/
public class DotProduct {
	public int solution(int[] a, int[] b) {
		int answer = 0;
		int size = a.length;
		for (int i = 0; i < size; i++) {
			answer += a[i] * b[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		DotProduct dotProduct = new DotProduct();
		int solution = dotProduct.solution(a, b);
		System.out.println("solution = " + solution);
	}
}
