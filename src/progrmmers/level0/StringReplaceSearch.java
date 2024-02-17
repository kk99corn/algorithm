package progrmmers.level0;

/*
programmers
level: 0
title: 문자열 바꿔서 찾기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181864
*/
public class StringReplaceSearch {

	public int solution(String myString, String pat) {
		return myString.replaceAll("A", "C").replaceAll("B", "A").replaceAll("C", "B").contains(pat) ? 1 : 0;
	}

	public static void main(String[] args) {
		StringReplaceSearch solution = new StringReplaceSearch();

		String myString = "ABBAA";
		String pat = "AABB";
		int result = solution.solution(myString, pat);
		System.out.println("result = " + (result));
	}
}
