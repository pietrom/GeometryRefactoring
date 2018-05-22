package it.unibs.ing.se.refactoring.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class GeometryAppTest {
	private static Scanner buildInput(String... commands) {
		Scanner input = new Scanner(String.join("\n", commands));
		input.useDelimiter("\n");
		return input;
	}

	@Test(timeout = 200)
	public void shouldExit() throws Exception {
		Scanner input = buildInput("0");
		GeometryApp app = new GeometryApp(input, new PrintWriter(new ByteArrayOutputStream()));
		app.run();
	}

	@Test(timeout = 200)
	public void shouldPrintPolygonListAndExit() throws Exception {
		Scanner input = buildInput("1", "0");
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		GeometryApp app = new GeometryApp(input, new PrintWriter(output));
		app.run();
		String outText = output.toString();
		assertThat(outText, containsString("Polygon list:"));
	}
}
