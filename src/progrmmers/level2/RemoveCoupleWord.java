package progrmmers.level2;

import java.util.Stack;

/*
programmers
level: 2
title: 짝지어 제거하기
url: https://programmers.co.kr/learn/courses/30/lessons/12973
*/
public class RemoveCoupleWord {

	public int solution(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(i));
			} else {
				Character c = stack.peek();
				if (c == s.charAt(i)) {
					stack.pop();
				} else {
					stack.push(s.charAt(i));
				}
			}
		}
		if (stack.size() > 0) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		RemoveCoupleWord removeCoupleWord = new RemoveCoupleWord();
		int baabaa = removeCoupleWord.solution("baabaa");
		System.out.println("baabaa = " + baabaa);
	}
}
