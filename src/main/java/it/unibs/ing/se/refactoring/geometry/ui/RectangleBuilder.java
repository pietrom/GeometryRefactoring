package it.unibs.ing.se.refactoring.geometry.ui;

import java.math.BigDecimal;

import it.unibs.ing.se.refactoring.geometry.InputOutputManager;
import it.unibs.ing.se.refactoring.geometry.Shape;
import it.unibs.ing.se.refactoring.geometry.ShapeBuilder;
import it.unibs.ing.se.refactoring.geometry.shapes.Rectangle;

public class RectangleBuilder implements ShapeBuilder {
	@Override
	public String description() {
		return "Rectangle";
	}

	@Override
	public Shape buildFromUserInput(InputOutputManager io) {
		io.println("Width: ");
		int width = io.readInt();
		io.println("Length: ");
		int height = io.readInt();
		return new Rectangle(BigDecimal.valueOf(width), BigDecimal.valueOf(height));
	}
}
