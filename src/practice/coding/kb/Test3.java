package practice.coding.kb;

import java.util.*;

public class Test3 {
	boolean isCheckFactory = false;
	public int solution(int[][] factory) {
		// 1. 전체 공장 수
		int factoryCnt = factory.length;

		// 2. 부품번호별 공장 list ArrayList<>() 초기화
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for (int i = 0; i < factory[0].length; i++) {
			list.add(new ArrayList<>());
		}

		// 3. 부품번호별 공장 list 값 세팅
		for (int i = 0; i < factory.length; i++) {
			for (int j = 0; j < factory[i].length; j++) {
				if (factory[i][j] == 1) {
					list.get(j).add(i);
				}
			}
		}
		System.out.println("list = " + list);

		// 4. 공장에서 팔지않는 부품번호(빈 부품) list에서 제거
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).size() == 0) {
				list.remove(i);
			}
		}
		System.out.println("list = " + list);

		list.sort((o1, o2) -> -Integer.compare(o1.size(), o2.size()));
		System.out.println("list = " + list);

		// return 값(모든 공장 계약 맺을 수 없는 경우 0 return)
		int answer = 0;

		// 최대 공장 수 만큼 반복
		// i = 1	// 부품을 하나만
		// i = 2	// 부품선택 횟수
		for (int i = 1; i <= factoryCnt; i++) {
			checkFactory(new HashSet<>(), list, i, factoryCnt);
			if (isCheckFactory) {
				answer = i;
				break;
			}
		}
		return answer;
	}

	// 모든 공장 계약 가능한 경우 check 함수
	// HashSet<Integer> set: 현재까지 조합된 set
	// ArrayList<ArrayList<Integer>> list: 현재까지 남아있는 부품별 공장 list
	// int n: 부품 조합 가지 수
	// int totalFactoryCnt: 전체 공장 수
	public void checkFactory(HashSet<Integer> set, ArrayList<ArrayList<Integer>> list, int n, int totalFactoryCnt) {
		if (n == 1) {
			// list 만큼 반복
			for (ArrayList<Integer> l : list) {
				// 전달받은 set으로 임시 tempSet 생성
				HashSet<Integer> tempSet = new HashSet<>(set);

				// tempSet에 전달받은 list 아이템 추가
				tempSet.addAll(l);

				// tempSet의 size가 전체 공장 수와 동일한 경우, 최소 부품 조합으로 모든 공장과 계약 성공
				if (tempSet.size() == totalFactoryCnt) {
					isCheckFactory = true;
				}
			}
		} else {
			// 전달받은 list 만큼 반복
			for (int i = 0; i < list.size(); i++) {
				if (isCheckFactory) break;
				// 임시 tempSet 생성 후 i번째 list 데이터 추가
				HashSet<Integer> tempSet = new HashSet<>(set);
				tempSet.addAll(list.get(i));

				System.out.println("tempSet = " + tempSet);
				// 임시 tempList 생성 후 tempList i번째 값 제거
				ArrayList<ArrayList<Integer>> tempList = new ArrayList<>(list);
				tempList.remove(i);

				checkFactory(tempSet, tempList, n - 1, totalFactoryCnt);
			}
		}
	}

	public static void main(String[] args) {
		int[][] factory = {
				{1, 1, 1, 1, 0, 0, 0, 0, 0},
				{0, 0, 1, 0, 0, 0, 0, 0, 1},
				{0, 0, 0, 1, 0, 1, 0, 0, 1},
				{1, 1, 0, 0, 1, 0, 0, 0, 1}
		};
//		int[][] factory = {
//				{0, 0, 1, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 1, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 1, 0, 0},
//				{0, 0, 1, 0, 0, 0, 0, 0, 1}
//		};
		Test3 test3 = new Test3();
		int solution = test3.solution(factory);
		System.out.println("solution = " + solution);
	}
}
