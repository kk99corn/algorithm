package practice.test;

import java.util.*;

public class FindFriendGraph {
	List<List<Integer>> graph = new ArrayList<>();
	int[] answer;

	public int[] solution(int n, int[][] relation) {
		answer = new int[n];
		// graph 초기화
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}

		// graph 세팅
		for (int i = 0; i < relation.length; i++) {
			graph.get(relation[i][0]).add(relation[i][1]);
			graph.get(relation[i][1]).add(relation[i][0]);
		}
		System.out.println(graph);

//        int a = findFriend(1, 2);
		for (int i = 0; i < answer.length; i++) {
			answer[i] = findFriend(i + 1, 2);
		}
		return answer;
	}

	public int findFriend(int idx, int depth) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(idx);
		boolean[] visited = new boolean[graph.size() + 1];
		visited[idx] = true;

		int currentDepth = 0;
		int friendCount = 0;
		while (true) {
			if (currentDepth > depth) break;
			Queue<Integer> temp = new LinkedList<>();
			while (!q.isEmpty()) {
				int x = q.poll();

				friendCount++;
				List<Integer> linkedNode = graph.get(x);
				for (int i = 0; i < linkedNode.size(); i++) {
					int y = linkedNode.get(i);
					if (!visited[y]) {
						visited[y] = true;
						temp.offer(y);
					}
				}
			}
			// 더이상 인접한 노드가 없는 경우 break
			if (temp.isEmpty()) break;

			// temp에 있던 인접한 노드들 다시 메인 q에 입력
			q.addAll(temp);

			currentDepth++;
		}
		return friendCount - 1;
	}

	public static void main(String[] args) {
		int n = 5;
		int[][] relation = {{1, 2}, {4, 2}, {3, 1}, {4, 5}, {4, 3}};
		FindFriendGraph test = new FindFriendGraph();
		int[] solution = test.solution(n, relation);
		System.out.println(Arrays.toString(solution));
	}
}
