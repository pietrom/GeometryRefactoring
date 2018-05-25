package it.unibs.ing.se.refactoring.geometry;

import java.math.BigDecimal;

public interface Shape {
	BigDecimal area();

	BigDecimal perimeter();

	default String shapeType() {
		return getClass().getSimpleName();
	}

	String details();
}