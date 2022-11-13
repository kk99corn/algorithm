package progrmmers.level0;

import java.util.HashMap;
import java.util.Map;

/*
programmers
level: 0
title: 로그인 성공?
url: https://school.programmers.co.kr/learn/courses/30/lessons/120883
*/
public class LoginCheck {

	public String solution(String[] id_pw, String[][] db) {
		String answer = "";

		Map<String, String> dbMap = new HashMap<>();
		for (String[] data : db) {
			dbMap.put(data[0], data[1]);
		}

		if (dbMap.get(id_pw[0]) == null) {
			answer = "fail";
		} else {
			answer = (dbMap.get(id_pw[0]).equals(id_pw[1])) ? "login" : "wrong pw";
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] id_pw = {"programmer01", "15789"};
		String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
		LoginCheck solution = new LoginCheck();
		String solution1 = solution.solution(id_pw, db);
		System.out.println("result = " + solution1);
	}
}
