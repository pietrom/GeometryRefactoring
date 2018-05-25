package it.unibs.ing.se.refactoring.geometry;

import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputManager {
	private final Scanner input;
	private final PrintWriter output;

	public InputOutputManager(Scanner input, PrintWriter output) {
		this.input = input;
		this.output = output;
	}

	public void println(String msg) {
		output.println(msg);
		output.flush();
	}

	public int readInt() {
		String s = input.next();
		return Integer.parseInt(s);
	}
}
