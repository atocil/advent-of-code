package com.atocil.aoc.puzzles.y2019.d1.p2;

import java.util.List;

import com.atocil.aoc.utils.InputUtil;
import com.atocil.aoc.utils.Puzzle;

public class Runner implements Puzzle {
	public String runPuzzle() {
		List<Integer> moduleMasses = InputUtil.getLinesAsIntList("2019/1/1.txt");
		int totalFuel = moduleMasses.stream()
				.map(mass -> recursiveMass(mass))
				.reduce(0, Integer::sum);

		return String.valueOf(totalFuel);
	}

	private int recursiveMass(int mass) {
		if(mass <= 0) {
			return 0;
		}

		int fuel = Math.max(0, (mass/3) - 2);
		int extraFuel = recursiveMass(fuel);

		return fuel + extraFuel;
	}
}
