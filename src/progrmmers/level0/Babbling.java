package progrmmers.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
programmers
level: 0
title: 옹알이(1)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120956?language=java
*/
public class Babbling {

	public int solution(String[] babbling) {
		String[] ableWords = {"aya", "ye", "woo", "ma"};

		List<String> collect = Arrays.stream(babbling)
				.map(s -> {
					for (String word : ableWords) {
						if (s.contains(word)) {
							s = s.replaceFirst(word, "-");
						}
					}
					System.out.println(s);
					return s;
				})
				.filter(s -> s.replaceAll("-", "").equals(""))
				.collect(Collectors.toList());
		return collect.size();
}

	public static void main(String[] args) {
		String[] babblingArr = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		Babbling babbling = new Babbling();
		int result = babbling.solution(babblingArr);
		System.out.println("result = " + result);
	}
}
