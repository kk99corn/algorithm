package practice.coding.hh;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test3_1 {
	public int solution(String start_date, String end_date, String[] login_dates) {
		List<String> list = Arrays.asList(login_dates);
		Collections.sort(list);
		int maxCount = 0;
		try {
			SimpleDateFormat sdt = new SimpleDateFormat("MM/dd");
			String[] dataParam = start_date.split(" ");

			int day = 1;
			switch (dataParam[1]) {
				case "MON" : day = 1; break;
				case "TUE" : day = 2; break;
				case "WED" : day = 3; break;
				case "THU" : day = 4; break;
				case "FRI" : day = 5; break;
				case "SAT" : day = 6; break;
				case "SUN" : day = 7; break;
			}

			int tempCount = 0;
			String sdate = dataParam[0];
			while (true) {
				if (list.contains(sdate) && day < 6) {
					tempCount ++;
				} else {
					if (day < 6) {
						if (maxCount < tempCount) {
							maxCount = tempCount;
						}
						tempCount = 0;
					}
				}

				if (end_date.equals(sdate)) {
					break;
				}

				Date date = sdt.parse(sdate);
				Calendar cal = Calendar.getInstance();
				cal.setTime(date);
				cal.add(Calendar.DATE , 1);
				sdate = sdt.format(cal.getTime());

				if (day >= 7) {
					day = 1;
				} else {
					day ++;
				}
			}

		} catch (Exception e) {

		}
		return maxCount;
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

		Test3_1 test3 = new Test3_1();
		int solution = test3.solution(start_date, end_date, login_dates);
		System.out.println("solution = " + solution);
	}
}
