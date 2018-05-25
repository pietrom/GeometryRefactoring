package it.unibs.ing.se.refactoring.geometry;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import it.unibs.ing.se.refactoring.geometry.shapes.Circle;
import it.unibs.ing.se.refactoring.geometry.shapes.Rectangle;

public class GeometryApp {
	private final Scanner input;
	private final PrintWriter output;
	private final List<Shape> polygons;

	public GeometryApp(Scanner input, PrintWriter output) {
		this.input = input;
		this.output = output;
		this.polygons = new ArrayList<Shape>();
	}

	public void run() {
		boolean go = true;
		while (go) {
			println("Insert a command:");
			println("0) Exit");
			println("1) Polygon list");
			println("2) New polygon");
			println("3) Find polygon having max(Area)");
			println("3) Detailed list");
			int choice = readInt();
			switch (choice) {
			case 0:
				go = false;
				break;
			case 1:
				println("Polygon list:");
				for (Shape polygon : polygons) {
					println(polygon.toString());
				}
				break;
			case 2:
				println("Add new Polygon:");
				println("0) Exit");
				println("1) Square");
				println("2) Rectangle");
				int polygonChoice = readInt();
				Shape shape = null;
				switch (polygonChoice) {
				case 1:
					shape = createSquare();
					break;
				case 2:
					shape = createRectangle();
					break;
				case 3:
					shape = createCircle();
					break;
				}
				if(shape != null) {
					polygons.add(shape);
				}
				break;
			case 3:
				Optional<Shape> pOpt = polygons.stream().sorted((p1, p2) -> p1.area().subtract(p2.area()).intValue())
						.findFirst();
				if (pOpt.isPresent()) {
					println(String.format("The Polygon having max(Area) is %s", pOpt.get().toString()));
				}
				break;
			// case 4:
			// println("Polygon list (with details):");
			// for (Polygon polygon : polygons) {
			// //... ... ...
			// }
			// break;
			}
		}
	}

	private Shape createCircle() {
		println("Circle: ");
		int radius = readInt();
		Shape circle = new Circle(BigDecimal.valueOf(radius));
		return circle;
	}

	private Shape createSquare() {
		println("Side length: ");
		int side = readInt();
		Shape square = new Polygon("Square", BigDecimal.valueOf(side * side), BigDecimal.valueOf(4 * side));
		return square;
	}

	private Shape createRectangle() {
		println("Width: ");
		int width = readInt();
		println("Length: ");
		int height = readInt();
		Shape shape = new Rectangle(BigDecimal.valueOf(width), BigDecimal.valueOf(height));
		return shape;
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
