package it.unibs.ing.se.refactoring.geometry;

import java.util.Arrays;
import java.util.List;

import it.unibs.ing.se.refactoring.geometry.ui.CircleBuilder;
import it.unibs.ing.se.refactoring.geometry.ui.RectangleBuilder;
import it.unibs.ing.se.refactoring.geometry.ui.SquareBuilder;

public class ShapeBuilderRegistry {
	public static List<ShapeBuilder> shapeBuilders() {
		return Arrays.asList(new ShapeBuilder[] {
				new SquareBuilder(),
				new RectangleBuilder(),
				new CircleBuilder()
		});
	}
}
