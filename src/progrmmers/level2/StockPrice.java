package progrmmers.level2;

import java.util.Arrays;

/*
programmers
level: 2
title: 주식 가격
url: https://programmers.co.kr/learn/courses/30/lessons/42584
*/
public class StockPrice {

	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		for (int i = 0; i < prices.length - 1; i++) {
			int sec = 0;
			for (int j = i+1; j < prices.length; j++) {
				sec++;
				if (prices[i] > prices[j]) {
					break;
				}
			}
			answer[i] = sec;
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		// [4, 3, 1, 1, 0]
		StockPrice stockPrice = new StockPrice();
		int[] solution = stockPrice.solution(prices);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
