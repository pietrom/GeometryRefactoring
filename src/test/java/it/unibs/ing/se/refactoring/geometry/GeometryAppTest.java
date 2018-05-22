package it.unibs.ing.se.refactoring.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class GeometryAppTest {
	@Test(timeout = 200)
	public void shouldExit() throws Exception {
		Scanner input = new Scanner("0\n");
		input.useDelimiter("\n");
		GeometryApp app = new GeometryApp(input, new PrintWriter(new ByteArrayOutputStream()));
		app.run();
	}
	
	@Test(timeout = 200)
	public void shouldPrintPolygonListAndExit() throws Exception {
		Scanner input = new Scanner("1\n0\n");
		input.useDelimiter("\n");
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		GeometryApp app = new GeometryApp(input, new PrintWriter(output));
		app.run();
		String outText = output.toString();
		assertThat(outText, containsString("Polygon list:"));
	}
}
