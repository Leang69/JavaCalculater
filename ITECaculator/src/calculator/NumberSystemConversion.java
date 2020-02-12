package calculator;

/**
 * This class is ues for convert number system ( 2 , 8  , 10 , 16) and prevent
 */
class NumberSystemConversion {
	/**
	 *  This is instant of class UserInput
	 */
	UserInput InputChecker = new UserInput();
	/**
	 *This method is use for convert binary to decimal
	 * @param binary is long
	 * @return Decimal value
	 */
	String binary2Decimal(long binary) {
		int last_digit;
		int decimal = 0;
		int base = 1;
		while (binary > 0)
		{
			last_digit = (int)(binary % 10);
			binary = binary / 10; 
			decimal += last_digit * base;

			base = base * 2;
		}
		return ""+decimal;
	}

	/**
	 *This method is use for convert binary to Octal
	 * @param binary is long
	 * @return Octal value
	 */
	String binary2Octal(long binary) {
		int decimal = Integer.parseInt(binary2Decimal(binary));
		return decimal2Octal(decimal);
	}

	/**
	 *This method is use for convert binary to Hexadecimal
	 * @param binary is long
	 * @return hexadecimal value
	 */
	String binary2Hex(long binary) {
		int decimal = Integer.parseInt(binary2Decimal(binary));
		return decimal2Hex(decimal);
	}




	/**
	 *This method is use for convert octal to decimal
	 * @param octal is long
	 * @return Decimal value
	 */
		String octal2Decimal(long octal) {
		int last_digit;
		int decimal = 0;
		int base = 1;
		while (octal > 0) {
			last_digit = (int)(octal % 10);
			octal = octal / 10;

			decimal += last_digit * base;

			base = base * 8;
		}
		return ""+decimal;
	}

	/**
	 *This method is use for convert octal to Binary
	 * @param octal is long
	 * @return Binary value
	 */
	String octal2Binary(long octal) {
		long decimal = Long.parseLong(octal2Decimal(octal));
		return decimal2Binary(decimal);

	}

	/**
	 *This method is use for convert octal to Hexadecimal
	 * @param octal is long
	 * @return Hex value
	 */
	String octal2Hex(long octal) {
		long decimal = Long.parseLong(octal2Decimal(octal));
		return decimal2Hex(decimal);

	}

	/**
	 *This method is use for convert decimal to binary
	 * @param decimal is long
	 * @return a binary value
	 */
	String decimal2Binary(long decimal)
	{
		StringBuilder binary = new StringBuilder(); ;
		while (decimal > 0)
		{
			// storing remainder in binary array
			binary.append( decimal % 2 );
			decimal = decimal / 2;
		}
		return binary.reverse().toString();
	}
	/**
	 * This method is use for convert decimal to octal
	 * @param decimal is long
	 * @return octal value
	 */
	String decimal2Octal(long decimal)
	{
		StringBuilder octal = new StringBuilder(); ;
		while (decimal > 0)
		{
			// storing remainder in binary array
			octal.append( decimal % 8 );
			decimal = decimal / 8;
		}
		return octal.reverse().toString();
	}
	/**
	 * This method is use for convert decimal to Hex
	 * @param decimal is long
	 * @return Hex value
	 */
	String decimal2Hex(long decimal)
	{
		StringBuilder hex = new StringBuilder();
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


	/**
	 * This method is use for convert Hex to decimal
	 * @param hex is string
	 * @return decimal value
	 */
	String Hex2decimal (String hex)
	{
		long decimal = 0;
		int power = 1;

		hex = hex.toUpperCase();

		for (int i = 0 ; i < hex.length() ; i++)
		{

			switch (hex.charAt(hex.length()-1-i))
			{
				case '0':
					decimal = decimal + 0;
					break;
				case '1':
					decimal = decimal + power;
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
				case 'A':
					decimal = decimal + 10*power;
					break;
				case 'B':
					decimal = decimal + 11*power;
					break;
				case 'C':
					decimal = decimal + 12*power;
					break;
				case 'D':
					decimal = decimal + 13*power;
					break;
				case 'E':
					decimal = decimal + 14*power;
					break;
				case 'F':
					decimal = decimal + 15*power;
					break;
			}
			power = power * 16;
		}
		return ""+decimal;
	}
	/**
	 * This method is use for convert Hex to binary
	 * @param hex is string
	 * @return binary value
	 */
	String Hex2binary(String hex)
	{
		long decimal = Long.parseLong(Hex2decimal(hex));
		return decimal2Binary(decimal);
	}
	/**
	 * This method is use for convert Hex to octal
	 * @param hex is string
	 * @return octal value
	 */
	String Hex2octal(String hex)
	{
		long decimal = Long.parseLong(Hex2decimal(hex));
		return decimal2Octal(decimal);
	}




	/**
	 * 
	 * @author Leang
	 *This class is use for check user input
	 */
	class UserInput
	{
		/**
		 * This method is check everything that user input Hexadecimal or not
		 * @param hexadecimal is string
		 * @return if user input Hexadecimal return true,else return false
		 */
		boolean isValidHex(String hexadecimal)
		{
			boolean c = true;
			hexadecimal = hexadecimal.toUpperCase();

			for (int i = 0 ; i < hexadecimal.length() ; i++)
			{

				switch (hexadecimal.charAt(hexadecimal.length()-1-i))
				{
					case '0':
					case '1':
					case '2':
					case '3':
					case '4':
					case '5':
					case '6':
					case '7':
					case '8':
					case '9':
					case 'A':
					case 'B':
					case 'C':
					case 'D':
					case 'E':
					case 'F':
						break;
					default:
						c = false;
				}

				if (!c)
				{
					break;
				}

			}
			return c;
		}
		/**
		 * This method is check everything that user input decimal or not
		 * @param decimal is string
		 * @return if user input decimal return true,else return false
		 */
		boolean isValidDecimal(String decimal)
		{
			boolean c = true;
			for (int i = 0 ; i < decimal.length() ; i++)
			{

				if (!Character.isDigit(decimal.charAt(decimal.length()-1-i)))
				{
					c = false;
					break;
				}

			}
			return !c;
		}
		/**
		 * This method is check everything that user input octal or not
		 * @param octal is string
		 * @return if user input octal return true,else return false
		 */
		boolean isValidOctal(String octal)

		{
			boolean c = true;
			for (int i = 0 ; i < octal.length() ; i++)
			{

				switch (octal.charAt(octal.length()-1-i))
				{
					case '0':
					case '1':
					case '2':
					case '3':
					case '4':
					case '5':
					case '6':
					case '7':
						break;
					default:
						c = false;
				}

				if (!c)
				{
					break;
				}

			}
			return !c;
		}
		/**
		 * This method is check everything that user input binary or not
		 * @param binary is string
		 * @return if user input binary return true,else return false
		 */
		boolean isValidBinary(String binary)

		{
			boolean c = true;
			for (int i = 0 ; i < binary.length() ; i++)
			{

				switch (binary.charAt(binary.length()-1-i))
				{
					case '0':
					case '1':
						break;
					default:
						c = false;
				}

				if (!c)
				{
					break;
				}

			}
			return !c;
		}

	}





}
