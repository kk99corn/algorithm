package progrmmers.level0;

/*
programmers
level: 0
title: A 강조하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181874
*/
public class SpecialA {

	public String solution(String myString) {
		return myString.toLowerCase().replaceAll("a", "A");
	}

	public static void main(String[] args) {
		SpecialA solution = new SpecialA();

		String myString = "abstract algebra";
		String result = solution.solution(myString);
		System.out.println("result = " + (result));
	}
}
