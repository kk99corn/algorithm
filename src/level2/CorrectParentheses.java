package level2;

import java.util.Stack;

/*
programmers
level: 2
title: 올바른 괄호
url: https://programmers.co.kr/learn/courses/30/lessons/12909
*/
public class CorrectParentheses {
	boolean solution(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push('(');
			} else {
				if (stack.isEmpty()) return false;
				stack.pop();
			}
		}
		if (stack.size() > 0) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		CorrectParentheses correctParentheses = new CorrectParentheses();
		boolean solution = correctParentheses.solution("(())()");
		System.out.println("solution = " + solution);
	}
}
