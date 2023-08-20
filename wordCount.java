import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  static int countWords(String str) {
    Pattern pattern = Pattern.compile("\\s+");
    Matcher matcher = pattern.matcher(str.trim());
    //long wc = matcher.results().count();
    int wc = 0;
    while (matcher.find()) {
      wc++;
    }
    if (wc == 0) {
      return wc;
    } else {
      return wc + 1;
    }
  }

  public static void main(String[] args) {
    String str = "Hello World";
    int wc = countWords(str);
    System.out.println("Word Count of [" + str + "]" + " is " + wc);
  }
}
