import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BadCodeTest {
  @Test
  void ceTestPasse() {
    assertEquals(2, 1 + 1);
  }

  @Test
  void ceTestEchoue() {
    assertEquals(3, 1 + 1);
  }
}
