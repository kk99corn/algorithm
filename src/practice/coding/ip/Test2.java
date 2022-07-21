package practice.coding.ip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
	public int[] solution(int N, int[] coffee_times) {
		List<Integer> tempAnswer = new ArrayList<>();
		List<Integer> coffee = new ArrayList<>();
		for (int i : coffee_times) {
			coffee.add(i);
		}

		int num = 0;
		while (true) {
			boolean exist = true;
			int min = 100000001;
			for (int i = 0; i < coffee.size(); i++) {
				if (num == N) {
					break;
				}
				if (coffee.get(i) != 0) {
					for (int j = 0; j < coffee.size(); j++) {
						if (coffee.get(j) != 0) {
							if (min > coffee.get(j)) {
								min = coffee.get(j);
							}
						}
					}
				}

				if (coffee.get(i) > 0) {
					int value = coffee.get(i) - min;
					coffee.set(i, value);
					if (0 == value) {
						tempAnswer.add(i+1);
					}
					num ++;
					exist = false;
				}
			}

			num = 0;
			if (exist) {
				break;
			}
		}

		int[] answer = new int[tempAnswer.size()];
		for (int i = 0; i < tempAnswer.size(); i++) {
			answer[i] = tempAnswer.get(i);
		}

		return answer;
	}


	public static void main(String[] args) {

		int N = 3;
		int[] coffee_times = {4, 2, 2, 5, 3};

		Test2 test2 = new Test2();
		int[] solution = test2.solution(N, coffee_times);
		System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
	}
}
