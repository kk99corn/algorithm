package progrmmers.level1;

import java.util.HashMap;

/*
programmers
level: 1
title: 숫자 문자열과 영단어
url: https://programmers.co.kr/learn/courses/30/lessons/81301
*/
public class NumberEnglishWords {

	public int solution_stream(String s) {
		HashMap<String, Integer> matchMap = new HashMap<>();
		matchMap.put("zero", 0);
		matchMap.put("one", 1);
		matchMap.put("two", 2);
		matchMap.put("three", 3);
		matchMap.put("four", 4);
		matchMap.put("five", 5);
		matchMap.put("six", 6);
		matchMap.put("seven", 7);
		matchMap.put("eight", 8);
		matchMap.put("nine", 9);

		String result = matchMap.entrySet().stream()
				.reduce(s, (acc, entry) -> acc.replace(entry.getKey(), entry.getValue().toString()), (s1, s2) -> s1);

		return Integer.parseInt(result);
	}

	public int solution(String s) {
		// 사전 데이터 세팅
		HashMap<String, Integer> matchMap = new HashMap<>();
		matchMap.put("zero", 0);
		matchMap.put("one", 1);
		matchMap.put("two", 2);
		matchMap.put("three", 3);
		matchMap.put("four", 4);
		matchMap.put("five", 5);
		matchMap.put("six", 6);
		matchMap.put("seven", 7);
		matchMap.put("eight", 8);
		matchMap.put("nine", 9);

		int answer = 0;
		for(String numberStr: matchMap.keySet()) {
			// 숫자 -> 문자 형변환: Integer.toString()
			s = s.replace(numberStr, Integer.toString(matchMap.get(numberStr)));
			try {
				// 문자 -> 숫자 형변화: Integer.parseInt()
				answer = Integer.parseInt(s);
				break;
			} catch(NumberFormatException e) {
				// 변환데이터 남아있는 상태
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		NumberEnglishWords numberEnglishWords = new NumberEnglishWords();
		String s = "one4seveneight";
		int result = numberEnglishWords.solution_stream(s);
		System.out.println("result = " + result);
	}
}
