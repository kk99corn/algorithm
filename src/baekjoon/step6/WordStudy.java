package baekjoon.step6;

import java.io.*;
import java.util.*;

/*
baekjoon
step: 6
title: 단어 공부
url: https://www.acmicpc.net/problem/1157
*/
public class WordStudy {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<Character, Integer> map = new HashMap<>();
		String word = bufferedReader.readLine();
		word = word.toUpperCase(Locale.ROOT);
		for (int i = 0; i < word.length(); i++) {
			map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
		}
		List<Character> keySetList = new ArrayList<>(map.keySet());
		keySetList.sort((o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

		Character c = keySetList.get(0);
		int n = 0;
		for (Character character : keySetList) {
			if (n == map.get(character)) {
				c = '?';
				break;
			}
			if (n != 0) break;
			n = map.get(character);
		}
		bufferedWriter.write(c);
		bufferedWriter.close();
	}
}
