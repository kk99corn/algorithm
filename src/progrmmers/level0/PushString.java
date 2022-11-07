package progrmmers.level0;

/*
programmers
level: 0
title: 문자열 밀기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120921
*/
public class PushString {
	public int solution(String A, String B) {
		int answer = 0;
		for (int i = 0; i < A.length(); i++) {
			if (A.equals(B)) break;
			A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
			answer++;
		}
		if (answer == A.length()) answer = -1;
		return answer;
	}

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "ohell";
		PushString pushString = new PushString();
		int result = pushString.solution(str1, str2);
		System.out.println("result = " + result);
	}
}
