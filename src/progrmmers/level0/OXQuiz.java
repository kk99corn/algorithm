package progrmmers.level0;

import java.util.Arrays;

/*
programmers
level: 0
title: OX퀴즈
url: https://school.programmers.co.kr/learn/courses/30/lessons/120907
*/
public class OXQuiz {
	public String[] solution(String[] quiz) {
		return Arrays.stream(quiz)
				.map(quizString -> {
					String[] splitQuiz = quizString.split(" ");
					int x = Integer.parseInt(splitQuiz[0]);
					int y = Integer.parseInt(splitQuiz[2]);
					int z = Integer.parseInt(splitQuiz[4]);

					int tempZ = (splitQuiz[1].equals("+")) ? x + y : x - y;
					return (z == tempZ) ? "O" : "X";
				})
				.toArray(String[]::new);
	}

	public static void main(String[] args) {
		String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
		OXQuiz solution = new OXQuiz();
		String[] solution1 = solution.solution(quiz);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
