package practice.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
1) 그래프의 모든 정점을 방문하는 것이 주요한 문제
단순히 모든 정점을 방문하는 것이 중요한 문제의 경우 DFS, BFS 두 가지 방법 중 어느 것을 사용해도 상관없다
→ 둘 중 편한 것 사용

2) 경로의 특징을 저장해둬야 하는 문제
예를 들면 각 정점에 숫자가 적혀있고 a부터 b까지 가는 경로를 구하는데 경로에 같은 숫자가 있으면 안 된다는 문제 등, 각각의 경로마다 특징을 저장해둬야 할 때는 DFS를 사용한다
→ BFS는 경로의 특징을 가지지 못함

3) 최단거리 구해야 하는 문제
미로 찾기 등 최단거리를 구해야 할 경우, BFS가 유리하다. 왜냐하면 깊이 우선 탐색으로 경로를 검색할 경우 처음으로 발견되는 해답이 최단거리가 아닐 수 있지만, 너비 우선 탐색으로 현재 노드에서 가까운 곳부터 찾기 때문에 경로를 탐색 시 먼저 찾아지는 해답이 곧 최단거리기 때문이다.
→ 최단거리는 BFS
*/
public class Graph {
	private final ArrayList<ArrayList<Integer>> graphList;
	static boolean[] visit;

	public ArrayList<ArrayList<Integer>> getListGraph() {
		return graphList;
	}

	// 그래프 size+1 만큼 초기화
	public Graph(int size) {
		visit = new boolean[size + 1];
		graphList = new ArrayList<>();
		for (int i = 0; i < size + 1; i++) {
			graphList.add(new ArrayList<>());
			visit[i] = false;
		}
	}

	// 간선 설정(양방향)
	public void addEdgeUndirected(int x, int y) {
		graphList.get(x).add(y);
		graphList.get(y).add(x);
	}

	// 간선 설정(단방향)
	public void addEdgeDirected(int x, int y) {
		graphList.get(x).add(y);
	}

	// 그래프 탐색 DFS(Depth First Search)
	public void dfs(int x) {
		// 방문처리
		visit[x] = true;
		System.out.print(x + " ");

		// 인접리스트 탐색(재귀)
		for (int i = 0; i < graphList.get(x).size(); i++) {
			int y = graphList.get(x).get(i);
			if (!visit[y]) {
				dfs(y);
			}
		}
	}

	// 그래프 탐색 BFS(Breadth First Search)
	public void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		visit[v] = true;
		q.offer(v);	// add

		while (!q.isEmpty()) {
			int x = q.poll();	// del
			System.out.print(x + " ");
			for (int i = 0; i < graphList.get(x).size(); i++) {
				int y = graphList.get(x).get(i);
				if (!visit[y]) {
					visit[y] = true;
					q.offer(y);
				}
			}
		}
	}

	public static void main(String[] args) {
		Graph _graph = new Graph(6);
		_graph.addEdgeUndirected(3, 6);
		_graph.addEdgeUndirected(4, 3);
		_graph.addEdgeUndirected(3, 2);
		_graph.addEdgeUndirected(1, 3);
		_graph.addEdgeUndirected(1, 2);
		_graph.addEdgeUndirected(2, 4);
		_graph.addEdgeUndirected(5, 2);

		long startTime = System.currentTimeMillis();
		//_graph.dfs(5);
		_graph.bfs(1);
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime) + "ms");
	}
}
