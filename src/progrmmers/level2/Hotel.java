package progrmmers.level2;

import java.util.*;

/*
programmers
level: 2
title: 호텔 대실
url: https://programmers.co.kr/learn/courses/30/lessons/155651
*/
public class Hotel {

	public int solutionStream(String[][] book_time) {
		List<List<String>> reservedList = Arrays.stream(book_time)
				.sorted(Comparator.comparing(time -> time[0]))
				.reduce(new ArrayList<>(), (result, time) -> {
					int s = Integer.parseInt(time[0].replace(":", ""));
					int e = Integer.parseInt(time[1].replace(":", ""));

					String reservedTime = s + "|" + e;

					if (result.isEmpty()) {
						result.add(new ArrayList<>() {{
							add(reservedTime);
						}});
					} else {
						boolean isNewRoom = true;
						int roomIndex = 0;
						for (int i = 0; i < result.size(); i++) {
							int size = result.get(i).size();
							if (size > 0) {
								int x = Integer.parseInt(result.get(i).get(size - 1).split("\\|")[1]) + 10;
								int h = x / 100;
								int m = x % 100;
								if (m >= 60) {
									h += 1;
									m -= 60;
									x = h * 100 + m;
								}
								if (x <= s) {
									isNewRoom = false;
									roomIndex = i;
									break;
								}
							}
						}

						if (isNewRoom) {
							result.add(new ArrayList<>() {{
								add(reservedTime);
							}});
						} else {
							result.get(roomIndex).add(reservedTime);
						}
					}
					return result;
				}, (list1, list2) -> {
					list1.addAll(list2);
					return list1;
				});

		return reservedList.size();
	}

	public int solution(String[][] book_time) {
		Arrays.sort(book_time, Comparator.comparing(time -> time[0]));

		List<List<String>> reservedList = new ArrayList<>();
		for (String[] time : book_time) {
			int s = Integer.parseInt(time[0].replace(":", ""));
			int e = Integer.parseInt(time[1].replace(":", ""));

			String reservedTime = s + "|" + e;

			if (reservedList.isEmpty()) {
				reservedList.add(new ArrayList<>() {{
					add(reservedTime);
				}});
			} else {
				boolean isNewRoom = true;
				int roomIndex = 0;
				for (int i = 0; i < reservedList.size(); i++) {
					int size = reservedList.get(i).size();
					if (size > 0) {
						int x = Integer.parseInt(reservedList.get(i).get(size - 1).split("\\|")[1]) + 10;
						int h = x / 100;
						int m = x % 100;
						if (m >= 60) {
							h += 1;
							m -= 60;
							x = h * 100 + m;
						}
						if (x <= s) {
							isNewRoom = false;
							roomIndex = i;
							break;
						}
					}
				}

				if (isNewRoom) {
					reservedList.add(new ArrayList<>() {{
						add(reservedTime);
					}});
				} else {
					reservedList.get(roomIndex).add(reservedTime);
				}
			}
		}

		return reservedList.size();
	}

	public static void main(String[] args) {
		String[][] book_time = {{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};
		Hotel solution = new Hotel();
		int result = solution.solution(book_time);
		System.out.println("result = " + (result));

		int result2 = solution.solutionStream(book_time);
		System.out.println("result = " + (result2));
	}
}
