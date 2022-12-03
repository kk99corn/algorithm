package progrmmers.level0;

import java.util.HashMap;
import java.util.Map;

/*
programmers
level: 0
title: 모스부호 (1)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120838
*/
public class Morse {

	public String solution(String letter) {
		Map<String, String> morseMap = new HashMap<>();
		morseMap.put(".-", "a");
		morseMap.put("-...", "b");
		morseMap.put("-.-.", "c");
		morseMap.put("-..", "d");
		morseMap.put(".", "e");
		morseMap.put("..-.", "f");
		morseMap.put("--.", "g");
		morseMap.put("....", "h");
		morseMap.put("..", "i");
		morseMap.put(".---", "j");
		morseMap.put("-.-", "k");
		morseMap.put(".-..", "l");
		morseMap.put("--", "m");
		morseMap.put("-.", "n");
		morseMap.put("---", "o");
		morseMap.put(".--.", "p");
		morseMap.put("--.-", "q");
		morseMap.put(".-.", "r");
		morseMap.put("...", "s");
		morseMap.put("-", "t");
		morseMap.put("..-", "u");
		morseMap.put("...-", "v");
		morseMap.put(".--", "w");
		morseMap.put("-..-", "x");
		morseMap.put("-.--", "y");
		morseMap.put("--..", "z");

		StringBuilder answer = new StringBuilder();
		String[] morseArr = letter.split(" ");
		for (String morse : morseArr) answer.append(morseMap.get(morse));

		return answer.toString();
	}

	public static void main(String[] args) {
		String letter = ".--. -.-- - .... --- -.";
		Morse solution = new Morse();
		String solution1 = solution.solution(letter);
		System.out.println("result = " + solution1);
	}
}
