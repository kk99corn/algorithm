package progrmmers.level0;

/*
programmers
level: 0
title: 인덱스 바꾸기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120895
*/
public class IndexChange {

	public String solution(String my_string, int num1, int num2) {
		String[] splitString = my_string.split("");
		String temp = splitString[num2];
		splitString[num2] = splitString[num1];
		splitString[num1] = temp;
		return String.join("", splitString);
	}

	public static void main(String[] args) {
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		IndexChange solution = new IndexChange();
		String solution1 = solution.solution(my_string, num1, num2);
		System.out.println("result = " + (solution1));
	}
}
