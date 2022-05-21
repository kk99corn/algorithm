package level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
programmers
level: 3
title: 가장 먼 노드
url: https://programmers.co.kr/learn/courses/30/lessons/49189
*/
public class LongDistanceNode {
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

	public int solution(int n, int[][] edge) {
		// 1. 그래프 생성
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}

		for (int[] edgeInfo : edge) {
			graph.get(edgeInfo[0]).add(edgeInfo[1]);
			graph.get(edgeInfo[1]).add(edgeInfo[0]);
		}

		int answer = bfs(1);
		return answer;
	}

	public int bfs(int s) {
		boolean[] visited = new boolean[graph.size()];
		Queue<Integer> q = new LinkedList<>();
		q.offer(s);
		visited[s] = true;

		int cnt = 0;
		while (true) {
			// 같은 깊이의 노드들을 임시 저장하기 위한 temp 큐 생성
			Queue<Integer> temp = new LinkedList<>();
			while (!q.isEmpty()) {
				int x = q.poll();

				for (int i = 0; i < graph.get(x).size(); i++) {
					int y = graph.get(x).get(i);
					if (!visited[y]) {
						visited[y] = true;
						// q.offer(y);
						// x와 인접하며, 아직 방문하지 않은 node temp 큐에 입력
						temp.add(y);
					}
				}
			}
			// 더이상 인접한 노드가 없는 경우 break
			if (temp.isEmpty()) break;

			// 최단거리로 s와 가장 멀리 떨어진 node 수
			cnt = temp.size();

			// temp에 있던 인접한 노드들 다시 메인 q에 입력
			q.addAll(temp);
		}
		return cnt;
	}

	public static void main(String[] args) {
		int n = 6;
		int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

		LongDistanceNode longDistanceNode = new LongDistanceNode();
		int solution = longDistanceNode.solution(n, vertex);
		System.out.println("solution = " + solution);
	}
}
