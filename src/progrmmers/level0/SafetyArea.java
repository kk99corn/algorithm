package progrmmers.level0;

/*
programmers
level: 0
title: 안전지대
url: https://school.programmers.co.kr/learn/courses/30/lessons/120866
*/
public class SafetyArea {

	public int solution(int[][] board) {
		int answer = 0;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 1) {
					board = checkBoard(board, i, j);
				}
			}
		}

		for (int[] b : board) {
			for (int x : b) {
				if (x == 0) answer++;
			}
		}
		return answer;
	}

	public int[][] checkBoard(int[][] board, int m, int n) {
		int maxIdx = board.length - 1;
		if (m - 1 >= 0 && n - 1 >= 0 && board[m - 1][n - 1] == 0) board[m - 1][n - 1] = 2;
		if (m - 1 >= 0 && board[m - 1][n] == 0) board[m - 1][n] = 2;
		if (m - 1 >= 0 && n + 1 <= maxIdx && board[m - 1][n + 1] == 0) board[m - 1][n + 1] = 2;
		if (n - 1 >= 0 && board[m][n - 1] == 0) board[m][n - 1] = 2;
		if (n + 1 <= maxIdx && board[m][n + 1] == 0) board[m][n + 1] = 2;
		if (m + 1 <= maxIdx && n - 1 >= 0 && board[m + 1][n - 1] == 0) board[m + 1][n - 1] = 2;
		if (m + 1 <= maxIdx && board[m + 1][n] == 0) board[m + 1][n] = 2;
		if (m + 1 <= maxIdx && n + 1 <= maxIdx && board[m + 1][n + 1] == 0) board[m + 1][n + 1] = 2;
		return board;
	}

	public static void main(String[] args) {
		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
		SafetyArea solution = new SafetyArea();
		int result = solution.solution(board);
		System.out.println("result = " + result);
	}
}
