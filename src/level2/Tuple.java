package level2;

import java.util.*;

/*
programmers
level: 2
title: 튜플
url: https://programmers.co.kr/learn/courses/30/lessons/64065
*/
public class Tuple {
	public int[] solution(String s) {
		List<List<Integer>> list = new ArrayList<>();
		// 튜플 array 세팅
		String[] sArr = s.split("},");
		for (String value : sArr) {
			// 데이터만 추출
			String[] tempStr = value.replace("{", "").replace("}", "").split(",");
			List<Integer> temp = new ArrayList<>();
			for (String tStr : tempStr) {
				temp.add(Integer.parseInt(tStr));
			}
			// 리스트 삽입
			list.add(temp);
		}
		// 리스트 length 순 정렬
		list.sort(Comparator.comparingInt(List::size));

		List<Integer> answerList = new ArrayList<>();
		for (List<Integer> integers : list) {
			for (Integer n : answerList) {
				// answerList 있는 데이터 제거
				integers.remove(n);
			}
			answerList.add(integers.get(0));
		}

		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		Tuple tuple = new Tuple();
		int[] solution = tuple.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
