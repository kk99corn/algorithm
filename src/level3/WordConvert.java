package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
programmers
level: 3
title: 단어 변환
url: https://programmers.co.kr/learn/courses/30/lessons/43163
*/
public class WordConvert {
	// 최초 풀이
	public int solution(String begin, String target, String[] word) {
		// word에 target 단어가 없는 경우 0 리턴
		if (!Arrays.asList(word).contains(target)) return 0;

		// 그래프 생성
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < word.length + 1; i++) {
			graph.add(new ArrayList<>());
		}

		// words에 begin 단어 포함
		String[] words = new String[word.length + 1];
		words[0] = begin;
		for (int i = 1; i < word.length + 1; i++) {
			words[i] = word[i - 1];
		}
		// System.out.println(Arrays.toString(words));

		// 그래프 edge 설정
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (i == j) continue;
				int diffCnt = 0;
				for (int x = 0; x < words[i].length(); x++) {
					if (words[i].charAt(x) != words[j].charAt(x))
						diffCnt++;
					if (diffCnt >= 2) continue;
					// 단어를 구성중인 알파벳을 각각 비교하여, 다른 부분이 1개인 경우 edge 설정
					if (x == words[i].length() - 1) {
						// System.out.println(words[i] + " " + words[j]);
						graph.get(i).add(j);
					}
				}
			}
			// System.out.println();
		}
		System.out.println(graph);

		return bfs(0, graph, words, target);
	}

	public int bfs(int v, ArrayList<ArrayList<Integer>> graph, String[] words, String target) {
		boolean[] visit = new boolean[graph.size()];
		Queue<Integer> q = new LinkedList<>();
		q.offer(v);
		visit[v] = true;

		int cnt = 0;
		while (true) {
			Queue<Integer> temp = new LinkedList<>();
			while (!q.isEmpty()) {
				int x = q.poll();
				for (int i = 0; i < graph.get(x).size(); i++) {
					int y = graph.get(x).get(i);
					if (!visit[y]) {
						visit[y] = true;
						// q.offer(y);
						temp.add(y);
					}
				}
			}

			if (temp.isEmpty()) return 0;
			cnt++;
			q.addAll(temp);
			while (!temp.isEmpty()) {
				int x = temp.poll();
				if (target.equals(words[x])) {
					return cnt;
				}
			}
		}
	}

	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		WordConvert wordConvert = new WordConvert();
		int solution = wordConvert.solution(begin, target, words);
		System.out.println("solution = " + solution);
	}
}
