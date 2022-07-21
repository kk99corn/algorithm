package practice.test;

import java.util.*;

public class Rank {
	public int[] solution(int[] grade) {
		int[] answer = new int[grade.length];

		// 점수배열 내림차순 정렬을 위한 Integer arr 생성
		Integer[] gradeArr = new Integer[grade.length];
		for (int i = 0; i < grade.length; i++) {
			gradeArr[i] = grade[i];
		}
		Arrays.sort(gradeArr, Collections.reverseOrder());
		// gradeArr 3 2 2 1 1


		// 점수별 랭킹
		Map<Integer, Integer> gradeMap = new HashMap<>();
		for (int i = 0; i < gradeArr.length; i++) {
			// 점수별 랭킹 세팅되있지 않은경우 랭킹 세팅
			if (!gradeMap.containsKey(gradeArr[i])) {
				gradeMap.put(gradeArr[i], i + 1);
			}
		}

		// return arr 세팅
		for (int i = 0; i < grade.length; i++) {
			answer[i] = gradeMap.get(grade[i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] grade = {3, 2, 1, 2, 1};
		Rank test = new Rank();
		int[] solution = test.solution(grade);
		System.out.println(Arrays.toString(solution));
	}
}
