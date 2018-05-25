package it.unibs.ing.se.refactoring.geometry.ui;

import java.math.BigDecimal;

import it.unibs.ing.se.refactoring.geometry.InputOutputManager;
import it.unibs.ing.se.refactoring.geometry.Shape;
import it.unibs.ing.se.refactoring.geometry.ShapeBuilder;
import it.unibs.ing.se.refactoring.geometry.shapes.Square;

public class SquareBuilder implements ShapeBuilder {
	@Override
	public String description() {
		return "Square";
	}

	@Override
	public Shape buildFromUserInput(InputOutputManager io) {
		io.println("Side length: ");
		int side = io.readInt();
		return new Square(BigDecimal.valueOf(side));
	}

}
