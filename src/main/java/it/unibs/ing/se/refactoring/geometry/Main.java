package it.unibs.ing.se.refactoring.geometry;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useDelimiter(System.getProperty("line.separator"));
		PrintWriter output = new PrintWriter(System.out);
		GeometryApp app = new GeometryApp(input, output);
		app.run();
	}
}
