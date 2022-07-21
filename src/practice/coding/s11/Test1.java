package practice.coding.s11;
/*
*함수 쓰기:
	클래스 솔루션 sl 공용 솔루션(int N); Il

정수 N이 주어지면, N보다 큰 가장 작은 정수와 다음의 합을 반환한다.
자릿수는 N의 자릿수의 합과 같다.

예:
1. N = 28이면 함수는 37을 반환해야 합니다. 28의 자릿수의 합은 2 + 8 = 10과 같다. 그
후속 숫자는 (괄호 안에 자릿수의 합을 포함) 29(11), 30(3), 31(4), 32(5), 33이다.
(6), 34 (7), 35 (8), 36 (9) 및 37 (10). 37은 28보다 작은 숫자이며, 28의 자릿수가 더해진다.
10.

123 = 6


2. N = 734가 주어졌을 때. 함수는 743을 반환해야 합니다. 734와 743의 자릿수의 합은 7+이다.
3 +4= 7+ 4+ 3 = 14. 735에서 742 사이의 다른 정수는 14가 되지 않는다.

3. N = 1990이 주어지면, 당신의 함수는 2089를 반환해야 한다. 두 숫자의 자릿수의 합은 같다.
19까지 그리고 그들 사이에 같은 숫자의 합을 가진 다른 정수는 없다.

4. N = 1000이면 함수는 10000을 반환해야 합니다. 두 숫자의 자릿수의 합은 같다.
1까지 그리고 그들 사이에 같은 숫자의 합을 가진 다른 정수가 없다.
* */
public class Test1 {
	public int solution(int N) {
		int sum = s(N);
		while (true) {
			N++;
			if (sum == s(N)) {
				return N;
			}
		}
	}

	public int s(int N) {
		int answer = 0;
		String s = Integer.toString(N);

		for (int i = 0; i < s.length(); i++) {
			answer += Integer.parseInt(s.substring(i, i + 1));
		}
		return answer;
	}

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		int solution = test1.solution(50000);
		System.out.println("solution = " + solution);
	}
}
