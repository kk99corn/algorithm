package progrmmers.level3;

/*
programmers
level: 3
title: 가장 긴 팰린드롬
url: https://programmers.co.kr/learn/courses/30/lessons/12904
*/
public class LongestPalindrome {
	public int solution(String s) {
		int wordLength = s.length();
		char[] charArr = new char[wordLength];
		for (int i = 0; i < wordLength; i++) {
			charArr[i] = s.charAt(i);
		}

		// 가장 긴 문자열부터 팰린드롬 검사
		for (int i = wordLength; i > 1; i--) {
			for (int j = 0; j + i <= wordLength; j++) {
				boolean chk = true;

				// 처음부터 문자열 길이의 반틈만큼 문자가 같은지 비교
				for (int x = 0; x < i / 2; x++) {
					if (charArr[j + x] != charArr[j + i - x - 1]) {
						chk = false;
						break;
					}
				}

				if (chk) return i;
			}
		}

		return 1;
	}

	public static void main(String[] args) {
		String s = "abacde";
		practice.coding.ip.Test3 test3 = new practice.coding.ip.Test3();
		int solution = test3.solution(s);
		System.out.println("solution = " + solution);
	}
}

