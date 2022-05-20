package level2;

import java.util.*;

/*
programmers
level: 2
title: 프린터
url: https://programmers.co.kr/learn/courses/30/lessons/42587
*/
public class Printer {
	public int solution(int[] priorities, int location) {
		Queue<HashMap<Integer, Integer>> q = new LinkedList<>();
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < priorities.length; i++) {
			HashMap<Integer, Integer> tempMap = new HashMap<>();
			tempMap.put(i, priorities[i]);
			q.offer(tempMap);
			a.add(i);
		}
		System.out.println("q = " + q);
		int answer = 0;
		while (!q.isEmpty()) {
			HashMap<Integer, Integer> currentMap = q.poll();
			Map.Entry<Integer, Integer> entry = currentMap.entrySet().iterator().next();

			a.remove(entry.getKey());

			boolean isOk = true;
			for (int i = 0; i < a.size(); i++) {
				if (entry.getKey().equals(a.get(i))) {
					continue;
				}
				if (entry.getValue() < priorities[a.get(i)]) {
					isOk = false;
					q.offer(currentMap);
					a.add(entry.getKey());
					break;
				}
			}
			if (isOk) {
				answer++;
				if (entry.getKey().equals(location)) {
					// System.out.println("entry = " + entry.getKey() + " cnt: " + cnt);
					return answer;
				}
			}
		}

		System.out.println("q = " + q);
		return answer;
	}

	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		Printer printer = new Printer();
		int solution1 = printer.solution(priorities, location);
		System.out.println("solution1 = " + solution1);
	}
}
