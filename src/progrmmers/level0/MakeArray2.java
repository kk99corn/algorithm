package progrmmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
programmers
level: 0
title: 배열 만들기 2
url: https://school.programmers.co.kr/learn/courses/30/lessons/181921
*/
public class MakeArray2 {

	public int[] solution(int l, int r) {
		List<Integer> list = new ArrayList<>();
		for (int i = l; i <= r; ) {
			if (Integer.toString(i).matches("[05]+")) {
				list.add(i);
			}

			if (i % 5 == 0) {
				i += 5;
			} else {
				i++;
			}
		}

		return list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		int l = 5;
		int r = 555;
		MakeArray2 solution = new MakeArray2();
		int[] solution1 = solution.solution(l, r);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
