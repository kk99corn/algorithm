package progrmmers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/*
programmers
level: 3
title: 이중우선순위큐
url: https://programmers.co.kr/learn/courses/30/lessons/42628
*/
public class DoublePriorityQueue {

	public int[] solution(String[] operations) {
		// operations 데이터 queue에 입력
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		PriorityQueue<Integer> rpQ = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (String oper: operations) {
			String[] operArr = oper.split(" ");
			switch (operArr[0]) {
				case "I":
					// I {숫자}: 숫자 입력
					pQ.offer(Integer.parseInt(operArr[1]));
					rpQ.offer(Integer.parseInt(operArr[1]));
					break;
				case "D":
					if (!pQ.isEmpty()) {
						if (operArr[1].equals("1")) {
							// D 1: 최대값 제거
							int max = rpQ.poll();
							pQ.remove(max);
						} else if (operArr[1].equals("-1")) {
							// D -1: 최소값 제거
							int min = pQ.poll();
							rpQ.remove(min);
						}
					}
					break;
			}
		}

		int[] answer = new int[2];
		if (!pQ.isEmpty()) {
			answer[0] = rpQ.poll();
			answer[1] = pQ.poll();
		}
		return answer;
	}

	// 최초 풀이(ArrayList)
	public int[] solution_first(String[] operations) {
		// operations 데이터 queue에 입력
		// PriorityQueue<Integer> pQ = new PriorityQueue<>();
		ArrayList<Integer> al = new ArrayList<>();

		for (String oper: operations) {
			String[] operArr = oper.split(" ");
			switch (operArr[0]) {
				case "I":
					// I {숫자}: 숫자 입력
					// pQ.offer(Integer.parseInt(operArr[1]));
					al.add(Integer.parseInt(operArr[1]));
					Collections.sort(al);
					break;
				case "D":
					if (!al.isEmpty()) {
						if (operArr[1].equals("1")) {
							// D 1: 최대값 제거
							al.remove(al.size() - 1);
						} else if (operArr[1].equals("-1")) {
							// D -1: 최소값 제거
							al.remove(0);
						}
					}
					break;
			}
		}

		int[] answer = new int[2];
		if (!al.isEmpty()) {
			answer[0] = al.get(al.size() - 1); //최대값
			answer[1] = al.get(0); //최소값
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] operations = {"I 7","I 5","I -5","D -1"};
		DoublePriorityQueue doublePriorityQueue = new DoublePriorityQueue();
		int[] solution = doublePriorityQueue.solution(operations);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
