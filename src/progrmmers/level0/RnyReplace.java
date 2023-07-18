package progrmmers.level0;

/*
programmers
level: 0
title: rny_string
url: https://school.programmers.co.kr/learn/courses/30/lessons/181863
*/
public class RnyReplace {

	public String solution(String rny_string) {
		return rny_string.replaceAll("m", "rn");
	}

	public static void main(String[] args) {
		RnyReplace solution = new RnyReplace();

		String rny_string = "programmers";
		String result = solution.solution(rny_string);
		System.out.println("result = " + (result));
	}
}
