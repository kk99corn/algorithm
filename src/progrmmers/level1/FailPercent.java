package progrmmers.level1;

import java.util.*;

/*
programmers
level: 1
title: 실패율
url: https://programmers.co.kr/learn/courses/30/lessons/42889
*/
public class FailPercent {
	public int[] solution(int N, int[] stages) {
		// stages 오름차순 정렬
		Arrays.sort(stages);

		// stage별 묶인사람 세팅
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 1; i <= N; i++) {
			hashMap.put(i, 0);
		}
		for (int stopStage : stages) {
			if (stopStage <= N) {
				hashMap.put(stopStage, hashMap.get(stopStage) + 1);
			}
		}

		int beforePerson = 0;
		TreeMap<Float, TreeSet<Integer>> percentHashMap = new TreeMap<>();
		for (Integer key : hashMap.keySet()) {
			float percent = 0.0f;
			if (stages.length - beforePerson != 0) {
				percent = hashMap.get(key) / (float) (stages.length - beforePerson) * 100;
			}
			TreeSet<Integer> temp;
			temp = percentHashMap.getOrDefault(percent, new TreeSet<>());
			temp.add(key);

			percentHashMap.put(percent, temp);
			beforePerson += hashMap.get(key);
		}

		int[] answer = new int[hashMap.size()];
		int idx = 0;
		for (Float percent : percentHashMap.descendingKeySet()) {
			TreeSet<Integer> temp = percentHashMap.get(percent);
			for (Integer integer : temp) {
				answer[idx] = integer;
				idx++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		FailPercent failPercent = new FailPercent();
		int[] solution = failPercent.solution(N, stages);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
