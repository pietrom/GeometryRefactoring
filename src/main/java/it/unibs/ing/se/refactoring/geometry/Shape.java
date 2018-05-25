package it.unibs.ing.se.refactoring.geometry;

import java.math.BigDecimal;
import java.math.RoundingMode;

public interface Shape {
	public static String stats(Shape shape) {
		return String.format("%s: Area = %s, Perimeter = %s", 
				shape.shapeType(),
				shape.area().setScale(2, RoundingMode.HALF_UP).toString(),
				shape.perimeter().setScale(2, RoundingMode.HALF_UP).toString()
		);
	}
	
	default String shapeType() {
		return getClass().getSimpleName();
	}

	BigDecimal area();

	BigDecimal perimeter();

	String toStringWithDetails();
}