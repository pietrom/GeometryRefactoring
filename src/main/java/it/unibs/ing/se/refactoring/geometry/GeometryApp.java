package it.unibs.ing.se.refactoring.geometry;

import static it.unibs.ing.se.refactoring.geometry.ShapeFormatterHelper.detailedStats;
import static it.unibs.ing.se.refactoring.geometry.ShapeFormatterHelper.stats;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class GeometryApp {
	private final InputOutputManager io;
	private final List<ShapeBuilder> shapeBuilders;
	private final List<Shape> polygons;

	public GeometryApp(Scanner input, PrintWriter output, List<ShapeBuilder> shapeBuilders) {
		this.io = new InputOutputManager(input, output);
		this.shapeBuilders = shapeBuilders;
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
				for (int i = 0; i < shapeBuilders.size(); i++) {
					io.println(String.format("%d) %s", (i + 1), shapeBuilders.get(i).description()));
				}
				int polygonChoice = io.readInt();
				if(polygonChoice > 0 && polygonChoice <= shapeBuilders.size()) {
					Shape shape = shapeBuilders.get(polygonChoice - 1).buildFromUserInput(io);
					if (shape != null) {
						polygons.add(shape);
					}					
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
}
