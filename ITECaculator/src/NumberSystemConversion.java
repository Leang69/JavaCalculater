
class NumberSystemConversion {

	/**
	 *
	 * @param binary
	 * @return Decimal value
	 */
	String binary2Decimal(long binary) {
		long last_digit;
		int decimal = 0;
		int base = 1;
		while (binary > 0) {
			last_digit = binary % 10;
			binary = binary / 10;

			decimal += last_digit * base;

			base = base * 2;
		}
		return ""+decimal;
	}

	/**
	 *
	 * @param binary
	 * @return Octal value
	 */
	String binary2Octal(long binary) {
		int decimal = Integer.parseInt(binary2Decimal(binary));
		String octal = decimal2Octal(decimal);
		return octal;
	}

	/**
	 *
	 * @param binary
	 * @return hexadecimal
	 */
	String binary2Hex(long binary) {
		int decimal = Integer.parseInt(binary2Decimal(binary));
		String Hex = decimal2Hex(decimal);
		return Hex;
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
		int last_digit;
		int decimal = 0;
		int base = 1;
		while (octal > 0) {
			last_digit = (int) (octal % 10);
			octal = octal / 10;

			decimal += last_digit * base;

			base = base * 8;
		}
		return ""+decimal;
	}

	/**
	 *
	 * @param octal
	 * @return Binary
	 */
	String octal2Binary(long octal) {
		long decimal = Long.parseLong(octal2Decimal(octal));
		System.out.println(decimal);
		String binary = decimal2Binary(decimal);
		return binary;

	}

	/**
	 *
	 * @param octal
	 * @return Hex
	 */
	String octal2Hex(long octal) {
		long decimal = Long.parseLong(octal2Decimal(octal));
		String hex = decimal2Hex(decimal);
		return hex;

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

	String decimal2Binary(long decimal)
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

	String decimal2Octal(long decimal)
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

	String decimal2Hex(long decimal)
	{
		StringBuffer hex = new StringBuffer();
		int preInput = 0;
		while (decimal > 0)
		{
			// storing remainder in binary array
			preInput = (int)(decimal % 16);
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

	Boolean verifyDecimal(long a)
	{
		try {
			Integer.parseInt(""+a);
		}catch (Exception e){
			System.out.println("This is not decimal");
			return false;
		}
		return true;
	}

	String Hex2decimal (String hex)
	{
		long decimal = 0;
		int power = 1;

		for (int i = 0 ; i < hex.length() ; i++)
		{

			switch (hex.charAt(i))
			{
				case '0':
					decimal = decimal + 0*power;
					break;
				case '1':
					decimal = decimal + 1*power;
					break;
				case '2':
					decimal = decimal + 2*power;
					break;
				case '3':
					decimal = decimal + 3*power;
					break;
				case '4':
					decimal = decimal + 4*power;
					break;
				case '5':
					decimal = decimal + 5*power;
					break;
				case '6':
					decimal = decimal + 6*power;
					break;
				case '7':
					decimal = decimal + 7*power;
					break;
				case '8':
					decimal = decimal + 8*power;
					break;
				case '9':
					decimal = decimal + 9*power;
					break;
				case 'a':
				case 'A':
					decimal = decimal + 10*power;
					break;
				case 'b':
				case 'B':
					decimal = decimal + 11*power;
					break;
				case 'c':
				case 'C':
					decimal = decimal + 12*power;
					break;
				case 'd':
				case 'D':
					decimal = decimal + 13*power;
					break;
				case 'e':
				case 'E':
					decimal = decimal + 14*power;
					break;
				case 'f':
				case 'F':
					decimal = decimal + 15*power;
					break;
			}
			power = power * 16;
		}
		return ""+decimal;
	}

}
