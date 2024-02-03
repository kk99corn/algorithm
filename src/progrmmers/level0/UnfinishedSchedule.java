package progrmmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
programmers
level: 0
title: 할 일 목록
url: https://school.programmers.co.kr/learn/courses/30/lessons/181885
*/
public class UnfinishedSchedule {

	public String[] solution(String[] todo_list, boolean[] finished) {
		List<String> answer = new ArrayList<>();
		for (int i = 0; i < todo_list.length; i++) {
			if (!finished[i]) answer.add(todo_list[i]);
		}
		return answer.toArray(String[]::new);
	}

	public static void main(String[] args) {
		UnfinishedSchedule solution = new UnfinishedSchedule();

		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished = {true, false, true, false};
		String[] result = solution.solution(todo_list, finished);
		System.out.println("result = " + Arrays.toString(result));
	}
}
