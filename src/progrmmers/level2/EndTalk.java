package progrmmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
programmers
level: 2
title: 끝말잇기
url: https://programmers.co.kr/learn/courses/30/lessons/12981
*/
public class EndTalk {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];

		// 사용된 단어 리스트
		List<String> usedWordList = new ArrayList<>();

		// 첫번째 단어는 바로 리스트에 삽입
		usedWordList.add(words[0]);

		// 끝말잇기 정상 수행 여부
		boolean isOk = true;
		int i;
		for (i = 1; i < words.length; i++) {
			// 이미 사용된 단어 확인
			if (usedWordList.contains(words[i])) {
				isOk = false;
				break;
			} else {
				// 이전단어끝글자와 현재단어앞글자 확인
				if (!(words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0))) {
					isOk = false;
					break;
				}
			}
			usedWordList.add(words[i]);
		}

		if (!isOk) {
			answer[0] = ((i + 1) % n == 0) ? n : (i + 1) % n;
			answer[1] = (int) Math.ceil((double) (i + 1) / n);
		}

		return answer;
	}

	public static void main(String[] args) {
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		EndTalk endTalk = new EndTalk();
		int[] solution = endTalk.solution(n, words);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
