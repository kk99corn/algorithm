package level1;

import java.util.*;

public class ReportResult {
	// 최초 풀이
	public static int[] solution(String[] id_list, String[] report, int k) {
		// result Array
		int[] answer = new int[id_list.length];

		// 1. 중복 제거(String[] -> Set<String>)
		Set<String> reportSet = new HashSet<String>(Arrays.asList(report));

		// 2. 신고받은자, 신고자리스트 세팅
		HashMap<String, ArrayList<String>> reportedMap = new HashMap<>();
		for (String reportString : reportSet) {
			String[] reportedList = reportString.split(" ");
			String reporter = reportedList[0];         // 신고자
			String reportedPerson = reportedList[1];   // 신고받은 사람

			// 신고자 임시 리스트
			ArrayList<String> reporterList = reportedMap.getOrDefault(reportedPerson, new ArrayList<>());
			reporterList.add(reporter);

			// key=신고받은사람, value=신고자리스트
			reportedMap.put(reportedPerson, reporterList);
		}

		// 신고자별 응답 메일 횟수
		HashMap<String, Integer> mailCount = new HashMap<>();
		for (String reportedPerson: reportedMap.keySet()) {
			if (reportedMap.get(reportedPerson).size() >= k) {
				for (String reporter: reportedMap.get(reportedPerson)) {
					mailCount.put(reporter, mailCount.getOrDefault(reporter, 0) + 1);
				}
			}
		}

		int i = 0;
		for(String id: id_list) {
			answer[i] = mailCount.getOrDefault(id, 0);
			i++;
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
		int k = 2;

		int[] result = solution(id_list, report, k);
		System.out.println("result = " + Arrays.toString(result));
	}
}
