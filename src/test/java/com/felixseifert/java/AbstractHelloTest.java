package com.felixseifert.java;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

abstract class AbstractHelloTest {

  @Test
  public void mainTest_empty() throws IOException, InterruptedException {
    callMainWith(new String[0]);
    Assertions.assertEquals("Hello World!\n", getOutput());
  }

  @Test
  public void mainTest_arg() throws IOException, InterruptedException {
    callMainWith(new String[] {"Sandra"});
    Assertions.assertEquals("Hello Sandra!\n", getOutput());
  }

  protected abstract void callMainWith(final String[] args)
      throws IOException, InterruptedException;

  protected abstract String getOutput();
}
