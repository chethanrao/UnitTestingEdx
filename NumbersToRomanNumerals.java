import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


import org.junit.Assert;
import org.junit.Test;


public class NumbersToRomanNumerals {
    private static Map<Integer, String> numberToRomanMap;

    static {
        numberToRomanMap = new LinkedHashMap<Integer, String>();
        numberToRomanMap.put(1000, "M");
        numberToRomanMap.put(900, "CM");
        numberToRomanMap.put(500, "D");
        numberToRomanMap.put(400, "CD");
        numberToRomanMap.put(100, "C");
        numberToRomanMap.put(90, "XC");
        numberToRomanMap.put(50, "L");
        numberToRomanMap.put(40, "XL");
        numberToRomanMap.put(10, "X");
        numberToRomanMap.put(9, "IX");
        numberToRomanMap.put(5, "V");
        numberToRomanMap.put(4, "IV");
        numberToRomanMap.put(1, "I");
    }

    public String convert(int num) {
        StringBuilder builder = new StringBuilder();
        while (num > 0) {

            for (int key : numberToRomanMap.keySet()) {
                if (num >= key) {
                    builder.append(numberToRomanMap.get(key));
                    num = num - key;
                    break;
                }

            }
        }

        return builder.toString();
    }

    @Test
    public void threeThousandNineHundredAndNinetyNineIntgerToRoman() {
        Assert.assertEquals("MMMCMXCIX", convert(3999));
    }

    @Test
    public void oneThousandIntgerToRoman() {
        Assert.assertEquals("M", convert(1000));
    }

    @Test
    public void nineHundredIntgerToRoman() {
        Assert.assertEquals("CM", convert(900));
    }

    @Test
    public void fiveHundredIntgerToRoman() {
        Assert.assertEquals("D", convert(500));
    }

    @Test
    public void fourHundredIntgerToRoman() {
        Assert.assertEquals("CD", convert(400));
    }

    @Test
    public void threeHundredAndNinetyNineIntgerToRoman() {
        Assert.assertEquals("CCCXCIX", convert(399));
    }

    @Test
    public void ninetyIntgerToRoman() {
        Assert.assertEquals("XC", convert(90));
    }

    @Test
    public void eightyNineIntgerToRoman() {
        Assert.assertEquals("LXXXIX", convert(89));
    }

    @Test
    public void sixtyIntgerToRoman() {
        Assert.assertEquals("LX", convert(60));
    }

    @Test
    public void fiftyIntgerToRoman() {
        Assert.assertEquals("L", convert(50));
    }

    @Test
    public void fortyIntgerToRoman() {
        Assert.assertEquals("XL", convert(40));
    }

    @Test
    public void fourtyOneIntgerToRoman() {
        Assert.assertEquals("XLI", convert(41));
    }

    @Test
    public void oneIntgerToRoman() {
        Assert.assertEquals("I", convert(1));
    }

    @Test
    public void twoIntgerToRoman() {
        Assert.assertEquals("II", convert(2));
    }

    @Test
    public void fiveIntgerToRoman() {
        Assert.assertEquals("V", convert(5));
    }

    @Test
    public void fourIntgerToRoman() {
        Assert.assertEquals("IV", convert(4));
    }

    @Test
    public void sixIntgerToRoman() {
        Assert.assertEquals("VI", convert(6));
    }

    @Test
    public void nineIntgerToRoman() {
        Assert.assertEquals("IX", convert(9));
    }

    @Test
    public void tenIntgerToRoman() {
        Assert.assertEquals("X", convert(10));
    }

    @Test
    public void fourteenIntgerToRoman() {
        Assert.assertEquals("XIV", convert(14));
    }

    @Test
    public void thirtyNineIntgerToRoman() {
        Assert.assertEquals("XXXIX", convert(39));
    }
}
