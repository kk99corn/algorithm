package progrmmers.level2;

/*
programmers
level: 2
title: 다음 큰 숫자
url: https://programmers.co.kr/learn/courses/30/lessons/12911
*/
public class NextBigNum {
	public int solution(int n) {
		String binaryN = Integer.toBinaryString(n);
		int oneCntByN = 0;
		for (int i = 0; i < binaryN.length(); i++) {
			if (binaryN.charAt(i) == '1') oneCntByN++;
		}

		while (true) {
			int oneCntByX = 0;
			String binaryX = Integer.toBinaryString(++n);
			for (int i = 0; i < binaryX.length(); i++) {
				if (binaryX.charAt(i) == '1') oneCntByX++;
			}

			if (oneCntByN == oneCntByX) break;
		}
		return n;
	}

	public static void main(String[] args) {
		NextBigNum nextBigNum = new NextBigNum();
		int solution = nextBigNum.solution(79);
		System.out.println("solution = " + solution);
	}
}
