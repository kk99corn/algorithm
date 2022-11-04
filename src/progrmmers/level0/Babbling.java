package progrmmers.level0;

/*
programmers
level: 0
title: 옹알이(1)
url: https://school.programmers.co.kr/learn/courses/30/lessons/120956?language=java
*/
public class Babbling {

	public int solution(String[] babbling) {
		String[] ableWords = {"aya", "ye", "woo", "ma"};

		int answer = 0;
		for (String babblingWord : babbling) {
			for (String word : ableWords) {
				if (babblingWord.contains(word)) {
					babblingWord = babblingWord.replaceFirst(word, "-");
				}
			}
			if (babblingWord.replaceAll("-", "").equals("")) {
				answer++;
			}
		}
		return answer;

//		AtomicInteger answer = new AtomicInteger();
//
//		Set<String> aaa = Arrays.stream(babbling)
//				.filter(s -> {
//					for (String word : ableWords) {
//						if (s.contains(word)) {
//							s = s.replaceFirst(word, "-");
//						}
//					}
//					if (s.replaceAll("-", "").equals("")) {
//						answer.getAndIncrement();
//					}
//					return false;
//				}).collect(Collectors.toSet());
//		return answer.get();
}

	public static void main(String[] args) {
		String[] babblingArr = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		Babbling babbling = new Babbling();
		int result = babbling.solution(babblingArr);
		System.out.println("result = " + result);
	}
}
