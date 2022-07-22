package progrmmers.level2;

public class GroundEat {
	int sumMax = 0;
	int solution(int[][] land) {

		r(0, 0, -1, land);
		int answer = sumMax;

		return answer;
	}

	void r(int sum, int n, int idx, int[][] land) {
		if (n == land.length) {
			if (sumMax < sum) sumMax = sum;
		} else {
			for (int i = 0; i < land[n].length; i++) {
				if (i != idx) {
					r(sum + land[n][i], n + 1, i, land);
				}
			}
		}
	}

	public static void main(String[] args) {

		int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};

		GroundEat groundEat = new GroundEat();
		int solution = groundEat.solution(land);
		System.out.println("solution = " + solution);
	}
}
