package practice.coding.hh;

import java.util.*;

public class Test2 {
	public int solution(int[] scores, int k) {
		int count = scores.length;
		if (count == k) return 0;

		List<Integer> scoreList = new ArrayList<>();
		for (int score : scores) {
			scoreList.add(score);
		}

		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			list.add(new ArrayList<>());
		}

		r(scoreList, k, list);

		int answer = 0;
		return answer;
	}

	public void r(List<Integer> scoreList, int k, List<List<Integer>> list) {
		if (k == 1) {

		} else {
			for (int i = 0; i < scoreList.size() - k; i++) {
				List<Integer> tempScoreList = new ArrayList<>(scoreList);
				for (int j = 0; j <= i; j++) {
					tempScoreList.remove(0);
				}
				r(tempScoreList, k - 1, list);
			}
		}
	}

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		int[] scores = {1, 3, 7, 8, 10, 15};
		int k = 3;
		int solution = test2.solution(scores, k);
		System.out.println("solution = " + solution);
	}
}
