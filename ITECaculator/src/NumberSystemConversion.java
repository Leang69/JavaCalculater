
class NumberSystemConversion {

	String binary2Decimal(long binary) {
		String binaryString = "" + binary;
		String decimal ;
		decimal = "" + Integer.parseInt(binaryString, 2);
		return decimal;
	}

	String binary2Octal(long binary) {
		int decimal = Integer.parseInt(binary2Decimal(binary));
		String octal = "" + Integer.toOctalString(decimal);
		return octal;

	}

	String binary2HexString(long binary) {
		int decimal = Integer.parseInt(binary2Decimal(binary));
		String hex = "" + Integer.toHexString(decimal);
		return hex;
	}
	
	String octal2Decimal(long octal) {
		String octalString = ""+octal;
		String decimal = "" + Integer.parseInt(octalString, 8);
		return decimal;
	}
	
	String octal2Binary(long octal) {
		int decimal = Integer.parseInt(binary2Decimal(octal));
		String binary = "" + Integer.toBinaryString(decimal);
		return binary;

	}
	String octal2Hex(long octal) {
		int decimal = Integer.parseInt(binary2Decimal(octal));
		String binary = "" + Integer.toHexString(decimal);
		return binary;

	}

}
