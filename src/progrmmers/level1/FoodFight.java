package progrmmers.level1;

/*
programmers
level: 1
title: 푸드 파이트 대회
url: https://school.programmers.co.kr/learn/courses/30/lessons/134240
*/
public class FoodFight {

	public String solution(int[] food) {
		StringBuilder foodOrder = new StringBuilder();
		for (int i = 1; i < food.length; i++) {
			foodOrder.append(String.valueOf(i).repeat(Math.max(0, food[i] / 2)));
		}
		return foodOrder.toString() + "0" + foodOrder.reverse().toString();
	}

	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
		FoodFight solution = new FoodFight();
		String solution1 = solution.solution(food);
		System.out.println("result = " + (solution1));
	}
}
