package practice.coding.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
문제 설명
학교에서는 학생들의 시험 결과를 반영하여 맞춤 수업을 하려고 합니다.
맞춤 수업을 하기 위해서 점수가 비슷한 학생끼리 조를 나눠 수업하려고 합니다.
그래서, 학생들의 시험 점수가 오름차순으로 정렬된 배열 scores가 주어질 때, 이를 k개의 조로 나누려고 합니다.
최대한 점수가 비슷한 학생끼리 조를 나누기 위해, 정렬된 배열에서 인접한 학생끼리 조를 나눠야 합니다.
또한 각 조에서 가장 점수가 높은 학생의 점수와 가장 점수가 낮은 학생의 점수의 차이를 구한 후, 차이의 합이 최소가 되도록 조를 나눠야 합니다.
단, 조를 나눌 때는 각 조에 적어도 1명의 학생은 포함되어야 하고, 반드시 k개의 조로 나눠야 합니다.
예를 들어, 학생의 시험 점수가 담긴 배열 scores가 [1,3,7,8,10,15]이고 k가 3일 때 (1,3), (7,8,10), (15)로 나눌 수 있습니다.
• 첫 번째 조에서 가장 점수가 높은 학생의 점수는 3이고, 가장 점수가 낮은 학생의 점수는 1이므로 차이는 (3-1)로 2입니다.
• 두 번째 조에서의 가장 점수가 높은 학생의 점수는 10이고, 가장 점수가 낮은 학생의 점수는 7이므로 차이는 (10-7)로 3입니다.
• 세 번째 조는 한 명이므로 차이가 0이 됩니다.
이 때, 각 조에서 가장 점수가 높은 학생과 가장 점수가 낮은 학생의 차이의 합은 (2+3+0)이며, 이 경우가 최소입니다.
다른 경우 중에서 (1,3,7),(8,10),(15)로 나눌 수도 있지만, 이 경우에 각 조에서 가장 점수가 높은 학생과 가장 점수가 낮은 학생의 차이의 합은 (7-1)+(10-8)+(0) 이며 8이므로 최소가 아닙니다.
학생의 시험 점수가 담긴 배열 scores와 나눠야 할 조의 개수 k가 매개변수로 주어지고,
각 조에서 가장 점수가 높은 학생과 가장 점수가 낮은 학생의 차이의 합이 최소가 되도록 조를 나눴을 때,
그 최솟값을 return 하도록 solution 함수를 완성해 주세요.

제한사항
• scores 의 길이 : 300,000 이하의 자연수
• k: scores 의 길이와 작거나 같은 자연수
• 학생들의 시험점수는 1,000,000,000 이하의 자연수이며, 오름차순으로 정렬되어 있습니다.

입출력 예
scores			k
[1,3,7,8,10,15] 3
[1,2,12,14,15] 2
입출력 예설명
입출력 예 #1
문제의 예시와 같습니다.

입출력 예 #2
(1,2), (12,14,15)로 나눌 수 있습니다.
첫 번째 조에서 가장 점수가 높은 학생의 점수는 2이고, 가장 점수가 낮은 학생의 점수는 1이므로 차이는 (2-1)으로 1입니다.
두 번째 조에서의 가장 점수가 높은 학생의 점수는 15이고, 가장 점수가 낮은 학생의 점수는 12이므로 차이는 (15-12)로 3입니다.
즉 각 조에서 가장 점수가 높은 학생과 가장점수가 낮은 학생의 차이의 합은 (1+3)로 4를 return 하면 됩니다.
 */
public class SelectTeam {
	class IntervalNode implements Comparable<IntervalNode> {
		int interval;
		int index;

		public IntervalNode(int interval, int index) {
			this.interval = interval;
			this.index = index;
		}

		@Override
		public int compareTo(IntervalNode next) {
			return next.interval - this.interval;
		}
	}

	public int solution(int[] scores, int k) {
		int answer = 0;
		int n = scores.length;
		IntervalNode[] intervalDiffs = new IntervalNode[n - 1];
		for (int i = 0; i < n - 1; i++) {
			int interval = scores[i + 1] - scores[i];
			intervalDiffs[i] = new IntervalNode(interval, i);
		}

		Arrays.sort(intervalDiffs);
		List<Integer> scoresList = new ArrayList<Integer>();
		for (int i : scores) {
			scoresList.add(i);
		}

		int[] splitIndexs = new int[k - 1];
		for (int i = 0; i < k - 1; i++) {
			splitIndexs[i] = intervalDiffs[i].index + 1;
		}

		Arrays.sort(splitIndexs);
		int beforeIdx = 0;
		for (int i = 0; i < splitIndexs.length; i++) {
			int cutIdx = splitIndexs[i];

			if (beforeIdx == cutIdx) {
				answer += 0;
			} else {
				List<Integer> subList = scoresList.subList(beforeIdx, cutIdx);
				answer += (subList.get(subList.size() - 1) - subList.get(0));
			}

			beforeIdx = cutIdx;
		}

		List<Integer> subList = scoresList.subList(beforeIdx, scoresList.size());
		answer += (subList.get(subList.size() - 1) - subList.get(0));
		return answer;
	}

	public static void main(String[] args) {
		SelectTeam test2 = new SelectTeam();
		int[] scores = {1, 3, 7, 8, 10, 15};
		int k = 3;
		int solution = test2.solution(scores, k);
		System.out.println("solution = " + solution);
	}
}
