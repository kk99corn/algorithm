package progrmmers.level1;

/*
programmers
level: 1
title: 행렬의 곱셈
url: https://programmers.co.kr/learn/courses/30/lessons/12949
*/
public class MultipleMatrix {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr2[0].length;
        int sumLength = arr1[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                for (int k = 0; k < sumLength; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 5}, {4, 1}};
        int[][] arr2 = {{1, 5}, {4, 1}};

        MultipleMatrix solution = new MultipleMatrix();
        int[][] result = solution.solution(arr1, arr2);
    }
}
