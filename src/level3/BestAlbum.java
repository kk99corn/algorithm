package level3;

import java.util.*;

/*
programmers
level: 3
title: 베스트앨범
url: https://programmers.co.kr/learn/courses/30/lessons/42579
*/
public class BestAlbum {

	public int[] solution(String[] genres, int[] plays) {
		// 데이터 수
		int dataCount = genres.length;

		// 사전 데이터 세팅
		HashMap<String, LinkedHashMap<String, Integer>> musicMap = new HashMap<>();
		HashMap<String, Integer> genreRankMap = new HashMap<>();
		for (int i = 0; i < dataCount; i++) {
			genreRankMap.put(genres[i], genreRankMap.getOrDefault(genres[i], 0) + plays[i]);

			LinkedHashMap<String, Integer> temp = musicMap.getOrDefault(genres[i], new LinkedHashMap<>());
			temp.put(Integer.toString(i), plays[i]);
			musicMap.put(genres[i], temp);
		}

		for (String musicKey : musicMap.keySet()) {
			LinkedHashMap<String, Integer> result = sortMapByValue(musicMap.get(musicKey));
			musicMap.put(musicKey, result);
		}


		// 값으로 내림차순 정렬
		genreRankMap = sortMapByValue(genreRankMap);

		// 결과 세팅
		ArrayList<Integer> answerList = new ArrayList<>();
		for (String genre : genreRankMap.keySet()) {
			LinkedHashMap<String, Integer> musicInfo = musicMap.get(genre);
			int i = 0;
			for (String idx : musicInfo.keySet()) {
				if (i < 2) {
					answerList.add(Integer.parseInt(idx));
				}
				i++;
			}
		}

		// 결과 List -> Array 변경
		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}
		return answer;
	}

	// Map 내림차순 정렬
	public static LinkedHashMap<String, Integer> sortMapByValue(Map<String, Integer> map) {
		List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
		entries.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

		LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : entries) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};

		BestAlbum bestAlbum = new BestAlbum();
		int[] solution = bestAlbum.solution(genres, plays);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
