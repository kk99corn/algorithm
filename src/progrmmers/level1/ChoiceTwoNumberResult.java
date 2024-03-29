package progrmmers.level1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.IntStream;

/*
programmers
level: 1
title: 두 개 뽑아서 더하기
url: https://programmers.co.kr/learn/courses/30/lessons/68644
*/
public class ChoiceTwoNumberResult {

	public int[] solution(int[] numbers) {
		// TreeSet value 중복제거 및 오름차순 정렬 저장
		TreeSet<Integer> treeSet = new TreeSet<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j) {
					treeSet.add(numbers[i] + numbers[j]);
				}
			}
		}

		int[] answer = new int[treeSet.size()];
		Iterator<Integer> it = treeSet.iterator();
		int idx = 0;
		while (it.hasNext()) {
			answer[idx] = it.next();
			idx++;
		}
		return answer;
	}

	public int[] solution_stream(int[] numbers) {
		// TreeSet value 중복제거 및 오름차순 정렬 저장
		TreeSet<Integer> treeSet = new TreeSet<>();
		IntStream.range(0, numbers.length)
				.flatMap(i -> IntStream.range(0, numbers.length)
						.filter(j -> i != j)
						.map(j -> numbers[i] + numbers[j]))
				.forEach(treeSet::add);

		return treeSet.stream()
				.mapToInt(Integer::intValue)
				.toArray();
	}
	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		ChoiceTwoNumberResult choiceTwoNumberResult = new ChoiceTwoNumberResult();
		int[] result = choiceTwoNumberResult.solution(numbers);
		System.out.println("result = " + Arrays.toString(result));

		int[] result2 = choiceTwoNumberResult.solution_stream(numbers);
		System.out.println("result2 = " + Arrays.toString(result2));
	}
}
