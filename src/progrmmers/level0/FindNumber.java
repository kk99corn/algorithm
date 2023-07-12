package progrmmers.level0;

/*
programmers
level: 0
title: 정수 찾기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181840
*/
public class FindNumber {

	public int solution(int[] num_list, int n) {
		int answer = 0;
		for (int num : num_list) {
			if (num == n) {
				answer = 1;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		FindNumber solution = new FindNumber();

		int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
		int n = 3;
		int solution1 = solution.solution(num_list, n);
		System.out.println("result = " + (solution1));
	}
}
