import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BadCodeTest {
  @Test
  void ceTestPasse() {
    assertEquals(2, new BadCode().Divide(4, 2));
  }

  @Test
  void ceTestEchoue() {
    assertEquals(3, new BadCode().Divide(4, 2));
  }
}
