package com.puzzles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dimention = new int[2];
		int[] adventurerPosition = new int[2];
		int[] goldPosition = new int[2];
		int i = 0;
		while (i < 3) {
			if (i == 0) {
				System.out.print("Dimensions of the dungeon(Row x Column) : ");
				String str = br.readLine();
				String[] input = str.split(" ");
				for (int j = 0; j < input.length; j++) {
					dimention[j] = Integer.parseInt(input[j]);
				}
			} else if (i == 1) {
				System.out.print("Position of adventurer : ");
				String str = br.readLine();
				String[] input = str.split(" ");
				for (int j = 0; j < input.length; j++) {
					adventurerPosition[j] = Integer.parseInt(input[j]);
				}
			} else if (i == 2) {
				System.out.print("Position of gold : ");
				String str = br.readLine();
				String[] input = str.split(" ");
				for (int j = 0; j < input.length; j++) {
					goldPosition[j] = Integer.parseInt(input[j]);
				}
			}
			i++;
		}
		int steps = Math.abs(goldPosition[0] - adventurerPosition[0])
				+ Math.abs(goldPosition[1] - adventurerPosition[1]);
		System.out.println("Minimum number of steps : " + steps);
	}
}