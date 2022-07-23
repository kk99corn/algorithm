package baekjoon.step4;

import java.io.*;

/*
baekjoon
step: 4
title: 평균은 넘겠지
url: https://www.acmicpc.net/problem/4344
*/
public class AvgCheck {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			String[] scores = bufferedReader.readLine().split(" ");
			int cnt = Integer.parseInt(scores[0]);
			int total = 0;
			for (int j = 1; j < scores.length; j++) {
				total += Integer.parseInt(scores[j]);
			}
			double avg = (double) total / cnt;
			int avgCnt = 0;
			for (int j = 1; j < scores.length; j++) {
				if (Integer.parseInt(scores[j]) > avg) avgCnt++;
			}
			String answer = String.format("%.3f", (double) avgCnt / cnt * 100);

			bufferedWriter.write(answer + "%\n");
		}
		bufferedWriter.close();
	}
}