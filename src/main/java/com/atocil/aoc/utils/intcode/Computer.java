package com.atocil.aoc.utils.intcode;

import java.util.Map;

public class Computer {
	public Map<Integer, Integer> run(Map<Integer, Integer> intcodes) {
		int args = 4;
		int address = 0;
		do {
			int opcode = intcodes.get(address);

			if(opcode != 1 && opcode != 2) {
				break;
			}

			Integer arg1Position = getFromMemory(address + 1, intcodes);
			Integer arg2Position = getFromMemory(address + 2, intcodes);
			Integer outputPosition = getFromMemory(address + 3, intcodes);

			if(arg1Position == null || arg2Position == null || outputPosition == null) {
				return intcodes;
			}


			Integer arg1 = getFromMemory(arg1Position, intcodes);
			Integer arg2 = getFromMemory(arg2Position, intcodes);

			if(arg1 == null || arg2 == null) {
				return intcodes;
			}

			if(opcode == 1) {
				intcodes.put(outputPosition, arg1 + arg2);
			} else if( opcode == 2) {
				intcodes.put(outputPosition, arg1 * arg2);
			}

			address += args;
		} while(true);

		return intcodes;
	}

	private Integer getFromMemory(Integer address, Map<Integer, Integer> memory) {
		if(memory.containsKey(address)) {
			return memory.get(address);
		}

		return null;
	}
}
