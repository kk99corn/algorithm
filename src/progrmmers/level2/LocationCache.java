package progrmmers.level2;

import java.util.*;

/*
programmers
level: 2
title: [1차] 캐시
url: https://programmers.co.kr/learn/courses/30/lessons/17680
*/
public class LocationCache {

	Map<String, Cache> cache = new LinkedHashMap<>();
	int inputIdx = 0;

	public static class Cache implements Comparable<Cache> {
		int idx;
		String city;
		int hitCnt;

		public Cache(int idx, String city) {
			this.idx = idx;
			this.city = city;
			this.hitCnt = 0;
		}

		@Override
		public String toString() {
			return "Cache{" +
					"idx=" + idx +
					", city='" + city + '\'' +
					", hitCnt=" + hitCnt +
					'}';
		}

		@Override
		public int compareTo(Cache o) {
			if (this.hitCnt != o.hitCnt) {
				return Integer.compare(this.hitCnt, o.hitCnt);
			} else {
				return Integer.compare(this.idx, o.idx);
			}
		}
	}

	public void mapSort() {
		List<Map.Entry<String, Cache>> entryList = new LinkedList<>(cache.entrySet());
		entryList.sort(new Comparator<Map.Entry<String, Cache>>() {
			@Override
			public int compare(Map.Entry<String, Cache> o1, Map.Entry<String, Cache> o2) {

				if (o1.getValue().hitCnt != o2.getValue().hitCnt) {
					return Integer.compare(o1.getValue().hitCnt, o2.getValue().hitCnt);
				} else {
					return Integer.compare(o1.getValue().idx, o2.getValue().idx);
				}
			}
		});
	}

	public int solution(int cacheSize, String[] cities) {

		int answer = 0;
		for (String city : cities) {
			city = city.toUpperCase(Locale.ROOT);
			Cache temp = cache.get(city);
			if (temp == null) {
				// 캐시 미히트
				if (cache.size() < cacheSize) {
					// 신규 캐시 추가
					cache.put(city, new Cache(inputIdx++, city));
					mapSort();
					for (String k : cache.keySet()) {
						System.out.println("cache.get(k) = " + cache.get(k));
					}
				} else {
					if (cacheSize != 0) {
						// 기존 캐시 삭제
						String[] key = cache.keySet().toArray(new String[0]);
						cache.remove(key[0]);
						cache.put(city, new Cache(inputIdx++, city));
						mapSort();
						for (String k : cache.keySet()) {
							System.out.println("cache.get(k) = " + cache.get(k));
						}
					}
				}
				answer += 5;
			} else {
				// 캐시 히트
				temp.hitCnt++;
				cache.remove(temp.city);
				cache.put(temp.city, temp);
				mapSort();
				for (String k : cache.keySet()) {
					System.out.println("cache.get(k) = " + cache.get(k));
				}
				answer += 1;
			}
			System.out.println();
		}

		System.out.println("----------------");
		for (String k : cache.keySet()) {
			System.out.println("cache.get(k) = " + cache.get(k));
		}

		return answer;
	}

	public static void main(String[] args) {

		// 50
//		int cacheSize = 3;
//		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

		// 52
//		int cacheSize = 5;
//		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

		// 25
//		int cacheSize = 0;
//		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

		// 16
		int cacheSize = 2;
		String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};

		LocationCache locationCache = new LocationCache();
		int solution = locationCache.solution(cacheSize, cities);
		System.out.println("solution = " + solution);
	}
}
