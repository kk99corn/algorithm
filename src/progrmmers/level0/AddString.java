package progrmmers.level0;

/*
programmers
level: 0
title: 글자 이어 붙여 문자열 만들기
url: https://school.programmers.co.kr/learn/courses/30/lessons/181915
*/
public class AddString {

	public String solution(String my_string, int[] index_list) {
		String answer = "";
		for (int i : index_list) {
			answer += my_string.charAt(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		AddString solution = new AddString();

		String my_string = "cvsgiorszzzmrpaqpe";
		int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
		String result = solution.solution(my_string, index_list);
		System.out.println("result = " + (result));
	}
}
