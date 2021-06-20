package codingprograms;

import java.util.Arrays;

public class StringWordFirstLetterUpper {
  public static void main(String[] args) {
    String sentence = "my name iscishnu ram";
    char[] charArray = sentence.toCharArray();
    String result = "";

    for (int i = 0; i < charArray.length; i++) {
      if((i == 0 && charArray[i] != ' ' && charArray[i] >= 97)
        || (charArray[i-1] == ' ' && charArray[i] != ' ' && charArray[i] >= 97))
        result = result+(char)(charArray[i]-32);
      else
        result = result+charArray[i];
    }

    System.out.println(result);
  }
}
