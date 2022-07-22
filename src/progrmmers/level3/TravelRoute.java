package progrmmers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
programmers
level: 3
title: 여행경로
url: https://programmers.co.kr/learn/courses/30/lessons/43164
*/
public class TravelRoute {
	boolean[] visited;
	List<String> pathList = new ArrayList<>();

	public String[] solution(String[][] tickets) {
		String[] answer;
		visited = new boolean[tickets.length];

		dfs("ICN", "ICN", tickets, 0);

		System.out.println("allRoute = " + pathList);
		Collections.sort(pathList);

		answer = pathList.get(0).split(" ");

		return answer;
	}

	public void dfs(String start, String path, String[][] tickets, int cnt) {
		if (cnt == tickets.length) {
			pathList.add(path);
			return;
		}

		for (int i = 0; i < tickets.length; i++) {
			if (start.equals(tickets[i][0]) && !visited[i]) {
				visited[i] = true;
				dfs(tickets[i][1], path + " " + tickets[i][1], tickets, cnt + 1);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
		TravelRoute travelRoute = new TravelRoute();
		String[] solution = travelRoute.solution(tickets);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
