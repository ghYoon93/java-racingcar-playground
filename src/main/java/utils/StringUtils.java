package utils;

public class StringUtils {

    public static boolean isBlank(String name) {
        return "".equals(name) || name.isEmpty();
    }
}
