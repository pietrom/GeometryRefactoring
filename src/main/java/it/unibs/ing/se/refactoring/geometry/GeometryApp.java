package it.unibs.ing.se.refactoring.geometry;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import it.unibs.ing.se.refactoring.geometry.shapes.Circle;
import it.unibs.ing.se.refactoring.geometry.shapes.Rectangle;
import it.unibs.ing.se.refactoring.geometry.shapes.Square;

import static it.unibs.ing.se.refactoring.geometry.ShapeFormatterHelper.*;

public class GeometryApp {
	private final InputOutputManager io;
		private final List<Shape> polygons;

	public GeometryApp(Scanner input, PrintWriter output) {
		this.io = new InputOutputManager(input, output);
		this.polygons = new ArrayList<Shape>();
	}

	public void run() {
		boolean go = true;
		while (go) {
			io.println("Insert a command:");
			io.println("0) Exit");
			io.println("1) Polygon list");
			io.println("2) New polygon");
			io.println("3) Find polygon having max(Area)");
			io.println("3) Detailed list");
			int choice = io.readInt();
			switch (choice) {
			case 0:
				go = false;
				break;
			case 1:
				io.println("Polygon list:");
				for (Shape polygon : polygons) {
					io.println(stats(polygon));
				}
				break;
			case 2:
				io.println("Add new Polygon:");
				io.println("0) Exit");
				io.println("1) Square");
				io.println("2) Rectangle");
				int polygonChoice = io.readInt();
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
				if (shape != null) {
					polygons.add(shape);
				}
				break;
			case 3:
				Optional<Shape> pOpt = polygons.stream().sorted((p1, p2) -> p1.area().subtract(p2.area()).intValue())
						.findFirst();
				if (pOpt.isPresent()) {
					io.println(String.format("The Polygon having max(Area) is %s", stats(pOpt.get())));
				}
				break;
			case 4:
				io.println("Polygon list (with details):");
				for (Shape s : polygons) {
					io.println(detailedStats(s));
				}
				break;
			}
		}
	}

	private Shape createCircle() {
		io.println("Circle: ");
		int radius = io.readInt();
		return new Circle(BigDecimal.valueOf(radius));
	}

	private Shape createSquare() {
		io.println("Side length: ");
		int side = io.readInt();
		return new Square(BigDecimal.valueOf(side));
	}

	private Shape createRectangle() {
		io.println("Width: ");
		int width = io.readInt();
		io.println("Length: ");
		int height = io.readInt();
		return new Rectangle(BigDecimal.valueOf(width), BigDecimal.valueOf(height));
	}	
}
