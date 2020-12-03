package com.atocil.aoc.puzzles.y2020.d1.p2;

import java.util.List;

import com.atocil.aoc.utils.InputUtil;
import com.atocil.aoc.utils.Puzzle;

public class Runner implements Puzzle {
	@Override
	public String runPuzzle() {
		List<Integer> entries = InputUtil.getLinesAsIntList("2020/1/1.txt");

		for (int i = 0; i < entries.size() - 2; i++) {
			for(int j = i+1; j < entries.size() - 1; j ++) {
				for(int k = j+1; k < entries.size(); k ++) {
					if (entries.get(i) + entries.get(j) + entries.get(k) == 2020)
						return String.valueOf(entries.get(i) * entries.get(j) * entries.get(k));
				}
			}
		}

		return "Error";
	}
}
