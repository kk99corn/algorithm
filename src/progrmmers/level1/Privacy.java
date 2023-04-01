package progrmmers.level1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
programmers
level: 1
title: 개인정보 수집 유효기간
url: https://programmers.co.kr/learn/courses/30/lessons/150370
*/
public class Privacy {

	public int[] solutionStream(String today, String[] terms, String[] privacies) {
		Map<String, Integer> termMap = Arrays.stream(terms)
				.map(termInfo -> termInfo.split(" "))
				.collect(Collectors.toMap(term -> term[0], term -> Integer.parseInt(term[1])));

		return IntStream.range(0, privacies.length)
				.filter(i -> {
					String[] privacy = privacies[i].split(" ");
					int term = termMap.get(privacy[1]);

					String[] contractDate = privacy[0].split("\\.");
					int contractY = Integer.parseInt(contractDate[0]);
					int contractM = Integer.parseInt(contractDate[1]);
					int contractD = Integer.parseInt(contractDate[2]);

					int expireY, expireM, expireD;

					int x = contractM + term;
					if (x % 12 == 0) {
						expireY = contractY + (x / 12) - 1;
						expireM = 12;
					} else {
						expireY = contractY + (x / 12);
						expireM = x % 12;
					}

					expireD = contractD - 1;
					if (contractD == 1) {
						expireM -= 1;
						expireD = 28;
					}

					String expireDate = String.format("%04d%02d%02d", expireY, expireM, expireD);

					final String finalToday = today.replaceAll("\\.", "");
					return Integer.parseInt(finalToday) > Integer.parseInt(expireDate);
				})
				.map(i -> i + 1)
				.toArray();
	}

	public int[] solution(String today, String[] terms, String[] privacies) {
		List<Integer> answerList = new ArrayList<>();

		Map<String, Integer> termMap = new HashMap<>();
		for (String termInfo : terms) {
			String[] term = termInfo.split(" ");
			termMap.put(term[0], Integer.parseInt(term[1]));
		}

		for (int i = 0; i < privacies.length; i++) {
			String[] privacy = privacies[i].split(" ");
			Integer term = termMap.get(privacy[1]);

			String[] contractDate = privacy[0].split("\\.");

			int contractY, contractM, contractD;
			contractY = Integer.parseInt(contractDate[0]);
			contractM = Integer.parseInt(contractDate[1]);
			contractD = Integer.parseInt(contractDate[2]);

			int expireY, expireM, expireD;

			int x = contractM + term;
			if (x % 12 == 0) {
				expireY = contractY + (x / 12) - 1;
				expireM = 12;
			} else {
				expireY = contractY + (x / 12);
				expireM = x % 12;
			}

			expireD = contractD - 1;
			if (contractD == 1) {
				expireM -= 1;
				expireD = 28;
			}

			String expireDate = "";
			expireDate += expireY;
			if (expireM < 10) {
				expireDate += ("0" + expireM);
			} else {
				expireDate += expireM;
			}

			if (expireD < 10) {
				expireDate += ("0" + expireD);
			} else {
				expireDate += expireD;
			}

			today = today.replaceAll("\\.", "");
			if (Integer.parseInt(today) > Integer.parseInt(expireDate)) {
				answerList.add(i + 1);
			}
		}

		int[] answer = new int[answerList.size()];
		for (int i = 0; i < answerList.size(); i++) {
			answer[i] = answerList.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		Privacy solution = new Privacy();
		int[] result = solution.solution(today, terms, privacies);
		System.out.println("result = " + Arrays.toString(result));

		int[] result2 = solution.solutionStream(today, terms, privacies);
		System.out.println("result = " + Arrays.toString(result2));
	}
}
