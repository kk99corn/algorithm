package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
programmers
level: 2
title: 줄 서는 방법
url: https://programmers.co.kr/learn/courses/30/lessons/12936
*/
public class LineMethod {
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
	}
}
