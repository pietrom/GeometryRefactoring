package it.unibs.ing.se.refactoring.geometry;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import java.util.Scanner;

import org.junit.Test;

public class GeometryAppSagasTest extends EndToEndTest {
	@Test
	public void executeSaga00() throws Exception {
		Scanner input = buildInput("2", "1", "10", "2", "2", "12", "14", "1", "0");
		GeometryApp app = new GeometryApp(input, writer);
		app.run();
		assertThat(output(), containsString("Square: Area = 100, Perimeter = 40"));
		assertThat(output(), containsString("Rectangle: Area = 168, Perimeter = 52"));
	}
}
