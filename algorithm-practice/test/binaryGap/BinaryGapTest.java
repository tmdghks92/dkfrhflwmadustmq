package binaryGap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryGapTest {
	BinaryGap binaryGap;

	@Before
	public void setup() {
		binaryGap = new BinaryGap();
	}

	@Test
	public void 영의길이_출력() throws Exception {
		int N = 6291457;
		assertEquals(5, longestZero(N));
	}

	private int longestZero(int n) {
		String binary = Integer.toBinaryString(n);
		int length = calculateBinary(binary);
		return length;
	}

	private int calculateBinary(String binary) {
		// binary = 10000010001
		String[] index = binary.split("1");
		int length = 0;
		for (int i = 0; i < index.length; i++) {
			length = biggerSeeker(length, index[i]);
		}
		return length;
	}

	private int biggerSeeker(int length, String string) {
		if (length >= string.length()) {
			return length;
		}
		return string.length();
	}

}
