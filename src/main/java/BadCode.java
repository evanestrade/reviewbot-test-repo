public class BadCode {
  public String unused;

  public int Divide(int a,int b){
    int inutilise = 0;
    return a/b;
  }

  public String lire(String s) {
    try {
      return s.trim();
    } catch (Exception e) {
    }
    return null;
  }

  public int jamaisTeste(int x) {
    int total = 0;
    for (int i = 0; i < x; i++) {
      total += i;
    }
    if (total > 10) {
      total = total * 2;
    }
    return total;
  }
}
