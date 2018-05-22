package it.unibs.ing.se.refactoring.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.Test;

public class GeometryAppTest {
	@Test(timeout = 200)
	public void shouldExit() throws Exception {
		Scanner input = new Scanner("0\n");
		input.useDelimiter("\n");
		GeometryApp app = new GeometryApp(input, new PrintWriter(new ByteArrayOutputStream()));
		app.run();
	}
}
