package practice.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Dragon {
	public int solution(int n) {
		// age: 0~1 드래곤 == 알
		// age: 2~5 드래곤 == 알 낳을 수 있는 드래곤
		// age: 6 이상 드래곤 == 알 못낳는 드래곤

		List<Integer> list = new ArrayList<>();
		list.add(0);    // 0일째 드래곤 세팅(0살)

		// 1일 ~ n일 까지 반복
		for (int i = 1; i <= n; i++) {
			int size = list.size();
			// 리스트에 있는 드래곤 수 만큼 반복
			for (int j = 0; j < size; j++) {
				// 드래곤 나이 + 1해서 리스트에 다시 세팅
				int age = list.get(j) + 1;
				list.set(j, age);

				System.out.println(j + ", age = " + age);

				// 드래곤 나이 + 1했을때 2~5살 사이인 경우 새끼드래곤(0살) 리스트에 추가
				if (age >= 2 && age <= 5) {
					list.add(0);
				}
			}
			System.out.println(i + "일, " + list.size());
		}
		System.out.println("list = " + list);
		return list.size();
	}

	public static void main(String[] args) {
		Dragon test6 = new Dragon();
		int solution = test6.solution(6);
		System.out.println("solution = " + solution);
	}
}
