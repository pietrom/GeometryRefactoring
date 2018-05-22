package it.unibs.ing.se.refactoring.geometry;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeometryApp {
	private final Scanner input;
	private final PrintWriter output;
	private final List<Polygon> polygons;

	public GeometryApp(Scanner input, PrintWriter output) {
		this.input = input;
		this.output = output;
		this.polygons = new ArrayList<Polygon>();
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
				for (Polygon polygon : polygons) {
					println(polygon.toString());
				}
				break;
			case 2:
				println("Add new Polygon:");
				println("0) Exit");
				println("1) Square");
				println("2) Rectangle");
				int polygonChoice = readInt();
				switch(polygonChoice) {
					case 1:
						println("Side length: ");
						int side = readInt();
						polygons.add(new Polygon("Square", BigDecimal.valueOf(side * side), BigDecimal.valueOf(4 * side)));
						break;
					case 2:
						println("Width: ");
						int width = readInt();
						println("Length: ");
						int height = readInt();
						polygons.add(new Polygon("Rectangle", BigDecimal.valueOf(width * height), BigDecimal.valueOf(2 * (width + height))));
						break;
				}
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
