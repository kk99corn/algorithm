package progrmmers.level0;

/*
programmers
level: 0
title: 옷가게 할인 받기
url: https://school.programmers.co.kr/learn/courses/30/lessons/120818
*/
public class DiscountShop {

	public int solution(int price) {
		if (price >= 500000) {
			price = (int) (price - price * 0.2);
		} else if (price >= 300000) {
			price = (int) (price - price * 0.1);
		} else if (price >= 100000) {
			price = (int) (price - price * 0.05);
		}

		return price;
	}

	public static void main(String[] args) {
		int price = 150000;
		DiscountShop solution = new DiscountShop();
		int solution1 = solution.solution(price);
		System.out.println("result = " + (solution1));
	}
}
