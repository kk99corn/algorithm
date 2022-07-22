package progrmmers.level3;

import java.util.PriorityQueue;

/*
programmers
level: 3
title: 디스크 컨트롤러
url: https://programmers.co.kr/learn/courses/30/lessons/42627
*/
public class DiscController {

	static class Job implements Comparable<Job> {
		int idx;			// 실제 입력 인덱스
		int requestTime;	// 실행순서
		int rTime;			// 실제 요청 시간
		int size;			// 소요 시간

		public Job(int idx, int rTime, int r, int s) {
			this.idx = idx;
			this.requestTime = r;
			this.size = s;
			this.rTime = rTime;
		}

		@Override
		public int compareTo(Job job) {
			// 실행순서 기준 정렬
			if (this.requestTime > job.requestTime)
				return 1;
			if (this.requestTime < job.requestTime)
				return -1;
			// 실행순서가 같으면, 크기 정렬
			return Integer.compare(this.size, job.size);
		}
	}

	// 최초풀이
	public int solution(int[][] jobs) {
		int time = 0;
		int answer = 0;

		// 프리오티큐 세팅
		PriorityQueue<Job> pQ = new PriorityQueue<>();
		for (int i = 0; i < jobs.length; i++) {
			Job j = new Job(i, jobs[i][0], jobs[i][0], jobs[i][1]);
			pQ.offer(j);
		}

		// pQ 빌때까지 진행
		while (!pQ.isEmpty()) {
			// 첫 데이터 뽑아오기
			Job j = pQ.poll();

			// 실행순서타임이 현재 시간보다 같거나 작으면 ~
			if (j.requestTime <= time) {
				answer += time - j.rTime + j.size;
				time += j.size;

				PriorityQueue<Job> pQ2 = new PriorityQueue<>();
				while (!pQ.isEmpty()) {
					Job j2 = pQ.poll();
					if (j2.requestTime <= time) {
						j2.requestTime = 0;
					}
					pQ2.offer(j2);
				}
				pQ = pQ2;
			} else {
				pQ.offer(j);
				time++;
			}
		}

		answer = answer / jobs.length;
		return answer;
	}

	public static void main(String[] args) {
		DiscController discController = new DiscController();
		int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
		int solution = discController.solution(jobs);
		System.out.println("solution = " + solution);
	}
}
