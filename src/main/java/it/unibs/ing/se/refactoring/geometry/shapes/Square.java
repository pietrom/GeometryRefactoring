package it.unibs.ing.se.refactoring.geometry.shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;

import it.unibs.ing.se.refactoring.geometry.Shape;

public class Square implements Shape {
	private final BigDecimal side;

	public Square(BigDecimal side) {
		this.side = side;
	}

	@Override
	public BigDecimal area() {
		return side.multiply(side);
	}

	@Override
	public BigDecimal perimeter() {
		return BigDecimal.valueOf(4).multiply(side);
	}
	
	@Override
	public String details() {
		return side.setScale(2, RoundingMode.HALF_UP).toString();
	}
}
