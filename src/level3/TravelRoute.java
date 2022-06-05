package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
programmers
level: 3
title: 여행경로
url: https://programmers.co.kr/learn/courses/30/lessons/43164
참조: https://velog.io/@rari_1110/DFS-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%97%AC%ED%96%89%EA%B2%BD%EB%A1%9C-JAVA
*/
public class TravelRoute {
	boolean[] visited;
	ArrayList<String> allRoute;

	public String[] solution(String[][] tickets) {
		String[] answer = {};
		int cnt = 0;
		visited = new boolean[tickets.length];
		allRoute = new ArrayList<>();

		dfs("ICN", "ICN", tickets, cnt);

		Collections.sort(allRoute);
		answer = allRoute.get(0).split(" ");

		return answer;
	}

	public void dfs(String start, String route, String[][] tickets, int cnt){
		if(cnt == tickets.length){
			allRoute.add(route);
			return;
		}

		for(int i=0; i<tickets.length; i++){
			if(start.equals(tickets[i][0]) && !visited[i]){
				visited[i] = true;
				dfs(tickets[i][1], route+" "+tickets[i][1], tickets, cnt+1);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		TravelRoute travelRoute = new TravelRoute();
		String[] solution = travelRoute.solution(tickets);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
