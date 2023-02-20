package progrmmers.level1;

import java.util.stream.IntStream;

/*
programmers
level: 1
title: 기사단원의 무기
url: https://programmers.co.kr/learn/courses/30/lessons/136798
*/
public class TemplarWeapon {

	public int solution_stream(int number, int limit, int power) {
		return IntStream.rangeClosed(1, number)
				.map(this::getDivisorCount_stream)
				.map(divisorCount -> (divisorCount <= limit) ? divisorCount : power)
				.sum();
	}

	public int getDivisorCount_stream(int num) {
		return (int) IntStream.rangeClosed(1, (int) Math.sqrt(num))
				.filter(i -> num % i == 0)
				.map(i -> (num / i == i) ? 1 : 2)
				.sum();
	}


	public int solution(int number, int limit, int power) {
		int answer = 0;
		for (int i = 1; i <= number; i++) {
			int divisorCount = getDivisorCount(i);
			answer += ((divisorCount <= limit) ? divisorCount : power);
		}

		return answer;
	}

	public int getDivisorCount(int num) {
		int count = 0;
		for (int i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				count++;
				if (Math.pow(i, 2) != num) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int number = 5;
		int limit = 3;
		int power = 2;
		TemplarWeapon solution = new TemplarWeapon();
		int result = solution.solution(number, limit, power);
		System.out.println("result = " + result);

		int result2 = solution.solution_stream(number, limit, power);
		System.out.println("result2 = " + result2);
	}
}
