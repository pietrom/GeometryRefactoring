package it.unibs.ing.se.refactoring.geometry;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import java.util.Scanner;

import org.junit.Test;

public class GeometryAppSagasTest extends EndToEndTest {
	@Test
	public void executeSaga00() throws Exception {
		Scanner input = buildInput("2", "1", "10", "2", "2", "12", "14", "1", "0");
		GeometryApp app = new GeometryApp(input, writer, ShapeBuilderRegistry.shapeBuilders());
		app.run();
		assertThat(output(), containsString("Square: Area = 100.00, Perimeter = 40.00"));
		assertThat(output(), containsString("Rectangle: Area = 168.00, Perimeter = 52.00"));
	}
	
	@Test
	public void executeSaga01() throws Exception {
		Scanner input = buildInput("2", "1", "10", "2", "3", "10", "1", "0");
		GeometryApp app = new GeometryApp(input, writer, ShapeBuilderRegistry.shapeBuilders());
		app.run();
		assertThat(output(), containsString("Square: Area = 100.00, Perimeter = 40.00"));
		assertThat(output(), containsString("Circle: Area = 314.16, Perimeter = 62.83"));
	}
	
	@Test
	public void executeSaga02() throws Exception {
		Scanner input = buildInput("2", "1", "10", "2", "2", "12", "14", "3", "0");
		GeometryApp app = new GeometryApp(input, writer, ShapeBuilderRegistry.shapeBuilders());
		app.run();
		assertThat(output(), containsString("The Polygon having max(Area) is Square: Area = 100.00, Perimeter = 40.00"));
	}
	
	@Test
	public void executeSaga03() throws Exception {
		Scanner input = buildInput("2", "1", "10", "2", "2", "12", "14", "4", "0");
		GeometryApp app = new GeometryApp(input, writer, ShapeBuilderRegistry.shapeBuilders());
		app.run();
		assertThat(output(), containsString("Square(10.00): Area = 100.00, Perimeter = 40.00"));
		assertThat(output(), containsString("Rectangle(12.00x14.00): Area = 168.00, Perimeter = 52.00"));
	}
}
