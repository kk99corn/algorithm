package level2;

import java.util.ArrayList;
import java.util.Collections;

/*
programmers
level: 2
title: 모음사전
url: https://programmers.co.kr/learn/courses/30/lessons/84512
*/
public class Dictionary {
	static ArrayList<String> wordList = new ArrayList<>();

	// 최초풀이
	public int solution(String word) {
		String[] words = {"A", "E", "I", "O", "U"};

		for (int i = 0; i < 5; i++) {
			wordList.add(words[i]);
			for (int j = 0; j < 5; j++) {
				wordList.add(words[i] + words[j]);
				for (int k = 0; k < 5; k++) {
					wordList.add(words[i] + words[j] + words[k]);
					for (int l = 0; l < 5; l++) {
						wordList.add(words[i] + words[j] + words[k] + words[l]);
						for (int n = 0; n < 5; n++) {
							wordList.add(words[i] + words[j] + words[k] + words[l] + words[n]);
						}
					}
				}
			}
		}
		Collections.sort(wordList);
		int answer = 1;
		for (String s : wordList) {
			if (s.equals(word)) {
				break;
			}
			answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		int eio = dictionary.solution("EIO");
		System.out.println("eio = " + eio);
	}
}
