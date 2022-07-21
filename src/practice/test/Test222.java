package practice.test;

public class Test222 {
	public boolean[] solution(String[] a) {
		boolean[] answer = new boolean[a.length];
		// 들어온 인자 다 아래 로직 실행
		for (int j = 0; j < a.length; j++) {
			String ans = a[j];	// abab
			boolean result = false;
			while (true) {
				// a 하나 들어오면 true
				if (ans.equals("a")) {
					result = true;
					break;
				}

				// 1. 반복 양쪽 a를 다 지우는거
				while (true) {
					if ('a' == ans.charAt(0)) {
						ans = ans.substring(1);
					} else if ('a' == ans.charAt(ans.length() - 1)) {
						ans = ans.substring(0, ans.length() - 1);
					} else {
						break;
					}
				}
				// bab

				// 1번이 끝난 뒤 남은 문자열의 'a'의 개수
				int aCount = countChar(ans, 'a');
				if (0 == aCount) {
					break;
				}
				// acount = 1

				String tempLeftB = "";
				for (int i = 0; i < ans.length(); i++) {
					if ('b' == ans.charAt(i)) {
						tempLeftB += 'b';
					} else {
						break;
					}
				}
				// tempLeftB = "b"

				String tempRightB = "";
				for (int i = ans.length() - 1; i > 0; i--) {
					if ('b' == ans.charAt(i)) {
						tempRightB += 'b';
					} else {
						break;
					}
				}
				// tempRightB = "bb"

				int bCount = 0;
				if (tempLeftB.length() > tempRightB.length()) {
					bCount = tempRightB.length();
				} else {
					bCount = tempLeftB.length();
				}

				if (bCount != countChar(ans, 'a')) {
					break;
				}

				ans = ans.substring(bCount);
				ans = ans.substring(0, ans.length() - bCount);
				System.out.println(ans);
			}
			answer[j] = result;
		}

		return answer;
	}

	//
	public int countChar(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
}
