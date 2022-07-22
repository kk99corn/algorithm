package progrmmers.level2;

import java.util.Stack;

public class ConvertBracket {
	/*
	1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다.
	2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다.
	3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다.
	  3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다.
	4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다.
	  4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다.
	  4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다.
	  4-3. ')'를 다시 붙입니다.
	  4-4. u의 첫 번째와 마지막 문자를 제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다.
	  4-5. 생성된 문자열을 반환합니다.*/
	public String solution(String p) {
		if (p.equals("")) return "";
		if (checkBracket(p)) return p;

		String u = "";
		String v = "";
		while (true) {
			String uTemp = "";
			String vTemp = "";
			int leftB = 0;
			int rightB = 0;
			for (int i = 0; i < p.length(); i++) {
				if (p.charAt(i) == '(') ++leftB;
				if (p.charAt(i) == ')') ++rightB;
				if (leftB == rightB) {
					uTemp = p.substring(0, i + 1);
					vTemp = p.substring(i + 1);
					break;
				}
			}

			System.out.println("uTemp = " + uTemp);
			System.out.println("vTemp = " + vTemp);
			if (checkBracket(uTemp)) {
				u += uTemp;
			} else {

			}

			System.out.println("u = " + u);
			System.out.println("v = " + v);
			System.out.println();
			break;
		}

		boolean a = checkBracket(p);
		System.out.println("a = " + a);
		String answer = "";
		return answer;
	}

	public boolean checkBracket(String s) {
		boolean isBracket = true;
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') stack.push(s.charAt(i));
			if (s.charAt(i) == ')') {
				if (stack.size() > 0) {
					stack.pop();
				} else {
					isBracket = false;
					break;
				}
			}
		}

		if (stack.size() != 0) isBracket = false;
		return isBracket;
	}

	public static void main(String[] args) {
		String p = ")(()())(";
		ConvertBracket convertBracket = new ConvertBracket();
		String solution = convertBracket.solution(p);
		System.out.println("solution = " + solution);
	}
}
