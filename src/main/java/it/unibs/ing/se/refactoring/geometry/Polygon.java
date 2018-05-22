package it.unibs.ing.se.refactoring.geometry;

import java.math.BigDecimal;

public class Polygon {
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
		return String.format("%s: Area = %s, Perimeter = %s", type, area().toString(), perimeter().toString());
	}

	public BigDecimal area() {
		return area;
	}

	public BigDecimal perimeter() {
		return perimeter;
	}
}
