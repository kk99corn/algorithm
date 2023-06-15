package progrmmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
programmers
level: 0
title: 배열의 원소 삭제하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181844
*/
public class RemoveArray {

	public int[] solution(int[] arr, int[] delete_list) {
		ArrayList<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
		ArrayList<Integer> deleteList = Arrays.stream(delete_list).boxed().collect(Collectors.toCollection(ArrayList::new));

		for (Integer d : deleteList) {
			list.remove(d);
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		RemoveArray solution = new RemoveArray();

		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
		int[] solution1 = solution.solution(arr, delete_list);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
