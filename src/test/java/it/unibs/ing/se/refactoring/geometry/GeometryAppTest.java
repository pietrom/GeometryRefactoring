package it.unibs.ing.se.refactoring.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GeometryAppTest extends EndToEndTest {
	@Test(timeout = 200)
	public void shouldExit() throws Exception {
		Scanner input = buildInput("0");
		GeometryApp app = new GeometryApp(input, new PrintWriter(new ByteArrayOutputStream()), ShapeBuilderRegistry.shapeBuilders());
		app.run();
	}

	@Test(timeout = 200)
	public void shouldPrintPolygonListAndExit() throws Exception {
		Scanner input = buildInput("1", "0");
		GeometryApp app = new GeometryApp(input, writer, ShapeBuilderRegistry.shapeBuilders());
		app.run();
		assertThat(output(), containsString("Polygon list:"));
	}

	@Test(timeout = 200)
	public void shouldPrintNewPolygonMenuAndExit() throws Exception {
		Scanner input = buildInput("2", "0", "0");
		GeometryApp app = new GeometryApp(input, writer, ShapeBuilderRegistry.shapeBuilders());
		app.run();
		assertThat(output(), containsString("Add new Polygon:"));
	}
}
