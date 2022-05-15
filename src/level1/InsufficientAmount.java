package level1;

/*
programmers
level: 1
title: 부족한 금액 계산하기
url: https://programmers.co.kr/learn/courses/30/lessons/82612
*/
public class InsufficientAmount {
	public long solution(int price, int money, int count) {
		long total = 0L;
		for (int i = 1; i <= count; i++) {
			total += (long) price * i;
		}
		// return (total - money > 0) ? total - money : 0;
		return Math.max(total - money, 0);
	}

	public static void main(String[] args) {
		InsufficientAmount insufficientAmount = new InsufficientAmount();
		long solution = insufficientAmount.solution(3, 20, 4);
		System.out.println("solution = " + solution);
	}
}
