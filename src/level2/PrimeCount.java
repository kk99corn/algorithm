package level2;

/*
programmers
level: 2
title: k진수에서 소수 개수 구하기
url: https://programmers.co.kr/learn/courses/30/lessons/92335
*/
public class PrimeCount {
	public int solution(int n, int k) {
		int answer = 0;
		String convertString = Integer.toString(n, k);
		String[] numberArr = convertString.split("0");
		for (String number : numberArr) {
			if (!number.equals("")) {
				if (isPrime(Long.parseLong(number))) answer++;
			}
		}

		return answer;
	}

	public boolean isPrime(Long n) {
		if( n == 1 ) return false;
		else if( n == 2 ) return true;
		else if( n % 2 == 0 ) return false;

		int count = 0;
		for(int i = 3; i <= Math.sqrt(n); i += 2){
			if( n % i == 0 ){
				count++;
			}
		}
		return count == 0;
	}

	public static void main(String[] args) {
		PrimeCount primeCount = new PrimeCount();
		int solution = primeCount.solution(437674, 3);
		System.out.println("solution = " + solution);
	}
}
