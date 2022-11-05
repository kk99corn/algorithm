package progrmmers.level0;

/*
programmers
level: 0
title: 다음에 올 숫자
url: https://school.programmers.co.kr/learn/courses/30/lessons/120924
*/
public class NextNumber {
	public int solution(int[] common) {
		int lastIdx = common.length - 1;
		if (common[lastIdx] - common[lastIdx - 1] == common[lastIdx - 1] - common[lastIdx - 2]) {
			return (common[lastIdx] - common[lastIdx - 1]) + common[lastIdx];
		} else {
			return (common[lastIdx] / common[lastIdx - 1]) * common[lastIdx];
		}
	}

	public static void main(String[] args) {
		int[] common = {1, -2, 4, -8, 16};

		NextNumber nextNumber = new NextNumber();
		int result = nextNumber.solution(common);
		System.out.println("result = " + result);
	}
}
