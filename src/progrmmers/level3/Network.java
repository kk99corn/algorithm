package progrmmers.level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
programmers
level: 3
title: 네트워크
url: https://programmers.co.kr/learn/courses/30/lessons/43162
*/
public class Network {
	// 미방문한 컴퓨터 리스트
	ArrayList<Integer> computerList = new ArrayList<>();

	public int solution(int n, int[][] computers) {
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
			computerList.add(i);
		}

		// 컴퓨터간 관계 설정
		for (int i = 0; i < computers.length; i++) {
			for (int j = 0; j < computers[i].length; j++) {
				if (i == j) continue;
				if (computers[i][j] != 0) {
					graph.get(i).add(j);
				}
			}
		}
		System.out.println("graph = " + graph);
		System.out.println("computerList = " + computerList);

		int answer = 0;
		// 미방문한 컴퓨터 리스트가 없을 때 까지 반복
		while (!computerList.isEmpty()) {
			bfs(computerList.get(0), graph);
			answer++;
		}

		return answer;
	}

	public void bfs(int v, ArrayList<ArrayList<Integer>> graph) {
		boolean[] visit = new boolean[graph.size()];
		Queue<Integer> q = new LinkedList<>();
		q.offer(v);
		visit[v] = true;
		// 최초 노드는 방문이 완료됐기 때문에, 미방문 리스트에서 제거
		computerList.remove(Integer.valueOf(v));
		System.out.println("computerList = " + computerList);

		while (!q.isEmpty()) {
			int x = q.poll();
			for (int i = 0; i < graph.get(x).size(); i++) {
				int e = graph.get(x).get(i);
				if (!visit[e]) {
					visit[e] = true;
					q.offer(e);
					if (computerList.contains(e)) {
						// 방문한 노드는 미방문 리스트에서 제거
						computerList.remove(Integer.valueOf(e));
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int n = 3;
		int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

		Network network = new Network();
		int solution = network.solution(n, computers);
		System.out.println("solution = " + solution);
	}
}
