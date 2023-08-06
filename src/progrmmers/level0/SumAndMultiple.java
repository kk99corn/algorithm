package progrmmers.level0;

/*
programmers
level: 0
title: 원소들의 곱과 합
url: https://school.programmers.co.kr/learn/courses/30/lessons/181929
*/
public class SumAndMultiple {

	public int solution(int[] num_list) {
		int sum = 0;
		int mul = 1;
		for (int n : num_list) {
			sum += n;
			mul *= n;
		}

		return (mul < sum * sum) ? 1 : 0;
	}

	public static void main(String[] args) {
		SumAndMultiple solution = new SumAndMultiple();

		int[] num_list = {3, 4, 5, 2, 1};
		int result = solution.solution(num_list);
		System.out.println("result = " + (result));
	}
}
