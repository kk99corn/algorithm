package progrmmers.level3;

import java.util.*;

/*
programmers
level: 3
title: 가장 먼 노드
url: https://programmers.co.kr/learn/courses/30/lessons/49189
*/
public class LongDistanceNode2 {
	static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
	static Integer[] distanceArr;
	static boolean[] visit;

	static class Node implements Comparable<Node>{
		int idx;
		int dist;
		public Node(int idx, int dist) {
			this.idx = idx;
			this.dist = dist;
		}

		@Override
		public int compareTo(Node n) {
			return Integer.compare(this.dist, n.dist);
		}
	}

	public int solution(int n, int[][] edge) {
		// 1. 그래프 생성
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}

		for (int[] edgeInfo : edge) {
			graph.get(edgeInfo[0]).add(new Node(edgeInfo[1], 1));
			graph.get(edgeInfo[1]).add(new Node(edgeInfo[0], 1));
		}

		distanceArr = new Integer[n + 1];
		Arrays.fill(distanceArr, Integer.MAX_VALUE);
		distanceArr[0] = -1;

		visit = new boolean[n + 1];

		// int answer = bfs(1);
		bfs(1);
		Arrays.sort(distanceArr, Collections.reverseOrder());

		int max = distanceArr[0];
		int answer = 0;
		for (Integer distance : distanceArr) {
			if (max == distance) answer++;
			if (max > distance) break;
		}

		return answer;
	}

	// 다익스트라
	public void bfs(int index) {
		PriorityQueue<Node> pQ = new PriorityQueue<>();

		distanceArr[index] = 0;
		pQ.offer(new Node(index, 0));

		while(!pQ.isEmpty()) {
			Node node = pQ.poll();
			int nodeIndex = node.idx;
			int nodeDistance = node.dist;

			// 방문여부
			if (visit[nodeIndex]) {
				continue;
			} else {
				visit[nodeIndex] = true;
			}

			for(Node linkedNode : graph.get(nodeIndex)) {
				if (distanceArr[linkedNode.idx] > nodeDistance + linkedNode.dist) {
					distanceArr[linkedNode.idx] = nodeDistance + linkedNode.dist;
					linkedNode.dist = nodeDistance + linkedNode.dist;
					pQ.offer(linkedNode);
				}
			}
		}
	}

	public static void main(String[] args) {
		int n = 6;
		int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

		LongDistanceNode2 longDistanceNode = new LongDistanceNode2();
		int solution = longDistanceNode.solution(n, vertex);
		System.out.println("solution = " + solution);
	}
}
