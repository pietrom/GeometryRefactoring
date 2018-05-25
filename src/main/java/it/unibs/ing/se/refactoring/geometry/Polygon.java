package it.unibs.ing.se.refactoring.geometry;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Polygon implements Shape {
	private final String type;
	private final BigDecimal area;
	private final BigDecimal perimeter;

	public Polygon(String type, BigDecimal area, BigDecimal perimeter) {
		this.type = type;
		this.area = area;
		this.perimeter = perimeter;
	}

	@Override
	public String toString() {
		return String.format("%s: Area = %s, Perimeter = %s", type, area().setScale(2, RoundingMode.HALF_UP).toString(), perimeter().setScale(2, RoundingMode.HALF_UP).toString());
	}

	@Override
	public BigDecimal area() {
		return area;
	}

	@Override
	public BigDecimal perimeter() {
		return perimeter;
	}

	@Override
	public String toStringWithDetails() {
		// TODO Auto-generated method stub
		return null;
	}
}
