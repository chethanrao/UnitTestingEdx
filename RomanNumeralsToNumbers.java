import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsToNumbers {

	private static Map<Character, Integer> romanToNumberMap;

	static {
		romanToNumberMap = new HashMap<Character, Integer>();
		romanToNumberMap.put('I', 1);
		romanToNumberMap.put('V', 5);
		romanToNumberMap.put('X', 10);
		romanToNumberMap.put('L', 50);
		romanToNumberMap.put('C', 100);
		romanToNumberMap.put('D', 500);
		romanToNumberMap.put('M', 1000);
	}

	public int convert(String s) {

		int convertedNumber = 0;
		for (int i = 0; i < s.length(); i++) {
			int currentNumber = romanToNumberMap.get(s.charAt(i));
			int next = i + 1 < s.length() ? romanToNumberMap.get(s.charAt(i + 1)) : 0;

			if (currentNumber >= next)
				convertedNumber += currentNumber;
			else
				convertedNumber -= currentNumber;
		}

		return convertedNumber;

	}

	@Test
	public void threeThousandNineHundredAndNinetyNineRomanToInteger() {
		Assert.assertEquals(convert("MMMCMXCIX"), 3999);
	}

	@Test
	public void oneThousandRomanToInteger() {
		Assert.assertEquals(convert("M"), 1000);
	}

	@Test
	public void nineHundredRomanToInteger() {
		Assert.assertEquals(convert("CM"), 900);
	}

	@Test
	public void fiveHundredRomanToInteger() {
		Assert.assertEquals(convert("D"), 500);
	}

	@Test
	public void fourHundredRomanToInteger() {
		Assert.assertEquals(convert("CD"), 400);
	}

	@Test
	public void threeHundredAndNinetyNine() {
		Assert.assertEquals(convert("CCCXCIX"), 399);
	}

	@Test
	public void ninetyRomanToInteger() {
		Assert.assertEquals(convert("XC"), 90);
	}

	@Test
	public void eightyNineRomanToInteger() {
		Assert.assertEquals(convert("LXXXIX"), 89);
	}

	@Test
	public void sixtyRomanToInteger() {
		Assert.assertEquals(convert("LX"), 60);
	}

	@Test
	public void fiftyRomanToInteger() {
		Assert.assertEquals(convert("L"), 50);
	}

	@Test
	public void fortyRomanToInteger() {
		Assert.assertEquals(convert("XL"), 40);
	}

	@Test
	public void fourtyOneRomanToInteger() {
		Assert.assertEquals(convert("XLI"), 41);
	}

	@Test
	public void oneRomanToInteger() {
		Assert.assertEquals(convert("I"), 1);
	}

	@Test
	public void twoRomanToInteger() {
		Assert.assertEquals(convert("II"), 2);
	}

	@Test
	public void fiveRomanToInteger() {
		Assert.assertEquals(convert("V"), 5);
	}

	@Test
	public void fourRomanToInteger() {
		Assert.assertEquals(convert("IV"), 4);
	}

	@Test
	public void sixRomanToInteger() {
		Assert.assertEquals(convert("VI"), 6);
	}

	@Test
	public void nineRomanToInteger() {
		Assert.assertEquals(convert("IX"), 9);
	}

	@Test
	public void tenRomanToInteger() {
		Assert.assertEquals(convert("X"), 10);
	}

	@Test
	public void fourteenRomanToInteger() {
		Assert.assertEquals(convert("XIV"), 14);
	}

	@Test
	public void thirtyNineRomanToInteger() {
		Assert.assertEquals(convert("XXXIX"), 39);
	}

}
