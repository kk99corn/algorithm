package progrmmers.level0;

/*
programmers
level: 0
title: [PCCE 기출문제] 5번 / 산책
url: https://school.programmers.co.kr/learn/courses/30/lessons/250129
*/
public class PCCE5 {

	public static void main(String[] args) {
		int east = 0;
		int north = 0;
		int[] answer = new int [2];
		for(int i=0; i<route.length(); i++){
			switch(route.charAt(i)){
				case 'N':
					north++;
					break;
				case 'S':
					north--;
					break;
				case 'E':
					east++;
					break;
				case 'W':
					east--;
					break;
			}
		}
		answer[0] = east;
		answer[1] = north;
		return answer;
	}
}
