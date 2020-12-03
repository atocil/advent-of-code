package com.atocil.aoc.puzzles.y2019.d2.p1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.atocil.aoc.utils.InputUtil;
import com.atocil.aoc.utils.Puzzle;
import com.atocil.aoc.utils.intcode.Computer;

public class Runner implements Puzzle {
	@Override
	public String runPuzzle() {
		String[] stringArray = InputUtil.getFirstLineAsArray("2019/2/1.txt");
		Map<Integer, Integer> intcodes = new HashMap<>();

		for(int i = 0; i < stringArray.length; i ++) {
			intcodes.put(i, Integer.parseInt(stringArray[i]));
		}

		intcodes.put(1, 12);
		intcodes.put(2, 2);

		Computer computer = new Computer();
		Map<Integer, Integer> computerResult = computer.run(intcodes);
		return String.valueOf(computerResult.get(0));
	}
}
