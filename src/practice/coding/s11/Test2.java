package practice.coding.s11;
/*
* You are given an implementation of a function:
class Solution sl public boolean solut ion(int[] A, int K); Il
This function, given a non-empty array A of N integers (sorted in non-decreasing order) and integer K,
checks whether A contains numbers 1,2, K (every number from 1 to K at least once) and no other
numbers.
For example, given the following array A, and K = 3:
A[O] = 1
A[1] = 1
A[2] = 2
A[3] = 3
A[4] = 3
The function should return true.
For the following array A, and K = 2:
A[O] = 1
A[1] = 1
A[2] = 3
the function should return false.
The attached code is still incorrect for some inputs. Despite the error(s), the code may produce a
correct answer for the example test cases. The goal of the exercise is to find and fix the bug(s) in the
implementation. You can modify at most two lines.
Assume that:
· n and K are integers within the range [1..300,000];
each element of array a is an integer within the range [0..1,000,000,000];
· array a is sorted in non-decreasing order.
In your solution, focus on correctness. The performance of your solution will not be the focus of the
assessment.

다음과 같은 기능을 구현할 수 있습니다.
클래스 솔루션 sl 공개 부울 솔루션(int[] A, int K); 일
이 함수는 N개의 정수(내림차순 정렬)와 K의 비어있지 않은 배열 A가 주어졌을 때,
A에 숫자 1,2, K(1부터 K까지의 모든 숫자)가 포함되어 있는지 여부 및 다른 숫자가 없는지 확인합니다.
숫자

예를 들어, 다음과 같은 배열 A와 K = 3이 주어졌을 때:
	A[O] = 1
	A[1] = 1
	A[2] = 2
	A[3] = 3
	A[4] = 3
함수는 true를 반환해야 합니다.

다음 배열 A 및 K = 2의 경우:
	A[O] = 1
	A[1] = 1
	A[2] = 3
함수가 false를 반환해야 합니다.

일부 입력에 대해 첨부된 코드가 여전히 올바르지 않습니다.
오류에도 불구하고 코드가 다음을 생성할 수 있습니다.

예제 테스트 사례에 대한 정답입니다.
연습의 목표는 다음에서 버그를 찾아 수정하는 것입니다.
실행. 최대 두 줄까지 수정할 수 있습니다.
다음과 같이 가정합니다.

· n과 K는 [1] 범위의 정수이다.300,000];
배열 a의 각 요소는 [0.1,000,000] 범위의 정수입니다.
· 배열 a는 정렬되지 않은 순서로 정렬됩니다.
해결책에서, 정확성에 초점을 맞추세요. 귀사의 솔루션 성능에는
평가.


	public boolean solution(int[] A, int K) {
		int n = A.length;
		for (int i = 0; i < n - 1; i++) {
			if (A[i] + 1 < A[i + 1])
				return false;
		}

		if (A[0] != 1 && A[n - 1] != K)
			return false;
		else
			return true;
	}
* */
public class Test2 {
	public boolean solution(int[] A, int K) {
		int n = A.length;
		for (int i = 0; i < n - 1; i++) {
			if (A[i + 1] - A[i] < 0 || A[i + 1] - A[i] > 1)
			//if (A[i] + 1 < A[i + 1])
				return false;
		}

		if (A[0] != 1 || A[n - 1] != K)
		// if (A[0] != 1 && A[n - 1] != K)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		int[] A = {1, 2,3,2,3, 4};
		int K = 4;
		Test2 test2 = new Test2();
		boolean solution = test2.solution(A, K);
		System.out.println("solution = " + solution);
	}
}
