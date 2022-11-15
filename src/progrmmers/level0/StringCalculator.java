package progrmmers.level0;

/*
programmers
level: 0
title: 문자열 계산하기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120902
*/
public class StringCalculator {

	public int solution(String my_string) {
		String[] data = my_string.split(" ");
		int answer = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i].equals("+")) {
				i++;
				answer += Integer.parseInt(data[i]);
			} else if (data[i].equals("-")) {
				i++;
				answer -= Integer.parseInt(data[i]);
			} else {
				answer += Integer.parseInt(data[i]);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String my_string = "3 + 4";
		StringCalculator solution = new StringCalculator();
		int solution1 = solution.solution(my_string);
		System.out.println("result = " + solution1);
	}
}
