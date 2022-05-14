package level1;

/*
programmers
level: 1
title: 폰켓몬
url: https://programmers.co.kr/learn/courses/30/lessons/1845
*/
import java.util.*;
import java.util.stream.Collectors;

public class PokemonKind {

	// stream 사용하여 배열 -> Set 변경 답변
	public static int solution(int[] nums) {
		// 포켓몬 종류 int[] -> HashSet<Integer>
		Set<Integer> pokemonKind = Arrays
				.stream(nums).boxed()			// boxed() 원시타입 int -> Integer로 전환
				.collect(Collectors.toSet());
		return Math.min(nums.length / 2, pokemonKind.size());
	}

	// 최초 문제 풀이시 답변
	public static int solution2(int[] nums) {
         // int[] nums -> HasSet
         HashSet<Integer> kind = new HashSet<>();
		for (int num : nums) {
			kind.add(num);
		}

         // max kind
         int maxKind = nums.length/2;

         if (maxKind > kind.size()) {
             return kind.size();
         } else {
             return maxKind;
         }
	}

	public static void main(String[] args) {
		int[] paramNums = {3, 1, 2, 3};

		int result = solution(paramNums);
		System.out.println("result = " + result);
	}
}
