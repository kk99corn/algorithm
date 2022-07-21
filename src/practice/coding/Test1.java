package practice.coding;

public class Test1 {
	public int solution(int num) {
		// num 자릿수 확인, 자릿수 홀수인 경우 짝수 자리수로 변경
		String numTemp = Integer.toString(num);
		if (numTemp.length() % 2 == 1) num = (int)Math.pow(10, numTemp.length());

		while (true) {
			numTemp = Integer.toString(num);
			int numSize = numTemp.length();
			String frontString = numTemp.substring(0, numSize / 2);
			String backString = numTemp.substring(numSize / 2, numSize);

			int frontNum = 1;	// 앞자리 숫자 곱하기 저장용 변수
			int backNum = 1;	// 뒷자리 숫자 곱하기 저장용 변수
			for (int i = 0; i < frontString.length(); i ++) {
				frontNum *= Character.getNumericValue(frontString.charAt(i));
				backNum *= Character.getNumericValue(backString.charAt(i));
			}

			// while 탈출조건
			if (frontNum == backNum) {
				break;
			} else {
				num++;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		int solution = test1.solution(203456);
		System.out.println("solution = " + solution);
	}
}
