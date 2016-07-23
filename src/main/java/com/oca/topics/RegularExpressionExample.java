package com.oca.topics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by joshimuk on 7/20/2016.
 */
public class RegularExpressionExample {

    private void regularExpressionSample1() {
        String text =
                "This is the text which is to be searched " +
                        "for occurrences of the word 'is'.";

        String patternString = "is";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
        }
    }

    private void regularExpressionSample() {
        String text = "This is the text to be searched " +
                "for occurrences of the http:// pattern.";

        String pattern = ".*http://.*";

        boolean matches = Pattern.matches(pattern, text);

        System.out.println("matches = " + matches);
    }
}
