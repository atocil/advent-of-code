package com.atocil.aoc.puzzles.y2019.d2.p2;

import java.util.ArrayList;
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


		for(int i = 0; i < 100; i ++) {
			for(int j = 0; j < 100; j ++) {
				for(int x = 0; x < stringArray.length; x ++) {
					intcodes.put(x, Integer.parseInt(stringArray[x]));
				}

				intcodes.put(1, i);
				intcodes.put(2, j);

				Computer computer = new Computer();
				Map<Integer, Integer> computerResult = computer.run(intcodes);
				System.out.println(computerResult.get(0));

				if(computerResult.get(0) == 19690720) {
					return String.valueOf(((100 * i) + j));
				}
			}
		}
		return "error";
	}
}
