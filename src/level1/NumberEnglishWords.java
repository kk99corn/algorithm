package level1;

import java.util.HashMap;

public class NumberEnglishWords {

	public int solution(String s) {
		// 사전 데이터 세팅
		HashMap<String, Integer> matchMap = new HashMap<>();
		matchMap.put("zero", 0);
		matchMap.put("one", 1);
		matchMap.put("two", 2);
		matchMap.put("three", 3);
		matchMap.put("four", 4);
		matchMap.put("five", 5);
		matchMap.put("six", 6);
		matchMap.put("seven", 7);
		matchMap.put("eight", 8);
		matchMap.put("nine", 9);

		int answer = 0;
		for(String numberStr: matchMap.keySet()) {
			s = s.replace(numberStr, Integer.toString(matchMap.get(numberStr)));
			try {
				answer = Integer.parseInt(s);
				break;
			} catch(NumberFormatException e) {
				// 변환데이터 남아있는 상태
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		NumberEnglishWords numberEnglishWords = new NumberEnglishWords();
		String s = "one4seveneight";
		int result = numberEnglishWords.solution(s);
		System.out.println("result = " + result);
	}
}
