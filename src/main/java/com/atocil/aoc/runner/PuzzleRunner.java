package com.atocil.aoc.runner;

import java.lang.reflect.Constructor;
import java.util.Scanner;

import com.atocil.aoc.utils.Puzzle;

public class PuzzleRunner {
	private static Scanner inputScanner = new Scanner(System.in);
	public static void main(String[] args) {
		//while(true) {
			//int year = getIntegerFromUser("Enter Year (2019)");
			int year = 2020;
			int day = getIntegerFromUser("Enter Puzzle Day (1-25)");
			int puzzleNumber = getIntegerFromUser("Enter Puzzle Number (1-2)");

			Puzzle puzzle = null;
			try {
				Class clazz = Class.forName(String.format("com.atocil.aoc.puzzles.y%s.d%s.p%s.Runner", year, day, puzzleNumber));
				puzzle = (Puzzle) clazz.newInstance();
			} catch (Exception e) {
				System.out.println("Error finding class for puzzle. Please check input");
				System.exit(0);
			}

			System.out.println(puzzle.runPuzzle());
		//}
	}

	private static int getIntegerFromUser(String prompt) {
		System.out.print(prompt + ": ");
		String inputString = inputScanner.nextLine();
		int result = 0;

		try {
			result = Integer.parseInt(inputString);
		} catch(NumberFormatException nfe) {
			System.out.println("Please enter a valid number");
			System.exit(0);
		}

		return result;
	}
}
