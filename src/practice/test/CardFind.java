package practice.test;

import java.util.Arrays;

// https://www.fmkorea.com/3439254613
public class CardFind {
	public int solution(int[] nums) {
		Integer[] numbers = new Integer[nums.length];
		for (int i = 0; i < nums.length; i++) {
			numbers[i] = nums[i];
		}

		Arrays.sort(numbers);
		System.out.println("numbers = " + Arrays.toString(numbers));
		int answer = 0;
		int i = 0;
		while (true) {
			System.out.println("i = " + i);
			if (i >= numbers.length) break;
			if (i + 1 == numbers.length) {
				answer = numbers[i];
				break;
			}

			if (!numbers[i].equals(numbers[i + 1])) {
				answer = numbers[i];
				break;
			}

			i += 2;
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] nums = {1, 3, 2, 2, 5, 5, 1, 2, 3};
		CardFind test4 = new CardFind();
		int solution = test4.solution(nums);
		System.out.println("solution = " + solution);
	}
}
