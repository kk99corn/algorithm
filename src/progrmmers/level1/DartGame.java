package progrmmers.level1;

import java.util.ArrayList;

/*
programmers
level: 1
title: 다트 게임
url: https://programmers.co.kr/learn/courses/30/lessons/17682
*/
public class DartGame {
	static class DartInfo {
		int score;
		int pow;
		int starScore;
		int minusScore;
	}

	public int solution(String dartResult) {
		int answer = 0;

		// 1. StringBuilder 사용하여, 사전데이터 세팅
		StringBuilder sb = new StringBuilder();
		sb.append(dartResult);
		for (int i = dartResult.length() - 1; i >= 0; i--) {
			// i에 해당하는 데이터가 숫자인 경우, 데이터 블럭을 나누기 위한 " " 공백 데이터 추가
			if (dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9') {
				sb.insert(i, " ");
				if (i != 0 && dartResult.charAt(i - 1) >= '0' && dartResult.charAt(i - 1) <= '9') {
					sb.deleteCharAt(i);
				}
			}
		}

		String preparedDartResult = sb.toString().trim();
		String[] dartInfoArr = preparedDartResult.split(" ");

		// 각 단계별 다트게임 정보 ArrayList
		ArrayList<DartInfo> dartInfoList = new ArrayList<>();
		int idx = 0;
		for (String dartInfoStr : dartInfoArr) {
			DartInfo dartInfo = new DartInfo();
			StringBuilder tempScore = new StringBuilder();
			int pow = 1;
			int starScore = 0;
			int minusScore = 0;
			for (int i = 0; i < dartInfoStr.length(); i++) {
				if (dartInfoStr.charAt(i) >= '0' && dartInfoStr.charAt(i) <= '9') {
					tempScore.append(dartInfoStr.charAt(i));
				} else if (dartInfoStr.charAt(i) == 'S') {
					pow = 1;
				} else if (dartInfoStr.charAt(i) == 'D') {
					pow = 2;
				} else if (dartInfoStr.charAt(i) == 'T') {
					pow = 3;
				} else if (dartInfoStr.charAt(i) == '*') {
					starScore = 1;
					if (idx != 0) {
						DartInfo tempDartInfo = dartInfoList.get(idx - 1);
						tempDartInfo.starScore += 1;
						dartInfoList.set(idx - 1, tempDartInfo);
					}
				} else if (dartInfoStr.charAt(i) == '#') {
					minusScore = 1;
				}
			}
			dartInfo.score = Integer.parseInt(tempScore.toString());
			dartInfo.pow = pow;
			dartInfo.starScore = starScore;
			dartInfo.minusScore = minusScore;
			dartInfoList.add(dartInfo);
			idx++;
		}

		for (DartInfo dartInfo : dartInfoList) {
			int scoreByStep = 0;
			scoreByStep = (int) Math.pow(dartInfo.score, dartInfo.pow);
			if (dartInfo.starScore > 0) {
				scoreByStep = scoreByStep * (2 * dartInfo.starScore);
			}
			if (dartInfo.minusScore > 0) {
				scoreByStep = scoreByStep * (-1);
			}
			answer += scoreByStep;
		}

		return answer;
	}

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		DartGame dartGame = new DartGame();
		int result = dartGame.solution(dartResult);
		System.out.println("result = " + result);
	}
}
