package it.unibs.ing.se.refactoring.geometry;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
		return String.format("%s: Area = %s, Perimeter = %s", type, area().setScale(2, RoundingMode.HALF_UP).toString(), perimeter().setScale(2, RoundingMode.HALF_UP).toString());
	}

	public BigDecimal area() {
		return area;
	}

	public BigDecimal perimeter() {
		return perimeter;
	}
}
