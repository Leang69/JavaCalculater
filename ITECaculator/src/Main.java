
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Leang
 *
 */
public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	/**
	 * Create object form scanner class
	 */

	/**
	 * Create object form DecimalFormat for format string
	 */

	int Menu;
	while (true) {
	    System.out.println("Menu");
	    System.out.println("1  : Arithmetic Operators");
	    System.out.println("2  : Trigonometric Operators");
	    System.out.println("3  : Bitwise Operators");
	    System.out.println("4  : Storage Converter");
	    System.out.print("Please input menu : ");

	    Menu = input.nextInt();
	    switch (Menu) {
	    case 1:
		ArithmeticOperators();
		break;
	    case 2:
		TrigonometricOperators();
		break;
	    case 3:
		BitWise();
		break;
	    case 4:
		StorageConverter();
		break;
	    default:
	    }

	}

    }

    static void TrigonometricOperators() {
	int menu;
	float radian;
	int degree;
	double d_degree;
	System.out.println("1 : Sin in radian");
	System.out.println("2 : Sin in degree");
	System.out.println("3 : Cos in radian");
	System.out.println("4 : Cos in degree");
	System.out.println("5 : Tan in radian");
	System.out.println("6 : Tan in degree");
	System.out.println("7 : Covert Degree to Radian");
	System.out.println("0 : Back to main menu");
	Operators operators = new Operators();
	while (true) {
	    System.out.println("-----------------------");
	    System.out.print("Input menu : ");
	    menu = input.nextInt();
	    System.out.println("-----------------------");

	    switch (menu) {
	    case 1:
		System.out.print("Input angle in radian : ");
		radian = input.nextFloat();
		System.out.print("Sin of " + radian + " in radian = ");
		System.out.printf("%.2f\n", operators.sin(radian));
		break;
	    case 2:
		System.out.print("Input angle in degree : ");
		degree = input.nextInt();
		System.out.println("Sin of " + degree + " in degree = ");
		System.out.printf("%.2f\n", operators.sind(degree));
		break;
	    case 3:
		System.out.print("Input angle in radian : ");
		radian = input.nextFloat();
		System.out.println("Cos of " + radian + " in radian = ");
		System.out.printf("%.2f/n", operators.cos(radian));
		break;
	    case 4:
		System.out.print("Input angle in degree : ");
		degree = input.nextInt();
		System.out.println("Cos of " + degree + " in degree = ");
		System.out.printf("%.2f/n", operators.cosd(degree));
		break;
	    case 5:
		System.out.print("Input angle in radian : ");
		radian = input.nextFloat();
		System.out.println("Tan of " + radian + " in radian = ");
		System.out.printf("%.2f/n", operators.tan(radian));
		break;
	    case 6:
		System.out.print("Input angle in degree : ");
		degree = input.nextInt();
		System.out.println("Tan of " + degree + " in degree = ");
		System.out.printf("%.2f/n", operators.tand(degree));
		break;
	    case 7:
		d_degree = input.nextDouble();
		System.out.println("Degree " + d_degree + " = ");
		System.out.printf("%.2f/n", operators.degree2Radian(d_degree));
		break;
	    case 0:
		break;
	    default:
		System.out.print("Please input again : ");
	    }
	    if (menu == 0) {
		break;
	    }
	}

    }

    static void ArithmeticOperators() {
	int menu;
	int a, b;
	System.out.println("1 : Sum");
	System.out.println("2 : Minus");
	System.out.println("3 : Multiply");
	System.out.println("4 : Divide");
	System.out.println("5 : Modulo");
	System.out.println("0 : Back to main menu");
	Operators operators = new Operators();
	while (true) {
	    System.out.println("-----------------------");
	    System.out.print("Input menu : ");
	    menu = input.nextInt();
	    System.out.println("-----------------------");

	    switch (menu) {
	    case 1:
		System.out.print("Input A :");
		a = input.nextInt();
		System.out.print("Input B :");
		b = input.nextInt();
		System.out.println("a + b = " + operators.sum(a, b));
		break;
	    case 2:
		System.out.print("Input A :");
		a = input.nextInt();
		System.out.print("Input B :");
		b = input.nextInt();
		System.out.println("a - b = " + operators.minus(a, b));
		break;
	    case 3:
		System.out.print("Input A :");
		a = input.nextInt();
		System.out.print("Input B :");
		b = input.nextInt();
		System.out.println("a * b = " + operators.multiply(a, b));
		break;
	    case 4:
		System.out.print("Input A :");
		a = input.nextInt();
		System.out.print("Input B :");
		b = input.nextInt();
		System.out.println("a / b = " + operators.divide(a, b));
		break;
	    case 5:
		System.out.print("Input A :");
		a = input.nextInt();
		System.out.print("Input B :");
		b = input.nextInt();
		System.out.println("a % b = " + operators.modulo(a, b));
		break;
	    case 0:
		break;
	    default:
		System.out.print("Please input again : ");
	    }
	    if (menu == 0) {
		break;
	    }
	}
    }

    static void BitWise() {
	int menu;
	int a, b;
	System.out.println("1 : AND logical");
	System.out.println("2 : OR logical");
	System.out.println("3 : XOR logical");
	System.out.println("4 : Bitwise Inversion");
	System.out.println("5 : Left Shift");
	System.out.println("6 : Right Shift");
	System.out.println("0 : Back to main menu");
	BitWise bitwise = new BitWise();
	while (true) {
	    System.out.println("-----------------------");
	    System.out.print("Input menu : ");
	    menu = input.nextInt();
	    System.out.println("-----------------------");

	    switch (menu) {
	    case 1:
		System.out.print("Input A :");
		a = input.nextInt();
		System.out.print("Input B :");
		b = input.nextInt();
		System.out.println("a & b = " + bitwise.logicalAND(a, b));
		break;
	    case 2:
		System.out.print("Input A :");
		a = input.nextInt();
		System.out.print("Input B :");
		b = input.nextInt();
		System.out.println("a | b = " + bitwise.logicalOR(a, b));
		break;
	    case 3:
		System.out.print("Input A :");
		a = input.nextInt();
		System.out.print("Input B :");
		b = input.nextInt();
		System.out.println("a ^ b = " + bitwise.logicalXOR(a, b));
		break;
	    case 4:
		System.out.print("Input A :");
		a = input.nextInt();
		System.out.println("~a" + bitwise.bitwiseInversion(a));
		break;
	    case 5:
		System.out.print("Input A :");
		a = input.nextInt();
		System.out.print("Input B :");
		b = input.nextInt();
		System.out.println("a << b = " + bitwise.leftShift(a, b));
		break;
	    case 6:
		System.out.print("Input A :");
		a = input.nextInt();
		System.out.print("Input B :");
		b = input.nextInt();
		System.out.println("a >> b = " + bitwise.rightShift(a, b));
		break;
	    case 0:
		break;
	    default:
		System.out.print("Please input again : ");
	    }
	    if (menu == 0) {
		break;
	    }
	}
    }

    static void StorageConverter() {
	int Menu, subMenu;
	long l;
	while (true) {
	    System.out.println("1 : Byte");
	    System.out.println("2 : Kilobyte");
	    System.out.println("3 : Megabyte");
	    System.out.println("4 : Gigabyte");
	    System.out.println("5 : Terabyte");
	    System.out.println("6 : Petabyte");
	    System.out.println("0 : Back to main menu");
	    StorageConverter storage_converter = new StorageConverter();

	    System.out.println("-----------------------");
	    System.out.print("Input menu : ");
	    Menu = input.nextInt();
	    System.out.println("-----------------------");

	    switch (Menu) {
	    case 1:

		System.out.println("1 : Byte to Kilobyte");
		System.out.println("2 : Byte to Megabyte");
		System.out.println("3 : Byte to Gigabyte");
		System.out.println("4 : Byte to Terabyte");
		System.out.println("5 : Byte to Petabyte");
		System.out.println("0 : Back to Storage Category");
		while (true) {
		    System.out.println("-----------------------");
		    System.out.print("Input menu : ");
		    subMenu = input.nextInt();
		    System.out.println("-----------------------");
		    switch (subMenu) {
		    case 1:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Byte = " + storage_converter.byte2KB(l) + " KB");
			break;
		    case 2:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Byte = " + storage_converter.byte2MB(l) + " MB");
			break;
		    case 3:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Byte = " + storage_converter.byte2GB(l) + " GB");
			break;
		    case 4:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Byte = " + storage_converter.byte2TB(l) + " TB");
			break;
		    case 5:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Byte = " + storage_converter.byte2PB(l) + " PB");
			break;
		    case 0:
			break;
		    default:
			System.out.print("Please input again : ");
		    }
		    if (subMenu == 0) {
			break;
		    }
		}

		break;

	    case 2:

		System.out.println("1 : Kilobyte to Byte");
		System.out.println("2 : Kilobyte to Megabyte");
		System.out.println("3 : Kilobyte to Gigabyte");
		System.out.println("4 : Kilobyte to Terabyte");
		System.out.println("5 : Kilobyte to Petabyte");
		System.out.println("0 : Back to Storage Category");
		while (true) {
		    System.out.println("-----------------------");
		    System.out.print("Input menu : ");
		    subMenu = input.nextInt();
		    System.out.println("-----------------------");
		    switch (subMenu) {
		    case 1:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.kb2Byte(l) + " Byte");
			break;
		    case 2:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.kb2MB(l) + " MB");
			break;
		    case 3:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.kb2GB(l) + " GB");
			break;
		    case 4:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.kb2TB(l) + " TB");
			break;
		    case 5:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.kb2PB(l) + " PB");
			break;
		    case 0:
			break;
		    default:
			System.out.print("Please input again : ");
		    }
		    if (subMenu == 0) {
			break;
		    }
		}

		break;

	    case 3:

		System.out.println("1 : Megabyte to Byte");
		System.out.println("2 : Megabyte to Kilobyte");
		System.out.println("3 : Megabyte to Gigabyte");
		System.out.println("4 : Megabyte to Terabyte");
		System.out.println("5 : Megabyte to Petabyte");
		System.out.println("0 : Back to Storage Category");
		while (true) {
		    System.out.println("-----------------------");
		    System.out.print("Input menu : ");
		    subMenu = input.nextInt();
		    System.out.println("-----------------------");
		    switch (subMenu) {
		    case 1:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.mb2Byte(l) + " KB");
			break;
		    case 2:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.mb2KB(l) + " KB");
			break;
		    case 3:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.mb2GB(l) + " GB");
			break;
		    case 4:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.mb2TB(l) + " TB");
			break;
		    case 5:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.mb2PB(l) + " PB");
			break;
		    case 0:
			break;
		    default:
			System.out.print("Please input again : ");
		    }
		    if (subMenu == 0) {
			break;
		    }
		}

		break;

	    case 4:

		System.out.println("1 : Gigabyte to Byte");
		System.out.println("2 : Gigabyte to Kilobyte");
		System.out.println("3 : Gigabyte to Megabyte");
		System.out.println("4 : Gigabyte to Terabyte");
		System.out.println("5 : Gigabyte to Petabyte");
		System.out.println("0 : Back to Storage Category");
		while (true) {
		    System.out.println("-----------------------");
		    System.out.print("Input menu : ");
		    subMenu = input.nextInt();
		    System.out.println("-----------------------");
		    switch (subMenu) {
		    case 1:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.gb2Byte(l) + " Byte");
			break;
		    case 2:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.gb2KB(l) + " KB");
			break;
		    case 3:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.gb2MB(l) + " MB");
			break;
		    case 4:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.gb2TB(l) + " TB");
			break;
		    case 5:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.gb2PB(l)+ " PB");
			break;
		    case 0:
			break;
		    default:
			System.out.print("Please input again : ");
		    }
		    if (subMenu == 0) {
			break;
		    }
		}

		break;
	    case 5:
		
		System.out.println("1 : Terabyte to Byte");
		System.out.println("2 : Terabyte to Kilobyte");
		System.out.println("3 : Terabyte to Megabyte");
		System.out.println("4 : Terabyte to Gigabyte");
		System.out.println("5 : Terabyte to Petabyte");
		System.out.println("0 : Back to Storage Category");
		while (true) {
		    System.out.println("-----------------------");
		    System.out.print("Input menu : ");
		    subMenu = input.nextInt();
		    System.out.println("-----------------------");
		    switch (subMenu) {
		    case 1:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.tb2Byte(l) + " Byte");
			break;
		    case 2:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.tb2KB(l) + " KB");
			break;
		    case 3:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.tb2MB(l) + " MB");
			break;
		    case 4:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.tb2GB(l) + " GB");
			break;
		    case 5:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.tb2PB(l)+ " PB");
			break;
		    case 0:
			break;
		    default:
			System.out.print("Please input again : ");
		    }
		    if (subMenu == 0) {
			break;
		    }
		}
		
		break;
	    case 6:
		
		System.out.println("1 : Petabyte to Byte");
		System.out.println("2 : Petabyte to Kilobyte");
		System.out.println("3 : Petabyte to Megabyte");
		System.out.println("4 : Petabyte to Gigabyte");
		System.out.println("5 : Petabyte to Terabyte");
		System.out.println("0 : Back to Storage Category");
		while (true) {
		    System.out.println("-----------------------");
		    System.out.print("Input menu : ");
		    subMenu = input.nextInt();
		    System.out.println("-----------------------");
		    switch (subMenu) {
		    case 1:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.pb2Byte(l) + " B");
			break;
		    case 2:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.pb2KB(l) + " KB");
			break;
		    case 3:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.pb2MB(l) + " MB");
			break;
		    case 4:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.pb2GB(l) + " GB");
			break;
		    case 5:
			System.out.print("Input Storage :");
			l = input.nextLong();
			System.out.println(l + " Kilobyte = " + storage_converter.pb2TB(l)+ " TB");
			break;
		    case 0:
			break;
		    default:
			System.out.print("Please input again : ");
		    }
		    if (subMenu == 0) {
			break;
		    }
		}
		
		break;
	    case 0:
		break;
	    default:
		System.out.print("Please input again : ");
	    }
	    if (Menu == 0) {
		break;
	    }
	}
    }
}
