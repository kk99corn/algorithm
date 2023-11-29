package progrmmers.level0;

/*
programmers
level: 0
title: 0 떼기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181847
*/
public class ZeroMinus {

	public String solution(String n_str) {
		int i = 0;
		for (i = 0; i < n_str.length(); i++) {
			if (n_str.charAt(i) != '0') {
				break;
			}
		}
		return n_str.substring(i);
	}

	public static void main(String[] args) {
		ZeroMinus solution = new ZeroMinus();

		String my_string = "0010";
		String result = solution.solution(my_string);
		System.out.println("result = " + (result));
	}
}
