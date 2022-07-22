package progrmmers.level2;

import java.util.*;

/*
programmers
level: 2
title: [3차] 파일명 정렬
url: https://programmers.co.kr/learn/courses/30/lessons/17686
*/
public class FileNameSort {

	private String[] files;

	static class File implements Comparable<File> {
		int idx;
		String head;
		String number;

		public File(int idx, String head, String number) {
			this.idx = idx;
			this.head = head;
			this.number = number;
		}

		@Override
		public int compareTo(File o) {
			if (!this.head.equals(o.head)) {
				return this.head.compareTo(o.head);
			}
			if (Integer.parseInt(this.number) != Integer.parseInt(o.number))
				return Integer.compare(Integer.parseInt(this.number), Integer.parseInt(o.number));
			return Integer.compare(this.idx, o.idx);
		}
	}

	public String[] solution(String[] files) {
		ArrayList<File> list = new ArrayList<>();
		for (int i = 0; i < files.length; i++) {
			String head = "";
			String number = "";
			boolean isNum = true;
			for (int j = 0; j < files[i].length(); j++) {
				if (files[i].charAt(j) >= '0' && files[i].charAt(j) <= '9' && isNum && number.length() <= 5) {
					number += files[i].charAt(j);
				} else {
					if (!number.equals("")) {
						isNum = false;
					}
					if (isNum) {
						head += files[i].charAt(j);
					}
				}
			}
			list.add(new File(i, head.toUpperCase(), number));
		}
		Collections.sort(list);

		String[] answer = new String[files.length];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = files[list.get(i).idx];
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};

		FileNameSort fileNameSort = new FileNameSort();
		String[] solution = fileNameSort.solution(files);
		System.out.println("solution = " + Arrays.toString(solution));
	}
}
