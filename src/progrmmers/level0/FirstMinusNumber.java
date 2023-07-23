package progrmmers.level0;

/*
programmers
level: 0
title: 첫 번째로 나오는 음수
url: https://school.programmers.co.kr/learn/courses/30/lessons/181896
*/
public class FirstMinusNumber {

	public int solution(int[] num_list) {
		int answer = -1;
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] < 0) {
				answer = i;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		FirstMinusNumber solution = new FirstMinusNumber();

		int[] num_list = {12, 4, 15, 46, 38, -2, 15};
		int result = solution.solution(num_list);
		System.out.println("result = " + (result));
	}
}
