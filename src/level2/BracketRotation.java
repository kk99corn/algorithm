package level2;

import java.util.Stack;

/*
programmers
level: 2
title: 괄호 회전하기
url: https://programmers.co.kr/learn/courses/30/lessons/76502
*/
public class BracketRotation {
	public int solution(String s) {
		int x = s.length();
		int answer = 0;
		for (int i = 0; i < x; i++) {
			boolean isChecked = checkBracket(s.substring(i, x) + s.substring(0, i));
			if (isChecked) answer++;

		}
		return answer;
	}

	public boolean checkBracket(String s) {
		if (s.length() % 2 != 0) return false;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
				//닫힌것은 비교하여 뺀다
				case ')':
					if (stack.isEmpty()) return false;
					if (stack.peek() == '(') stack.pop();
					break;
				case '}':
					if (stack.isEmpty()) return false;
					if (stack.peek() == '{') stack.pop();
					break;
				case ']':
					if (stack.isEmpty()) return false;
					if (stack.peek() == '[') stack.pop();
					break;
				//열린것은 담고
				default:
					stack.push(s.charAt(i));
					break;
			}
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		BracketRotation bracketRotation = new BracketRotation();
		int solution = bracketRotation.solution("[](){}");
		System.out.println("solution = " + solution);
	}
}
