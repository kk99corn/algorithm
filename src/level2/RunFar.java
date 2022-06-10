package level2;

import java.math.BigInteger;

/*
programmers
level: 2
title: 멀리 뛰기
url: https://programmers.co.kr/learn/courses/30/lessons/12914
*/
public class RunFar {
	public long solution(int n) {
		BigInteger[] nums = new BigInteger[n + 1];
		nums[0] = new BigInteger("1");
		nums[1] = new BigInteger("1");
		for (int i = 2; i <= n; i++) {
			nums[i] = nums[i - 1].add(nums[i - 2]);
		}

		long answer = (nums[n].remainder(new BigInteger("1234567"))).longValue();
		return answer;
	}

	public static void main(String[] args) {
		RunFar runFar = new RunFar();
		runFar.solution(2000);
		System.out.println("runFar = " + runFar);
	}
}
