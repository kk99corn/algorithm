package progrmmers.level1;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

/*
programmers
level: 1
title: [PCCE 기출문제] 10번 / 데이터 분석
url: https://programmers.co.kr/learn/courses/30/lessons/250121
*/
public class ItemSort {

	public static class Item {
		int code;
		int date;
		int maximum;
		int remain;
		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}

		public int getDate() {
			return date;
		}

		public void setDate(int date) {
			this.date = date;
		}

		public int getMaximum() {
			return maximum;
		}

		public void setMaximum(int maximum) {
			this.maximum = maximum;
		}

		public int getRemain() {
			return remain;
		}

		public void setRemain(int remain) {
			this.remain = remain;
		}
	}

	public static List<Item> filterItems(List<Item> itemList, String ext, int val_ext) {
		return itemList.stream()
				.filter(item -> {
					try {
						Field field = Item.class.getDeclaredField(ext);
						field.setAccessible(true);
						int value = field.getInt(item);
						return value <= val_ext;
					} catch (NoSuchFieldException | IllegalAccessException e) {
						throw new RuntimeException(e);
					}
				})
				.collect(Collectors.toList());
	}

	public static void sortItems(List<Item> itemList, String sort_by) {
		Comparator<Item> comparator = switch (sort_by) {
			case "code" -> Comparator.comparingInt(Item::getCode);
			case "date" -> Comparator.comparingInt(Item::getDate);
			case "maximum" -> Comparator.comparingInt(Item::getMaximum);
			case "remain" -> Comparator.comparingInt(Item::getRemain);
			default -> throw new IllegalArgumentException("Invalid field name: " + sort_by);
		};

		itemList.sort(comparator);
	}

	public static int[][] convertToArray(List<Item> itemList) {
		int rows = itemList.size();
		int cols = 4;
		int[][] array = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			Item item = itemList.get(i);
			array[i][0] = item.getCode();
			array[i][1] = item.getDate();
			array[i][2] = item.getMaximum();
			array[i][3] = item.getRemain();
		}

		return array;
	}

	public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
		List<Item> itemList = new ArrayList<>();
		for (int[] item : data) {
			Item i = new Item();
			i.setCode(item[0]);
			i.setDate(item[1]);
			i.setMaximum(item[2]);
			i.setRemain(item[3]);
			itemList.add(i);
		}

		itemList = filterItems(itemList, ext, val_ext);
		sortItems(itemList, sort_by);

		return convertToArray(itemList);
	}

	public static void main(String[] args) {
		int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
		String ext = "date";
		int val_ext = 20300501;
		String sort_by = "remain";

		ItemSort solution = new ItemSort();
		int[][] result = solution.solution(data, ext, val_ext, sort_by);
		System.out.println("result = " + Arrays.toString(result));
	}
}
