package level2;

import java.util.Arrays;

/*
programmers
level: 2
title: 이진 변환 반복하기
url: https://programmers.co.kr/learn/courses/30/lessons/70129
*/
public class BinaryTransformation {
	public int[] solution(String s) {
		int[] answer = new int[2];

		while (true) {
			answer[0]++;
			StringBuilder temp = new StringBuilder();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') temp.append(1);
				else answer[1]++;
			}

			if (temp.length() == 1) return answer;
			s = Integer.toBinaryString(temp.length());
		}
	}

	public static void main(String[] args) {
		BinaryTransformation binaryTransformation = new BinaryTransformation();
		int[] solution = binaryTransformation.solution("110010101001");
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
