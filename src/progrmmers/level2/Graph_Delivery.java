package progrmmers.level2;

import java.util.*;

/*
programmers
level: 2
title: 배달
url: https://programmers.co.kr/learn/courses/30/lessons/12978
*/
public class Graph_Delivery {

	static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
	static int[] distance;
	static boolean[] visit;

	class Node implements Comparable<Node> {
		int index;
		int distance;

		public Node(int i, int d) {
			this.index = i;
			this.distance = d;
		}

		@Override
		public String toString() {
			return "index=" + index + ", distance=" + distance;
			// return "index=" + index;
		}

		// 최단거리를 기준으로 오름차순 정렬합니다.
		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.distance, o.distance);
		}
	}

	public int solution(int N, int[][] road, int K) {
		// graph 세팅
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}

		// 최단거리 최초 세팅
		distance = new int[N + 1];
		Arrays.fill(distance, Integer.MAX_VALUE);

		// 방문처리 테이블 세팅
		visit = new boolean[N + 1];

		for (int i = 0; i < road.length; i++) {
			int x = road[i][0];
			int y = road[i][1];
			int d = road[i][2];

			// graph 간선 세팅
			graph.get(x).add(new Node(y, d));
			graph.get(y).add(new Node(x, d));
		}

		// 각 노드별 최단거리 세팅
		dijkstra(1);

		int answer = 0;
		for (int d : distance) {
			if (d <= K) {
				answer++;
			}
		}

		return answer;
	}

	public void dijkstra(int index) {
		// 최단거리가 갱신된 노드들을 담을 우선순위 큐 생성
		PriorityQueue<Node> pQ = new PriorityQueue<>();
		// 최단거리테이블의 시작지점 노드의 거리 0으로 갱신
		distance[index] = 0;
		pQ.offer(new Node(index, 0));

		while (!pQ.isEmpty()) {
			Node node = pQ.poll();
			int nodeIndex = node.index;
			int dist = node.distance;

			// #1. 기존 방식으로 방문여부 체크
			if (visit[nodeIndex]) {
				continue;
			} else {
				visit[nodeIndex] = true;
			}

			// 큐에서 꺼낸 노드에서 이동 가능 한 노드들을 탐색합니다.
			for (Node linkedNode : graph.get(nodeIndex)) {
				// 해당노드를 거쳐서 다음 노드로 이동 할 떄의 값이 다음 이동노드의 최단거리테이블 값보다 작을 때
				if (dist + linkedNode.distance < distance[linkedNode.index]) {
					// if문의 조건을 만족했다면 최단거리테이블의 값을 갱신합니다.
					distance[linkedNode.index] = dist + linkedNode.distance;
					// 갱신 된 노드를 우선순위 큐에 넣어줍니다.
					pQ.offer(new Node(linkedNode.index, distance[linkedNode.index]));
				}
			}
		}
	}

	public static void main(String[] args) {
		Graph_Delivery graph_delivery = new Graph_Delivery();
		int N = 6;
		int[][] road = {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}};
		int K = 4;

		int solution = graph_delivery.solution(N, road, K);
		System.out.println("solution = " + solution);
	}
}
