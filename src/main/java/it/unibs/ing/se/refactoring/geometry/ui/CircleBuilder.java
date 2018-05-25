package it.unibs.ing.se.refactoring.geometry.ui;

import java.math.BigDecimal;

import it.unibs.ing.se.refactoring.geometry.InputOutputManager;
import it.unibs.ing.se.refactoring.geometry.Shape;
import it.unibs.ing.se.refactoring.geometry.ShapeBuilder;
import it.unibs.ing.se.refactoring.geometry.shapes.Circle;

public class CircleBuilder implements ShapeBuilder {
	@Override
	public String description() {
		return "Circle";
	}

	@Override
	public Shape buildFromUserInput(InputOutputManager io) {
		io.println("Circle: ");
		int radius = io.readInt();
		return new Circle(BigDecimal.valueOf(radius));
	}
}
