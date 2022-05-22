package practice.graph;

import java.util.*;

// https://codingnojam.tistory.com/46
public class Graph2 {
	static final int INF = Integer.MAX_VALUE;
	static ArrayList<ArrayList<Node>> graph = new ArrayList<>();
	static int[] distance;
	static boolean[] visit;

	static class Node implements Comparable<Node> {
		int index;
		int distance;

		public Node(int index, int distance) {
			this.index = index;
			this.distance = distance;
		}

		// 최단거리를 기준으로 오름차순 정렬합니다.
		@Override
		public int compareTo(Node o) {
			return Integer.compare(this.distance, o.distance);
		}
	}

	// 간선 설정(양방향)
	public void addEdgeUndirected(int x, int y, int dist) {
		graph.get(x).add(new Node(y, dist));
		graph.get(y).add(new Node(x, dist));
	}

	// 간선 설정(단방향)
	public void addEdgeDirected(int x, int y, int dist) {
		graph.get(x).add(new Node(y, dist));
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

//			// #2. 거리로 방문 여부 체크
//			// 큐에서 꺼낸 거리와 최단거리테이블의 값을 비교해서 방문처리를 합니다.
//			// 큐는 최단거리를 기준으로 오름차순 정렬되고 있습니다.
//			// 만약 현재 꺼낸 노드의 거리가 최단거리테이블의 값보다 크다면 해당 노드는 이전에 방문된 노드입니다.
//			// 그러므로 해당노드와 연결 된 노드를 탐색하지 않고 큐에서 다음 노드를 꺼냅니다.
//			if (dist > distance[nodeIndex]) {
//				continue;
//			}

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
		int size = 6;

		// 그래프 생성
		for (int i = 0; i <= size; i++) {
			graph.add(new ArrayList<>());
		}

		// 최단거리테이블 생성
		distance = new int[size + 1];
		Arrays.fill(distance, INF);

		// 방문처리테이블
		visit = new boolean[size + 1];

		Graph2 _graph = new Graph2();
		_graph.addEdgeUndirected(3, 6, 1);
		_graph.addEdgeUndirected(4, 3, 1);
		_graph.addEdgeUndirected(3, 2, 1);
		_graph.addEdgeUndirected(1, 3, 1);
		_graph.addEdgeUndirected(1, 2, 1);
		_graph.addEdgeUndirected(2, 4, 1);
		_graph.addEdgeUndirected(5, 2, 1);

		_graph.dijkstra(1);

		System.out.println("Arrays.toString(distance = " + Arrays.toString(distance));
	}
}
