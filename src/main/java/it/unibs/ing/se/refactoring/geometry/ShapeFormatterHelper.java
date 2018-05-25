package it.unibs.ing.se.refactoring.geometry;

import java.math.RoundingMode;

public class ShapeFormatterHelper {
	public static String stats(Shape shape) {
		return String.format("%s: Area = %s, Perimeter = %s", 
				shape.shapeType(),
				shape.area().setScale(2, RoundingMode.HALF_UP).toString(),
				shape.perimeter().setScale(2, RoundingMode.HALF_UP).toString()
		);
	}
	
	public static String detailedStats(Shape shape) {
		return String.format("%s(%s): Area = %s, Perimeter = %s", 
				shape.shapeType(),
				shape.details(),
				shape.area().setScale(2, RoundingMode.HALF_UP).toString(),
				shape.perimeter().setScale(2, RoundingMode.HALF_UP).toString()
		);
	}
}
