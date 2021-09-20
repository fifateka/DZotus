package Utils;

public class StringUtils {
    public static String yearStringByCount(Integer count) {
        String countString = count.toString();
        char lastChar = countString.charAt(countString.length() - 1);
        Integer lastDigit = Integer.valueOf(String.valueOf(lastChar));

        if (lastDigit == 1) return "год";
        if (lastDigit > 1 && lastDigit < 5) return "года";

        return "лет";
    }
}
