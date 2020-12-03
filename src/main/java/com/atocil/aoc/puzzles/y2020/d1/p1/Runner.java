package com.atocil.aoc.puzzles.y2020.d1.p1;

import java.util.List;

import com.atocil.aoc.utils.InputUtil;
import com.atocil.aoc.utils.Puzzle;

public class Runner implements Puzzle {
	@Override
	public String runPuzzle() {
		List<Integer> entries = InputUtil.getLinesAsIntList("2020/1/1.txt");

		for (int i = 0; i < entries.size() - 1; i++) {
			for(int j = i+1; j < entries.size(); j ++) {
				if(entries.get(i) + entries.get(j) == 2020)
					return String.valueOf(entries.get(i) * entries.get(j));
			}
		}

		return "Error";
	}
}
