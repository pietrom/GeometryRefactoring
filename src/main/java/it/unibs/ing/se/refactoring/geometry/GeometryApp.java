package it.unibs.ing.se.refactoring.geometry;

import java.io.PrintWriter;
import java.util.Scanner;

public class GeometryApp {
	private final Scanner input;
	private final PrintWriter output;

	public GeometryApp(Scanner input, PrintWriter output) {
		this.input = input;
		this.output = output;
	}

	public void run() {
		boolean go = true;
		while (go) {
			println("Insert a command:");
			println("0) Exit");
			println("1) Polygon list");
			println("2) New polygon");
			int choice = readInt();
			switch (choice) {
			case 0:
				go = false;
				break;
			case 1:
				println("Polygon list:");
				break;
			case 2:
				println("Add new Polygon:");
				break;
			}
			go = choice != 0;
		}
	}

	private void println(String msg) {
		output.println(msg);
		output.flush();
	}

	private int readInt() {
		String s = input.next();
		return Integer.parseInt(s);
	}
}
