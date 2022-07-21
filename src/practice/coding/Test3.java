package practice.coding;

import java.util.*;

public class Test3 {
	// 백신 정보
	class Vaccine {
		String name; // 백신명
		int stock; // 재고
		int minAge; // 최저 나이
		int maxAge; // 최고 나이

		// 생성자
		public Vaccine(String name, int stock, int minAge, int maxAge) {
			this.name = name;
			this.stock = stock;
			this.minAge = minAge;
			this.maxAge = maxAge;
		}

		@Override
		public String toString() {
			return "Vaccine name=" + name + ", stock=" + stock + ", minAge=" + minAge + ", maxAge=" + maxAge;
		}
	}

	// 예약자 정보
	class People {
		String name;
		int age;
		List<String> vaccineList;

		// 생성자
		public People(String name, int age, List<String> vaccineList) {
			this.name = name;
			this.age = age;
			this.vaccineList = vaccineList;
		}

		@Override
		public String toString() {
			return "People name=" + name + ", age=" + age + ", vaccineList=" + vaccineList;
		}
	}

	public String[] solution(String[] vac, String[] peo) {
		Map<String, Vaccine> vaccineMap = new HashMap<>(); // 백신 맵
		List<People> peopleList = new ArrayList<>(); // 예약자 리스트
		Map<String, List<String>> resultMap = new TreeMap<>(); // 예약완료 리스트

		// 백신맵 세팅
		for (String vaccine : vac) {
			String[] vacArr = vaccine.split(" ");
			vaccineMap.put(vacArr[0],
					new Vaccine(
							vacArr[0],
							Integer.parseInt(vacArr[1]),
							Integer.parseInt(vacArr[2]),
							Integer.parseInt(vacArr[3])
					));
		}

		// 예약자 리스트 세팅
		for (String people : peo) {
			String[] peoArr = people.split(" ");

			// 예약자별 백신 선호도 리스트
			List<String> vacTempList = new ArrayList<>();
			for (int i = 2; i < peoArr.length; i++) {
				vacTempList.add(peoArr[i]);
			}
			peopleList.add(
					new People(
							peoArr[0],
							Integer.parseInt(peoArr[1]),
							vacTempList
					)
			);
		}

		System.out.println("peopleList = " + peopleList);
		// 예약자 리스트 나이순 정렬
		peopleList.sort((p1, p2) -> -(Integer.compare(p1.age, p2.age)));
		System.out.println("peopleList = " + peopleList);
		// 예약자 리스트 순서대로 백신 예약 진행
		for (int i = 0; i < peopleList.size(); i++) {
			People p = peopleList.get(i);

			// 예약자별 백신 선호도 리스트
			for (String vaccine : p.vaccineList) {
				Vaccine v = vaccineMap.get(vaccine);

				// 나이 체크
				if (p.age >= v.minAge && p.age <= v.maxAge) {
					// 백신 수량 체크
					if (v.stock > 0) {
						// 백신 예약
						List<String> vaccineReserveList = resultMap.getOrDefault(vaccine, new ArrayList<>());
						vaccineReserveList.add(p.name); // 예약자 추가
						Collections.sort(vaccineReserveList); // 백신별 예약자리스트 예약자명으로 정렬
						resultMap.put(vaccine, vaccineReserveList); // 결과맵에 추가
						v.stock--;
						break;
					}
				}
			}
		}

		// 결과 세팅
		String[] answer = new String[resultMap.size()];

		int i = 0;
		for (String key : resultMap.keySet()) {
			String resultString = key + " ";
			// 백신별 예약자리스트 문자열로 변환
			resultString += String.join(" ", resultMap.get(key));
			answer[i] = resultString;
			i++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		String[] vac = {"PIZER 3 20 99", "ASTRA 1 9 55", "YANSEN 10000 22 49"};
		String[] peo = {
				"susan 50 ASTRA YANSEN PIZER",
				"kevin 55 ASTRA",
				"luka 60 PIZER ASTRA",
				"erica 20 YANSEN PIZER ASTRAR",
				"roy 20 PIZER"
		};

//		String[] vac = {
//				"Y 1 30 40",
//				"X 9999 1 99",
//				"Z 9 50 65",
//				"T 10000 1 99"
//		};
//
//		String[] peo = {
//				"aaa 50 Z Y",
//				"bbb 40 Y T X",
//				"cc 30 Y T",
//				"dd 65 Y Z",
//				"gg 1 T"
//		};
		String[] solution = test3.solution(vac, peo);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
