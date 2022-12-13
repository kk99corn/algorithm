package progrmmers.level0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
programmers
level: 0
title: 가위 바위 보
url: https://school.programmers.co.kr/learn/courses/30/lessons/120839
*/
public class RockPaperScissors {

	public String solution(String rsp) {
		Map<String, String> rspMap = new HashMap<>();
		rspMap.put("2", "0");
		rspMap.put("0", "5");
		rspMap.put("5", "2");

		return Arrays.stream(rsp.split(""))
				.map(rspMap::get)
				.collect(Collectors.joining());
	}

	public static void main(String[] args) {
		String rsp = "205";
		RockPaperScissors solution = new RockPaperScissors();
		String solution1 = solution.solution(rsp);
		System.out.println("result = " + (solution1));
	}
}
