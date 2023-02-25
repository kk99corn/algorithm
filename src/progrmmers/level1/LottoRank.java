package progrmmers.level1;

import java.util.Arrays;

/*
programmers
level: 1
title: 로또의 최고 순위와 최저 순위
url: https://programmers.co.kr/learn/courses/30/lessons/77484
*/
public class LottoRank {

	public int[] solution_stream(int[] lottos, int[] win_nums) {
		int[] result = {6, 6, 5, 4, 3, 2, 1};
		int sameCount = (int) Arrays.stream(lottos)
				.filter(n -> Arrays.stream(win_nums)
						.anyMatch(m -> m == n))
				.count();
		int zeroCount = (int) Arrays.stream(lottos)
				.filter(n -> n == 0)
				.count();

		int[] answer = new int[2];
		answer[0] = result[sameCount + zeroCount];
		answer[1] = result[sameCount];
		return answer;
	}

	public int[] solution(int[] lottos, int[] win_nums) {
		int[] result = {6, 6, 5, 4, 3, 2, 1};
		int sameCount = 0;
		int zeroCount = 0;
		for (int i = 0; i < 6; i++) {
			if (lottos[i] == 0) {
				zeroCount++;
				continue;
			}
			for (int j = 0; j < 6; j++) {
				if (lottos[i] == win_nums[j]) {
					sameCount++;
				}
			}
		}

		int[] answer = new int[2];
		answer[0] = result[sameCount + zeroCount];
		answer[1] = result[sameCount];
		return answer;
	}

	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		LottoRank lottoRank = new LottoRank();
		int[] solution = lottoRank.solution(lottos, win_nums);
		System.out.println("solution = " + Arrays.toString(solution));

		int[] solution2 = lottoRank.solution_stream(lottos, win_nums);
		System.out.println("solution = " + Arrays.toString(solution2));
	}
}
