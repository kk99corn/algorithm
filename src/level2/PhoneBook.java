package level2;

import java.util.Arrays;

/*
programmers
level: 1
title: 전화번호 목록
url: https://programmers.co.kr/learn/courses/30/lessons/42577
*/
public class PhoneBook {

	public boolean solution(String[] phone_book) {
		// 문자열 기준으로 오름차순 정렬
		Arrays.sort(phone_book);

		for (int i = 0; i < phone_book.length - 1; i++) {
			// i번째 전화번호가 i+1번째 전화번호의 접두사인지 체크
			if (phone_book[i + 1].startsWith(phone_book[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] phone_book = {"1219", "97674223", "1195524421"};
		PhoneBook phoneBook = new PhoneBook();
		boolean solution = phoneBook.solution(phone_book);
		System.out.println("solution = " + solution);
	}
}
