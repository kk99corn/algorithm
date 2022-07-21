package practice.test;

import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class AB {
	public boolean[] solution(String[] words) {
		// 1. 한글자 문자열 "a"로 시작
		// bbaabba
		// bbaabb
		// 2. 아래 규칙 중 랜덤으로 반복됨
		//      a. 문자열 양옆에 각각 x개만큼 "b"를 추가 (현재 문자열에서 "a"의 개수를 x)
		//      b. 문자열 맨앞에 "a"를 추가
		//      c. 문자열 맨뒤에 "a"를 추가

		// words count만큼 boolean 배열 세팅
		boolean[] answer = new boolean[words.length];

		for (int i = 0; i < words.length; i++) {
			answer[i] = ruleCheck(words[i]);
		}

		return answer;
	}

	boolean ruleCheck(String word) {
		// Deque 데이터 세팅
		Deque<Character> deque = new LinkedList<>();
		for (int i = 0; i < word.length(); i++) {
			deque.add(word.charAt(i));
		}

		while (true) {
			if (deque.isEmpty()) {
				break;
			}

			if (deque.size() == 1) {
				if (deque.peek() == 'a') {
					return true;
				} else {
					return false;
				}
			}

			while (true) {
				if (deque.peekFirst() == null) break;
				if (deque.peekFirst() == 'b' && deque.peekLast() == 'b') break;
				if (deque.peekFirst() == 'a') {
//					System.out.println("deque.peekFirst() = " + deque.peekFirst());
					deque.pollFirst();
				}

				if (deque.peekLast() == null) break;
				if (deque.peekLast() == 'a') {
//					System.out.println("deque.peekLast() = " + deque.peekLast());
					deque.pollLast();
				}
			}

			// a가 전부 지워지면 true
			if (deque.size() == 0) return true;

			int aCount = 0;
			int bCount = 0;
			for (Character c : deque) {
				if (c == 'a') aCount++;
				if (aCount == 0 && c == 'b') bCount++;
			}

			// 앞에 연속되는 b의 개수는 현재 남아있는 a의 배수여야함
			if (bCount % aCount != 0 ) {
				return false;
			}
//			System.out.println("aCount = " + aCount);
//			System.out.println("bCount = " + bCount);

			while (true) {
				Character firstC = deque.peekFirst();
				Character lastC = deque.peekLast();
				if (firstC == null || lastC == null) break;
				if (firstC == 'b' && lastC == 'b') {
					deque.pollFirst();
					deque.pollLast();
				} else {
					break;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		// String[] words = {"abab", "bbaa", "bababa", "bbbabababbbaa", "ab"};
		String[] words = {"bbbbbaaaaabbbbb"};
		AB test3 = new AB();
		boolean[] solution = test3.solution(words);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
