package it.unibs.ing.se.refactoring.geometry;

public interface ShapeBuilder {
	String description();

	Shape buildFromUserInput(InputOutputManager io);
}
