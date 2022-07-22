package progrmmers.level2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
programmers
level: 2
title: 기능개발
url: https://programmers.co.kr/learn/courses/30/lessons/42586
*/
public class FuncDevel {
	public int[] solution(int[] progresses, int[] speeds) {

		// 결과 담을 맵
		LinkedHashMap<Integer, Integer> answerMap = new LinkedHashMap<>();

		// 큐 세팅
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < progresses.length; i++) {
			q.add(progresses[i]);
		}

		int day = 1;	// 업무일수
		int idx = 0;
		while (!q.isEmpty()) {
			// 큐는 처리되어야할 작업 순서
			// 큐에 담긴 첫 값 조회
			int x = q.remove();

			// 현재 작업 진도
			int progress = x;
			while (true) {
				// 날짜별 작업 진도
				progress = x + (speeds[idx] * day);

				// 진도 100 달성시 ㅌㅌ
				if (progress >= 100) {
					break;
				} else {
					// 진도 100 못넘을시 하루지남,,
					day++;
				}
			}
			idx++;
			answerMap.put(day, answerMap.getOrDefault(day, 0) + 1);
		}

		// 결과 세팅
		int[] answer = new int[answerMap.size()];
		int i = 0;
		for (Integer key: answerMap.keySet()) {
			answer[i] = answerMap.get(key);
			i++;
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};

		FuncDevel funcDevel = new FuncDevel();
		int[] solution = funcDevel.solution(progresses, speeds);
		System.out.println(Arrays.toString(solution));
	}
}
