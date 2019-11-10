
class NumberSystemConversion {

	/**
	 *
	 * @param binary
	 * @return Decimal value
	 */
	String binary2Decimal(long binary) {
		String binaryString = "" + binary;
		String decimal ;
		decimal = "" + Integer.parseInt(binaryString, 2);
		return decimal;
	}

	/**
	 *
	 * @param binary
	 * @return Octal value
	 */
	String binary2Octal(long binary) {
		int decimal = Integer.parseInt(binary2Decimal(binary));
		String octal = "" + Integer.toOctalString(decimal);
		return octal;

	}

	/**
	 *
	 * @param binary
	 * @return hexadecimal
	 */
	String binary2Hex(long binary) {
		int decimal = Integer.parseInt(binary2Decimal(binary));
		String hex = "" + Integer.toHexString(decimal);
		return hex.toUpperCase();
	}

	/**
	 * using for check Binary
	 * @param a
	 * @return true of false
	 */
	Boolean verifyBinary(long a)
	{
		try {
			Integer.parseInt(""+a, 2);
		}catch (Exception e){
			System.out.println("This is not Binary");
			return false;
		}
		return true;
	}

	/**
	 *
	 * @param octal
	 * @return Decimal
	 */
	String octal2Decimal(long octal) {
		String octalString = ""+octal;
		String decimal = "" + Integer.parseInt(octalString, 8);
		return decimal;
	}

	/**
	 *
	 * @param octal
	 * @return Binary
	 */
	String octal2Binary(long octal) {
		int decimal = Integer.parseInt(""+octal,8);
		String binary = "" + Integer.toBinaryString(decimal);
		return binary;

	}

	/**
	 *
	 * @param octal
	 * @return Hex
	 */
	String octal2Hex(long octal) {
		int decimal = Integer.parseInt(""+octal,8);
		String Hex = "" + Integer.toHexString(decimal);
		return Hex.toUpperCase();

	}

	/**
	 * using for checking octal
	 * @param a
	 * @return true or false
	 */
	Boolean verifyOctal(long a)
	{
		try {
			Integer.parseInt(""+a, 8);
		}catch (Exception e){
			System.out.println("This is not Octal");
			return false;
		}
		return true;
	}

	String decimal2Binary(int decimal)
	{
		StringBuffer binary = new StringBuffer(); ;
		while (decimal > 0)
		{
			// storing remainder in binary array
			binary.append( decimal % 2 );
			decimal = decimal / 2;
		}
		return binary.reverse().toString();
	}

	String decimal2Octal(int decimal)
	{
		StringBuffer octal = new StringBuffer(); ;
		while (decimal > 0)
		{
			// storing remainder in binary array
			octal.append( decimal % 8 );
			decimal = decimal / 8;
		}
		return octal.reverse().toString();
	}

	String decimal2Hex(int decimal)
	{
		StringBuffer hex = new StringBuffer();
		int preInput;
		while (decimal > 0)
		{
			// storing remainder in binary array
			preInput = decimal % 16;
			switch (preInput)
			{
				case 10:
					hex.append("A");
					break;
				case 11:
					hex.append("B");
					break;
				case 12:
					hex.append("C");
					break;
				case 13:
					hex.append("D");
					break;
				case 14:
					hex.append("E");
					break;
				case 15:
					hex.append("F");
					break;
				default:
					hex.append(preInput);

			}
			decimal = decimal / 16;
		}
		return hex.reverse().toString();
	}

	Boolean verifyDecimal(int a)
	{
		try {
			Integer.parseInt(""+a);
		}catch (Exception e){
			System.out.println("This is not decimal");
			return false;
		}
		return true;
	}

}
