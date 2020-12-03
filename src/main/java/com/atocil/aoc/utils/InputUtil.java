package com.atocil.aoc.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class InputUtil {
	public static List<Integer> getLinesAsIntList(String fileName) {

		final LinkedList<Integer> result = new LinkedList<Integer>();

		getBufferedReader(fileName).lines().forEach(line -> {
					result.add(Integer.parseInt(line));
				});

		return result;

	}

	public static String[] getFirstLineAsArray(String fileName) {
		return getBufferedReader(fileName).lines().findFirst().orElse("").split(",");
	}

	private static BufferedReader getBufferedReader(String fileName) {
		InputStream is = InputUtil.class.getClassLoader().getResourceAsStream(fileName);
		return new BufferedReader(new InputStreamReader(is));
	}
}
