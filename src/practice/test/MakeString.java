package practice.test;

public class MakeString {
	public int solution(String word) {
		int answer = 0;

		// 뒤집은 문자열이 이미 같은 경우, 현재 word 길이 리턴
		StringBuilder sb = new StringBuilder(word);
		sb.reverse();

		if (word.equals(sb.toString())) return word.length();

		for(int i = 1; i < word.length(); i++) {
			sb = new StringBuilder(word);

			// 앞에서부터 길이 1씩 늘려가면서 뒤에 붙여보
			sb.append(new StringBuilder(word.substring(0, i)).reverse());
			System.out.println("sb = " + sb);
			// 팰린드롬인지 체크
			if(sb.toString().equals(sb.reverse().toString())) {
				return sb.length();
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		String word = "abcde";
		MakeString makeString = new MakeString();
		int solution = makeString.solution(word);
		System.out.println("solution = " + solution);
	}
}
