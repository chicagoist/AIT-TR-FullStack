package dec_05_2023;

import java.util.Arrays;

public class CesarCode {
  private int displacement;

  public CesarCode(int displacement) {
    this.displacement = displacement;
  }

  public int getDisplacement() {
    return displacement;
  }

  public String encrypt(String text) {

    char[] chars = text.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] >= 'a' && chars[i] <= 'u') {
        chars[i] = (char) (chars[i] + getDisplacement());
      } else if (chars[i] > 'u' && chars[i] <= 'z') {
        chars[i] = (char) (chars[i] + getDisplacement() - 26);
      }
    }
    return new String(chars);
  }
}
