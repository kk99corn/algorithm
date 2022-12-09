package progrmmers.level0;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/*
programmers
level: 0
title: 가장 큰 수 찾기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120899
*/
public class SearchMax {

	public int[] solution(int[] array) {
		List<Integer> numList = Arrays.stream(array).boxed().collect(Collectors.toList());
		int maxNum = numList.stream().mapToInt(x -> x).max().orElseThrow(NoSuchElementException::new);
		int maxIndex = numList.indexOf(maxNum);

		int[] answer = new int[2];
		answer[0] = maxNum;
		answer[1] = maxIndex;

		return answer;
	}

	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		SearchMax solution = new SearchMax();
		int[] solution1 = solution.solution(array);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
