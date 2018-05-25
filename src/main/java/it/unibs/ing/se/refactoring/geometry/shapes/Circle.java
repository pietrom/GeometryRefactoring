package it.unibs.ing.se.refactoring.geometry.shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;

import it.unibs.ing.se.refactoring.geometry.Shape;

public class Circle implements Shape {
	private final BigDecimal radius;

	public Circle(BigDecimal radius) {
		this.radius = radius;
	}

	@Override
	public BigDecimal area() {
		return radius.multiply(radius).multiply(BigDecimal.valueOf(Math.PI));
	}

	@Override
	public BigDecimal perimeter() {
		return radius.multiply(BigDecimal.valueOf(2)).multiply(BigDecimal.valueOf(Math.PI));
	}

	@Override
	public String toString() {
		return String.format("Circle: Area = %s, Perimeter = %s", area().setScale(2, RoundingMode.HALF_UP).toString(),
				perimeter().setScale(2, RoundingMode.HALF_UP).toString());
	}

	@Override
	public String toStringWithDetails() {
		return String.format("Circle(%s): Area = %s, Perimeter = %s", radius.setScale(2, RoundingMode.HALF_UP).toString(),area().setScale(2, RoundingMode.HALF_UP).toString(),
				perimeter().setScale(2, RoundingMode.HALF_UP).toString());
	}
}
