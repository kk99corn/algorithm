package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 배열 회전시키기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120844
*/
public class TurnArray {

	public int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];
		int scrPos = 0;
		int destPos = 0;
		if (direction.equals("right")) {
			answer[0] = numbers[numbers.length - 1];
			destPos = 1;
		} else {
			answer[numbers.length - 1] = numbers[0];
			scrPos = 1;
		}
		System.arraycopy(numbers, scrPos, answer, destPos, numbers.length - 1);

		return answer;
	}

	public static void main(String[] args) {
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left";
		TurnArray solution = new TurnArray();
		int[] solution1 = solution.solution(numbers, direction);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
