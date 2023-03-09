package progrmmers.level1;

import java.util.Arrays;

/*
programmers
level: 1
title: 바탕화면 정리
url: https://school.programmers.co.kr/learn/courses/30/lessons/161990
*/
public class BackGround {

	public int[] solution(String[] wallpaper) {
		int[] answer = {-1, Integer.MAX_VALUE, -1, 0};
		for (int i = 0; i < wallpaper.length; i++) {
			if (wallpaper[i].contains("#")) {
				if (answer[0] == -1) {
					answer[0] = i;
				}
				answer[1] = Math.min(answer[1], wallpaper[i].indexOf("#"));
				answer[2] = i + 1;
				answer[3] = Math.max(answer[3], wallpaper[i].lastIndexOf("#") + 1);
			}
		}
		return answer;
	}

		public static void main(String[] args) {
		String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
		BackGround solution = new BackGround();
		int[] solution1 = solution.solution(wallpaper);
		System.out.println("result = " + Arrays.toString(solution1));
	}
}
