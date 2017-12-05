package com.tisawesomeness.advent;

import java.util.Scanner;

public class D2P1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		while (scan.hasNextLine()) {
		    String line = scan.nextLine();
		    if (line.isEmpty()) break;
		    input += line + "\n";
		}
		scan.close();
		
		int sum = 0;
		String[] lines = input.split("\\n");
		for (String s : lines) {
			int highest = Integer.MIN_VALUE;
			int lowest = Integer.MAX_VALUE;
			for (String num : s.split("[^0-9]")) {
				if (!num.equals("")) {
					int i = Integer.valueOf(num);
					if (i < lowest) lowest = i;
					if (i > highest) highest = i;
				}
			}
			sum += highest - lowest;
		}
		System.out.println(sum);
	}

}
