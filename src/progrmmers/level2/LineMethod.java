package progrmmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
programmers
level: 2
title: 줄 서는 방법
url: https://programmers.co.kr/learn/courses/30/lessons/12936
*/
public class LineMethod {

	public int[] solutionStream(int n, long k) {
		List<Integer> list = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
		int[] answer = new int[n];
		k--;
		long num = IntStream.rangeClosed(1, n).mapToLong(Long::valueOf).reduce(1, (a, b) -> a * b);
		for (int i = 0; i < n; i++) {
			num /= (n - i);
			int index = (int) (k / num);
			answer[i] = list.remove(index);
			k %= num;
		}
		return answer;
	}

	public int[] solution(int n, long k) {
		int[] answer = new int[n];
		List<Integer> list = new ArrayList<>();
		long num = 1;
		int idx = 0;
		for (int x = 1; x <= n; x++) {
			list.add(x);
			num *= x;
		}
		k--;
		while (idx < answer.length) {
			num /= (n--);
			int i = (int) (k / num);
			answer[idx++] = list.get(i);
			list.remove(i);
			k %= num;
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 4;
		long k = 8;
		LineMethod lineMethod = new LineMethod();
		int[] solution = lineMethod.solution(n, k);
		System.out.println("solution = " + Arrays.toString(solution));

		int[] solution2 = lineMethod.solutionStream(n, k);
		System.out.println("solution = " + Arrays.toString(solution2));
	}
}
