package progrmmers.level2;

import java.util.*;

/*
programmers
level: 2
title: 오픈채팅방
url: https://programmers.co.kr/learn/courses/30/lessons/42888
*/
public class OpenChatting {
	public String[] solution(String[] record) {
		List<String> log = new ArrayList<>();
		Map<String, String> user = new HashMap<>();

		for (String data : record) {
			String[] dataArr = data.split(" ");

			switch (dataArr[0]) {
				case "Enter":
					log.add("E " + dataArr[1]);
					user.put(dataArr[1], dataArr[2]);
					break;
				case "Leave":
					log.add("L " + dataArr[1]);
					break;
				case "Change":
					user.put(dataArr[1], dataArr[2]);
					break;
			}
		}

		String[] answer = new String[log.size()];
		for (int i = 0; i < log.size(); i++) {
			String[] logArr = log.get(i).split(" ");
			if (logArr[0].equals("E")) {
				answer[i] = user.get(logArr[1]) + "님이 들어왔습니다.";
			} else {
				answer[i] = user.get(logArr[1]) + "님이 나갔습니다.";
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
		OpenChatting openChatting = new OpenChatting();
		String[] solution = openChatting.solution(record);

		System.out.println(Arrays.toString(solution));
	}
}
