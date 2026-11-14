import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
  @Test
  void addsTwoNumbers() {
    assertEquals(5, new Calculator().add(2, 3));
  }

  @Test
  void mulsTwoNumbers() {
    assertEquals(6, new Calculator().mul(2, 3));
  }
}
