package progrmmers.level1;

import java.util.ArrayList;
import java.util.stream.IntStream;

/*
programmers
level: 1
title: 소수 만들기
url: https://programmers.co.kr/learn/courses/30/lessons/12977
*/
public class PrimeMake {
	public int solution(int[] nums) {
		int answer = 0;

		ArrayList<Integer> sumNums = new ArrayList<>();
		// for (int i = 0; i < nums.length; i++) {
		//     for (int j = i; j < nums.length; j++) {
		//         for (int x = j; x < nums.length; x++) {
		//             if (i != x && j != x && i != j) {
		//                 sumNums.add(nums[i] + nums[j] + nums[x]);
		//             }
		//         }
		//     }
		// }
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int x = j + 1; x < nums.length; x++) {

					sumNums.add(nums[i] + nums[j] + nums[x]);

				}
			}
		}

		for (Integer sumNum : sumNums) {
			if (isPrime(sumNum)) {
				answer++;
			}
		}

		return answer;
	}

	boolean isPrime(int num) {
		boolean isPrime = false;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				isPrime = num == i;
				break;
			}
		}
		return isPrime;
	}

	public int solution_stream(int[] nums) {
		return (int) IntStream.range(0, nums.length - 2)
				.flatMap(i -> IntStream.range(i + 1, nums.length - 1)
						.flatMap(j -> IntStream.range(j + 1, nums.length)
								.map(x -> nums[i] + nums[j] + nums[x])
						)
				)
				.filter(this::isPrime_stream)
				.count();
	}

	boolean isPrime_stream(int num) {
		if (num < 2) {
			return false;
		}
		return IntStream.rangeClosed(2, (int) Math.sqrt(num))
				.noneMatch(i -> num % i == 0);
	}

	public static void main(String[] args) {
		PrimeMake primeMake = new PrimeMake();
		int[] nums = {1, 2, 7, 6, 4};
		int solution = primeMake.solution(nums);
		System.out.println("solution = " + solution);

		int solution2 = primeMake.solution_stream(nums);
		System.out.println("solution2 = " + solution2);
	}
}
