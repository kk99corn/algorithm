package progrmmers.level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
programmers
level: 1
title: 크레인 인형뽑기 게임
url: https://programmers.co.kr/learn/courses/30/lessons/64061
*/
public class DollCatch {
	public int solution(int[][] board, int[] moves) {
		// 결과 바구니 담을 변수
		List<Integer> bucket = new LinkedList<>();

		// 현재 인형의 상태 그래프 형태로 변경
		List<Stack<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < board.length; i++) {
			graph.add(new Stack<>());
		}
		for (int i = board.length - 1; i >= 0; i--) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != 0) {
					graph.get(j).push(board[i][j]);
				}
			}
		}

		int answer = 0;
		for (int i = 0; i < moves.length; i++) {
			int popNumber = moves[i] - 1;
			// popNumber에 해당하는 stack이 비어있지않다면,
			if (!graph.get(popNumber).isEmpty()) {
				int dollNumber = graph.get(popNumber).pop();
				if (bucket.size() > 0) {
					// 버켓에 이미 인형이 들어있다면, 마지막 인형과 현재 뽑은 인형 비교
					if (bucket.get(bucket.size() - 1) == dollNumber) {
						// 같으면 제거
						answer += 2;
						bucket.remove(bucket.size() - 1);
					} else {
						// 다르면 현재 인형 추가
						bucket.add(dollNumber);
					}
				} else {
					bucket.add(dollNumber);
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

		DollCatch dollCatch = new DollCatch();
		int solution = dollCatch.solution(board, moves);
		System.out.println("solution = " + solution);
	}
}
