package yuliatestprograms;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URLParse {

public static void parse (String input) {
    Matcher matcherParameter = Pattern.compile
            ("(?<=\\?|\\&)[\\w\\+]*").
            matcher(input);

    Matcher matcherValue = Pattern.compile
            ("(?<=\\=)[\\w\\+]*").
            matcher(input);

    System.out.println("The URL is " + input + " and its query string parameters are");

    while(matcherParameter.find() && matcherValue.find()) {
        System.out.println(matcherParameter.group() +
                ": " + matcherValue.group().
                replaceAll("\\+", " "));
    }
  }
}
