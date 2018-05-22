package it.unibs.ing.se.refactoring.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class EndToEndTest {
	protected static Scanner buildInput(String... commands) {
		Scanner input = new Scanner(String.join("\n", commands));
		input.useDelimiter("\n");
		return input;
	}

	private ByteArrayOutputStream output = new ByteArrayOutputStream();
	protected PrintWriter writer = new PrintWriter(output);

	public EndToEndTest() {
		super();
	}

	protected String output() {
		return output.toString();
	}
}