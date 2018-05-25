package it.unibs.ing.se.refactoring.geometry.shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;

import it.unibs.ing.se.refactoring.geometry.Shape;

public class Rectangle implements Shape {
	private final BigDecimal width, height;

	public Rectangle(BigDecimal width, BigDecimal height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public BigDecimal area() {
		return width.multiply(height);
	}

	@Override
	public BigDecimal perimeter() {
		return BigDecimal.valueOf(2).multiply(width.add(height));
	}
	
	@Override
	public String toStringWithDetails() {
		return String.format("Rectangle(%sx%s): Area = %s, Perimeter = %s", width.setScale(2, RoundingMode.HALF_UP).toString(), height.setScale(2, RoundingMode.HALF_UP).toString(),area().setScale(2, RoundingMode.HALF_UP).toString(),
				perimeter().setScale(2, RoundingMode.HALF_UP).toString());
	}
}
