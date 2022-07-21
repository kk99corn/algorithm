package practice.coding.hh;

import java.util.*;

public class Test3 {
	public int solution(String start_date, String end_date, String[] login_dates) {
		// 로그인날짜 정렬
		Arrays.sort(login_dates);
		// System.out.println("login_dates = " + Arrays.toString(login_dates));

		// 1~12월 일수
		int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// daysString 0(월) ~ 6(일)
		String[] daysString = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

		//
		String[] startDateInfo = start_date.split(" ");
		int startDay = Arrays.asList(daysString).indexOf(startDateInfo[1]);

		List<Integer> answerList = new ArrayList<>();
		int idx = 0;
		int orgDiff = 0;
		for (String loginDate : login_dates) {
			// 이벤트 기간 내 로그인날짜만 체크
			if (loginDate.compareTo(startDateInfo[0]) >= 0 && loginDate.compareTo(end_date) <= 0) {
				String[] tempStart = startDateInfo[0].split("/");
				String[] tempLogin = loginDate.split("/");

				int diffDays = 0;
				// 월이 같으면
				if (tempStart[0].equals(tempLogin[0])) {
					diffDays = Integer.parseInt(tempLogin[1]) - Integer.parseInt(tempStart[1]);
				} else {
					int tempLoginDate = Integer.parseInt(tempLogin[1]);
					for (int i = Integer.parseInt(tempStart[0]) - 1; i < Integer.parseInt(tempLogin[0]) - 1; i++) {
						tempLoginDate += daysOfMonth[i];
					}
					diffDays = tempLoginDate - Integer.parseInt(tempStart[1]);
				}
				int temp = (startDay + diffDays) % 7;

				if (orgDiff == 0) {
					answerList.add(1);
				} else if (diffDays - orgDiff == 1 || (diffDays - orgDiff <= 3 && daysString[temp].equals("MON"))) {
					if (!daysString[temp].equals("SAT") && !daysString[temp].equals("SUN")) {
						answerList.set(idx, answerList.get(idx) + 1);
					}
				} else {
					answerList.add(1);
					idx++;
				}
				orgDiff = diffDays;
			}
		}
		return Collections.max(answerList);
	}

	public static void main(String[] args) {
//		String start_date = "05/04 MON";
//		String end_date = "06/30";
//		String[] login_dates = {
//				"05/26",
//				"05/25",
//				"05/27",
//				"05/10",
//				"05/11",
//				"05/23",
//				"05/22",
//				"05/21",
//				"05/06",
//				"05/09",
//				"05/07",
//				"05/08"
//		};
		String start_date = "05/27 SUN";
		String end_date = "06/16";
		String[] login_dates = {
				"05/31",
				"05/30",
				"06/01",
				"06/04",
				"06/07",
				"06/06",
				"06/09",
				"06/08",
				"06/13",
				"06/14",
				"06/10"
		};

		Test3 test3 = new Test3();
		int solution = test3.solution(start_date, end_date, login_dates);
		System.out.println("solution = " + solution);
	}
}
