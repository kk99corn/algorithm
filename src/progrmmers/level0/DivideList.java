package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: 리스트 자르기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181897
*/
public class DivideList {

	public int[] solution(int n, int[] slicer, int[] num_list) {
		int[] answer;
		switch (n) {
			case 1:
				answer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
				break;
			case 2:
				answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
				break;
			case 3:
				answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
				break;
			case 4:
				int[] temp = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
				int answerSize = temp.length / slicer[2];
				int x = (temp.length % slicer[2] != 0) ? 1 : 0;
				answer = new int[answerSize + x];
				int idx = 0;
				for (int i = 0; i < temp.length; i += slicer[2]) {
					answer[idx] = temp[i];
					idx++;
				}
				break;
			default:
				answer = null;
				break;
		}
		return answer;
	}

	public static void main(String[] args) {
		DivideList solution = new DivideList();

		int n = 3;
		int[] slicer = {1, 5, 2};
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] solution1 = solution.solution(n, slicer, num_list);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
