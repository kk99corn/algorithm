package level2;

import java.util.LinkedList;
import java.util.Queue;

/*
programmers
level: 2
title: 게임 맵 최단거리
url: https://programmers.co.kr/learn/courses/30/lessons/1844
*/
public class MapDistance {
	// 맵크기
	int n, m;

	// 방문체크
	boolean[][] visited;

	// 상하좌우 이동용 변수
	int[] dx = {0, 1, 0, -1};
	int[] dy = {-1, 0, 1, 0};

	// 거리정보
	public class Node {
		int x, y, dist;

		public Node(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
	}

	public int bfs(int x, int y, int[][] maps) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x, y, 1));
		visited[x][y] = true;

		while (!q.isEmpty()) {
			Node node = q.poll();
			if (node.x == n - 1 && node.y == m - 1) return node.dist;

			for (int i = 0; i < dx.length; i++) {
				int nextX = node.x + dx[i];
				int nextY = node.y + dy[i];
				if ((nextX >= 0 && nextX < n) && (nextY >= 0 && nextY < m)) {
					if (maps[nextX][nextY] == 1 && !visited[nextX][nextY]) {
						visited[nextX][nextY] = true;
						q.offer(new Node(nextX, nextY, node.dist + 1));
					}
				}
			}
		}

		return -1;
	}

	public int solution(int[][] maps) {
		n = maps.length;
		m = maps[0].length;

		visited = new boolean[n][m];

		return bfs(0, 0, maps);
	}

	public static void main(String[] args) {
		int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
		MapDistance map = new MapDistance();
		int solution = map.solution(maps);
		System.out.println("solution = " + solution);
	}
}
