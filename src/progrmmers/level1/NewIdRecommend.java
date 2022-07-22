package progrmmers.level1;

/*
programmers
level: 1
title: 신규 아이디 추천
url: https://programmers.co.kr/learn/courses/30/lessons/72410
*/
public class NewIdRecommend {
	public String solution(String new_id) {
		// 1. 대문자 -> 소문자 변환
		new_id = new_id.toLowerCase();

		// 2. 특수문자 제거
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < new_id.length(); i++) {
			if ((new_id.charAt(i) >= 'a' && new_id.charAt(i) <= 'z')
					|| (new_id.charAt(i) >= '0' && new_id.charAt(i) <= '9')
					|| new_id.charAt(i) == '_'
					|| new_id.charAt(i) == '-'
					|| new_id.charAt(i) == '.') {
				sb.append(new_id.charAt(i));
			}
		}

		// 3. 마침표 변환
		new_id = sb.toString();
		sb.setLength(0);
		for (int i = 0; i < new_id.length(); i++) {
			if (new_id.charAt(i) == '.') {
				for (int j = i + 1; j < new_id.length(); j++) {
					if (new_id.charAt(j) == '.') {
						i++;
					} else {
						break;
					}
				}
			}
			sb.append(new_id.charAt(i));
		}

		// 4. 앞뒤 마침표 제거
		new_id = sb.toString();
		sb.setLength(0);
		int start = (new_id.charAt(0) == '.') ? 1 : 0;
		int end = (new_id.charAt(new_id.length() - 1) == '.') ? new_id.length() - 1 : new_id.length();
		end = Math.max(end, start);
		new_id = new_id.substring(start, end);

		// 5. 빈 문자열 체크
		if (new_id.length() == 0) {
			new_id = "a";
		}

		// 6. 길이체크 및 마침표 제거
		if (new_id.length() > 15) {
			new_id = new_id.substring(0, 15);
			if (new_id.charAt(14) == '.') {
				new_id = new_id.substring(0, 14);
			}
		}

		// 7. 길이체크
		if (new_id.length() <= 2) {
			for (int i = new_id.length(); i < 3; i++) {
				new_id += new_id.charAt(new_id.length() - 1);
			}
		}
		return new_id;
	}

	public static void main(String[] args) {

		String s = "...!@BaT#*..y.abcdefghijklm";
		NewIdRecommend newIdRecommend = new NewIdRecommend();
		String solution = newIdRecommend.solution(s);
		System.out.println("solution = " + solution);
	}
}
