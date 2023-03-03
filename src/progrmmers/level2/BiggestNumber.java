package progrmmers.level2;

import java.util.*;
import java.util.stream.Collectors;

/*
programmers
level: 2
title: 가장 큰 수
url: https://programmers.co.kr/learn/courses/30/lessons/42746
*/
public class BiggestNumber {

	// 풀이 변경
	public String solution(int[] numbers) {
		ArrayList<String> numberList = new ArrayList<>();
		for (int num : numbers) {
			numberList.add(Integer.toString(num));
		}

		numberList.sort((a, b) -> {
			if (Integer.parseInt(a + b) < Integer.parseInt(b + a)) {
				return 1;
			} else if (Integer.parseInt(a + b) > Integer.parseInt(b + a)) {
				return -1;
			} else {
				return 0;
			}

			//return -Integer.compare(Integer.parseInt(a + b), Integer.parseInt(b + a));
		});

		StringBuilder sb = new StringBuilder();
		for (String number : numberList) {
			sb.append(number);
		}
		if (sb.toString().charAt(0) == '0') {
			return "0";
		}
		return sb.toString();
	}

	// 최초 풀이
	public String solution_(int[] numbers) {
		String[] strNumbers = new String[numbers.length];
		boolean isZero = true;
		for (int i = 0; i < numbers.length; i++) {
			strNumbers[i] = Integer.toString(numbers[i]);
			if (numbers[i] > 0) {
				isZero = false;
			}
		}
		if (isZero == true) {
			return "0";
		}
		Arrays.sort(strNumbers);

		TreeMap<String, ArrayList<String>> dataMap = new TreeMap<>();
		for (String strNumber : strNumbers) {
			String firstNum = strNumber.charAt(0) + "";
			ArrayList<String> tempList = dataMap.getOrDefault(firstNum, new ArrayList<>());
			tempList.add(strNumber);
			dataMap.put(firstNum, tempList);
		}

		for (String key : dataMap.keySet()) {
			ArrayList<String> list = dataMap.get(key);
			list.sort(new Comparator<String>() {
				@Override
				public int compare(String s1, String s2) {
					int s1Length = s1.length();
					int s2Length = s2.length();
					for (int i = 0; i < 3; i++) {
						s2 += s2;
						if (s2.length() >= 4) {
							break;
						}
					}
					s2 = s2.substring(0, 4);
					for (int i = 0; i < 3; i++) {
						s1 += s1;
						if (s1.length() >= 4) {
							break;
						}
					}
					s1 = s1.substring(0, 4);

					if (Integer.parseInt(s1) < Integer.parseInt(s2)) {
						return 1;
					} else if (Integer.parseInt(s1) > Integer.parseInt(s2)) {
						return -1;
					}
					return 0;
				}
			});
			dataMap.put(key, list);
		}

		String answer = "";
		for (String key : dataMap.descendingKeySet()) {
			ArrayList<String> list = dataMap.get(key);
			for (String num : list) {
				answer += num;
			}
		}
		return answer;
	}

	public String solution_Stream(int[] numbers) {
		String result = Arrays.stream(numbers)
				.mapToObj(String::valueOf)
				.sorted((a, b) -> (b + a).compareTo(a + b))
				.collect(Collectors.joining());
		return result.charAt(0) == '0' ? "0" : result;
	}

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		BiggestNumber biggestNumber = new BiggestNumber();
		String solution = biggestNumber.solution(numbers);
		System.out.println("solution = " + solution);

		String solution2 = biggestNumber.solution_Stream(numbers);
		System.out.println("solution2 = " + solution2);
	}
}
