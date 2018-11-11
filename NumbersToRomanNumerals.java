import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;


public class NumbersToRomanNumerals {
	private static Map<Integer, String> numberToRomanMap;

	static {
		numberToRomanMap = new HashMap<Integer, String>();
		numberToRomanMap.put(1, "I");
		numberToRomanMap.put(4, "IV");
		numberToRomanMap.put(5, "V");
		numberToRomanMap.put(9, "IX");
		numberToRomanMap.put(10, "X");
		numberToRomanMap.put(40, "XL");
		numberToRomanMap.put(50, "L");
		numberToRomanMap.put(90, "XC");
		numberToRomanMap.put(100, "C");
		numberToRomanMap.put(400, "CD");
		numberToRomanMap.put(500, "D");
		numberToRomanMap.put(900, "CM");
		numberToRomanMap.put(1000, "M");
	}

	public String convert(int num) {
		StringBuilder builder = new StringBuilder();
		while (num > 0) {

			if (num >=1000) {
				builder.append(numberToRomanMap.get(1000));
				num = num - 1000;
			} else if (num >= 900) {
				builder.append(numberToRomanMap.get(900));
				num = num - 900;
			} else if (num >= 500) {
				builder.append(numberToRomanMap.get(500));
				num = num - 500;
			} else if (num  >= 400) {
				builder.append(numberToRomanMap.get(400));
				num = num - 400;
			} else if (num  >= 100) {
				builder.append(numberToRomanMap.get(100));
				num = num - 100;
			} else if (num >= 90) {
				builder.append(numberToRomanMap.get(90));
				num = num - 90;
			} else if (num >= 50) {
				builder.append(numberToRomanMap.get(50));
				num = num - 50;
			} else if (num  >= 40) {
				builder.append(numberToRomanMap.get(40));
				num = num - 40;
			} else if (num >= 10) {
				builder.append(numberToRomanMap.get(10));
				num = num - 10;
			} else if (num >= 9) {
				builder.append(numberToRomanMap.get(9));
				num = num - 9;
			} else if (num >= 5) {
				builder.append(numberToRomanMap.get(5));
				num = num - 5;
			} else if (num >= 4) {
				builder.append(numberToRomanMap.get(4));
				num = num - 4;
			} else {
				builder.append(numberToRomanMap.get(1));
				num = num - 1;
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
