package level1;

/*
programmers
level: 1
title: 비밀지도
url: https://programmers.co.kr/learn/courses/30/lessons/17681
*/
public class SecretMap {
	// 최초 풀이 코드 리팩토링
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			// 이진수 배열 합쳐서 처리
			answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
		}

		// answer 세팅
		for (int i = 0; i < n; i++) {
			// 공백추가
			answer[i] = String.format("%" + n + "s", answer[i]);
			answer[i] = answer[i].replace("1", "#");
			answer[i] = answer[i].replace("0", " ");
		}

		return answer;
	}

	// 최초 풀이
	public String[] solution2(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		int[][] tempResult = new int[n][n];

		for (int idx = 0; idx < n; idx++) {
			// int -> binaryString
			String arr1Binary = Integer.toBinaryString(arr1[idx]);
			String arr2Binary = Integer.toBinaryString(arr2[idx]);

			// arr1 이진수 데이터 tempResult에 입력
			int tempResultIdx = n;
			for (int i = arr1Binary.length() - 1; i >= 0; i--) {
				tempResult[idx][tempResultIdx - 1] = arr1Binary.charAt(i) - '0';
				tempResultIdx--;
			}

			// arr2 이진수 데이터 tempResult에 입력
			tempResultIdx = n;
			for (int i = arr2Binary.length() - 1; i >= 0; i--) {
				// tempResult에 빈칸(0)이면서, arr2 데이터가 1인 경우만 해당 위치 값 변경
				if (tempResult[idx][tempResultIdx - 1] == 0 && (arr2Binary.charAt(i) - '0') == 1) {
					tempResult[idx][tempResultIdx - 1] = 1;
				}
				tempResultIdx--;
			}
		}

		// answer 세팅
		for (int idx = 0; idx < n; idx++) {
			String answerByFlow = "";
			for (int checkNum: tempResult[idx]) {
				answerByFlow += (checkNum == 1) ? "#" : " ";
			}
			answer[idx] = answerByFlow;
		}

		return answer;
	}
}
