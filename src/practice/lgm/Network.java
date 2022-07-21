package practice.lgm;

import java.util.*;

public class Network {
	public static void main(String[] args) {
		Network network_0625 = new Network();
		System.out.println(network_0625.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
	}

	ArrayList<Integer> checkList = new ArrayList<>();
	public int answer = 0;
	public int solution(int n, int[][] computers) {
		ArrayList<ArrayList<Integer>> allList = new ArrayList<>();
		Boolean[] visit = new Boolean[computers.length];

		for (int i = 0; i < computers.length; i++) {
			ArrayList<Integer> subList = new ArrayList<>();
			for (int j = 0; j < computers.length; j++) {
				if (computers[i][j] == 1 && i != j) {
					subList.add(j);
				}
			}
			allList.add(subList);
			checkList.add(i);
			visit[i] = false;
		}

		System.out.println("allList = " + allList);
		System.out.println("checkList = " + checkList);

		while (!checkList.isEmpty()) {
			bfs(checkList.get(0), allList, visit);
		}

		return answer;
	}

	public void bfs(int n, ArrayList<ArrayList<Integer>> bfsList, Boolean[] bfsVisit) {
		Queue<Integer> queue = new LinkedList<>();
		bfsVisit[n] = true;
		queue.offer(n);

		System.out.println("checkList = " + checkList);

		while (!queue.isEmpty()) {
			int tempX = queue.poll();
			checkList.remove(0);

			for (int i = 0; i < bfsList.get(tempX).size(); i++) {
				int tempY = bfsList.get(tempX).get(i);
				if (!bfsVisit[tempY]) {
					bfsVisit[tempY] = true;
					queue.offer(tempY);
				}
			}
		}
		answer++;
	}
}
