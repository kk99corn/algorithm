package progrmmers.level1;

/*
programmers
level: 1
title: [PCCE 기출문제] 9번 / 이웃한 칸
url: https://programmers.co.kr/learn/courses/30/lessons/250125
*/
public class PCCE9 {

	public int solution(String[][] board, int h, int w) {
		int answer = 0;
		String selectedColor = board[h][w];

		answer += aroundColorCheck(board, selectedColor, h - 1, w);
		answer += aroundColorCheck(board, selectedColor, h + 1, w);
		answer += aroundColorCheck(board, selectedColor, h, w - 1);
		answer += aroundColorCheck(board, selectedColor, h, w + 1);

		return answer;
	}

	public int aroundColorCheck(String[][] board, String color, int checkH, int checkW) {
		int maxIndex = board.length - 1;
		if (checkH >= 0 && checkH <= maxIndex && checkW >= 0 && checkW <= maxIndex) {
			if (color.equals(board[checkH][checkW])) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		String[][] board = {
				{"blue", "red", "orange", "red"},
				{"red", "red", "blue", "orange"},
				{"blue", "orange", "red", "red"},
				{"orange", "orange", "red", "blue"}
		};
		int h = 1;
		int w = 1;
		PCCE9 solution = new PCCE9();
		int result = solution.solution(board, h, w);
		System.out.println("result = " + (result));
	}
}
