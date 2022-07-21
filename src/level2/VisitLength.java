package level2;

import java.util.HashSet;
import java.util.Set;

/*
programmers
level: 2
title: 방문 길이
url: https://programmers.co.kr/learn/courses/30/lessons/49994
*/
public class VisitLength {
	public int solution(String dirs) {
		Set<String> set = new HashSet<>();

		// 이동가능 거리 max, min
		int max = 5;
		int min = -5;

		// 현재 위치 x, y
		int x = 0;
		int y = 0;
		for (int i = 0; i < dirs.length(); i++) {
			// 현재 위치
			String current = Integer.toString(x) + y;
			switch (dirs.charAt(i)) {
				case 'U':	// 위
					if (y < max) y++;
					break;
				case 'D':	// 아래
					if (y > min) y--;
					break;
				case 'R':	// 오른쪽
					if (x < max) x++;
					break;
				case 'L':	// 왼쪽
					if (x > min) x--;
					break;
			}


			// 이동 위치
			String next = Integer.toString(x) + y;
			if (!current.equals(next)) {
				set.add(current + next);
				set.add(next + current);
			}
		}

		return set.size() / 2;
	}

	public static void main(String[] args) {
		String dirs = "LULLLLLLU";
		VisitLength visitLength = new VisitLength();
		int solution = visitLength.solution(dirs);
		System.out.println("solution = " + solution);
	}
}
