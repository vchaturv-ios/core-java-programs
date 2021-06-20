package interprogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitTesting1Test {

  @Test
  public void testAddMethod() {
    JunitTesting1 junitTesting1 = new JunitTesting1();
    assertEquals(5, junitTesting1.add(2,3));
  }

}