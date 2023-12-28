package progrmmers.level0;

/*
programmers
level: 0
title: 이어 붙인 수
url: https://school.programmers.co.kr/learn/courses/30/lessons/181928
*/
public class AddNumber {

	public int solution(int[] num_list) {
		String a = "";
		String b = "";

		for (int num : num_list) {
			if (num % 2 == 1) {
				a += Integer.toString(num);
			} else {
				b += Integer.toString(num);
			}
		}

		return Integer.parseInt(a) + Integer.parseInt(b);
	}

	public static void main(String[] args) {
		AddNumber solution = new AddNumber();

		int[] num_list = {3, 4, 5, 2, 1};
		int result = solution.solution(num_list);
		System.out.println("result = " + (result));
	}
}
