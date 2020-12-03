package com.atocil.aoc.puzzles.y2019.d1.p1;

import java.util.List;

import com.atocil.aoc.utils.InputUtil;
import com.atocil.aoc.utils.Puzzle;

public class Runner implements Puzzle {
	public String runPuzzle() {
		List<Integer> moduleMasses = InputUtil.getLinesAsIntList("2019/1/1.txt");
		int totalFuel = moduleMasses.stream()
				.map(mass -> ((mass/3) - 2))
				.reduce(0, Integer::sum);

		return String.valueOf(totalFuel);
	}
}
