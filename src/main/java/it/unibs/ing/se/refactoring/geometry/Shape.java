package it.unibs.ing.se.refactoring.geometry;

import java.math.BigDecimal;

public interface Shape {

	String toString();

	BigDecimal area();

	BigDecimal perimeter();

	String toStringWithDetails();
}