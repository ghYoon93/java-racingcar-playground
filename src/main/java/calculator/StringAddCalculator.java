package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static int splitAndSum(String text) {
        if (nullOrEmpty(text)) {
            return 0;
        }

        String[] tokens = split(text);
        return sum(toInts(tokens));
    }

    private static int sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result  += number;
        }
        return result;
    }

    private static String[] split(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return m.group(2).split(customDelimiter);
        }
        return text.split(",|:");
    }

    private static boolean nullOrEmpty(String text) {
        return text == null || text.isEmpty();
    }

    private static int[] toInts(String[] tokens) {
        int[] numbers = new int[tokens.length];
        for (int i = 0; i < numbers.length; i++) {
            int number = toPositive(tokens[i]);
            numbers[i] = number;
        }
        return numbers;
    }

    private static int toPositive(String token) {
        int number = Integer.parseInt(token);
        if (number < 0) {
            throw new RuntimeException();
        }
        
        return Integer.parseInt(token);

    }
}
