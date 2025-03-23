package com.felixseifert.java;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class HelloJavaTest extends AbstractHelloTest {

  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }

  @AfterEach
  public void tearDown() {
    System.setOut(standardOut);
  }

  @Override
  protected void callMainWith(final String[] args) {
    Hello.main(args);
  }

  @Override
  protected String getOutput() {
    return outputStreamCaptor.toString();
  }
}
