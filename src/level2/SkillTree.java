package level2;

import java.util.LinkedList;
import java.util.Queue;

/*
programmers
level: 2
title: 스킬트리
url: https://programmers.co.kr/learn/courses/30/lessons/49993
*/
public class SkillTree {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		Queue<Character> q = new LinkedList<>();
		for (int i = 0; i < skill.length(); i++) {
			q.offer(skill.charAt(i));
		}

		for (String skillTree : skill_trees) {
			boolean isOk = true;
			Queue<Character> tempQ = new LinkedList<>(q);
			for (int i = 0; i < skillTree.length(); i++) {
				if (!tempQ.isEmpty() && tempQ.peek() == skillTree.charAt(i)) {
					tempQ.poll();
				} else {
					if (tempQ.contains(skillTree.charAt(i))) {
						isOk = false;
						break;
					}
				}
			}
			if (isOk) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

		SkillTree skillTree = new SkillTree();
		int solution = skillTree.solution(skill, skill_trees);
		System.out.println("solution = " + solution);
	}
}
