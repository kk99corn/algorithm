package baekjoon.step4;

import java.io.*;
import java.util.*;

/*
baekjoon
step: 4
title: 평균
url: https://www.acmicpc.net/problem/1546
*/
public class Avg {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(bufferedReader.readLine());
		String[] scores = bufferedReader.readLine().split(" ");

		double max = 0.0;
		List<Double> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			double x = Double.parseDouble(scores[i]);
			if (x > max) max = x;
			list.add(x);
		}

		double total = 0.0;
		for (double d : list) {
			total += (d / max * 100);
		}

		bufferedWriter.write(total / n + "\n");
		bufferedWriter.close();
	}
}
