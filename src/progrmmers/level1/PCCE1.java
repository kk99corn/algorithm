package progrmmers.level1;

import java.util.HashMap;
import java.util.Map;

/*
programmers
level: 1
title: [PCCP 기출문제] 1번 / 붕대 감기
url: https://programmers.co.kr/learn/courses/30/lessons/250137
*/
public class PCCE1 {

    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;

        int time = bandage[0];
        int heal = bandage[1];
        int add = bandage[2];
        int continueCount = 0;
        int lastIdx = 0;

        Map<Integer, Integer> attackMap = new HashMap<>();
        for (int[] attack : attacks) {
            attackMap.put(attack[0], attack[1]);
            lastIdx = attack[0];
        }
        System.out.println(attackMap);

        int idx = 1;
        while (lastIdx >= idx) {
            if (attackMap.get(idx) != null) {
                answer -= attackMap.get(idx);
                continueCount = 0;
            } else {
                continueCount++;
                if (continueCount == time) {
                    answer += add;
                    continueCount = 0;
                }
                answer += heal;
                if (answer > health) {
                    answer = health;
                }
            }

            if (answer <= 0) {
                answer = -1;
                break;
            }
            System.out.println(answer);

            idx++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] bandage = {1, 1, 1};
        int health = 20;
        int[][] attacks = {{1, 5}, {4, 1}};

        PCCE1 solution = new PCCE1();
        int result = solution.solution(bandage, health, attacks);
        System.out.println("result = " + (result));
    }
}
