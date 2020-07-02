package Logical;

/**
 * This class is use for handle a normal Number Arithmetic
 */
public class Operators {
    double a , b , answer;
    boolean doneInput_a;
    boolean doneInput_b;
    /**
     * Sum method use for sum 2 integer
     * 
     * @param a integer viable
     * @param b integer viable
     * @return integer viable form a + b
     */
    public double sum(double a, double b) {
        return a + b;
    }

    /**
     * divide method use for divide 2 integer
     * 
     * @param a integer viable
     * @param b integer viable
     * @return double value form a / b
     */
    // divide method we can divide 2integer
    public double divide(double a, double b) {
        return (double) a / (double) b;
    }

    /**
     * multiply method use for multiply 2 integer
     * 
     * @param a integer viable
     * @param b integer viable
     * @return integer value form a * b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    // minus method we can minus 2integer
    /**
     * minus method use for minus 2 integer
     * 
     * @param a integer viable
     * @param b integer viable
     * @return integer value a - b
     */
    public double minus(double a, double b) {
        return a - b;
    }

    // modulo method we can find the reminder after divide between 2integer
    /**
     * Sum method use for find the remainder of 2 integer after divide
     * 
     * @param a integer 
     * @param b integer 
     * @return integer value form remainder of a / b
     */
    public double modulo(double a, double b) {
        return a % b;
    }

    /**
     *This method is use for find sin of Radian angle
     * @param radian is float
     * @return the Trigonometry sine of an angle in radian
     */
    public double sinRadian(double radian) {
	return Math.sin(radian);
    }

    /**
     *This method is use for find sin of Degree angle
     * @param degree is int
     * @return the Trigonometry sine of an angle in degree
     */
    public double sinDegree(double degree) {
	return Math.sin(Math.toRadians(degree));

    }

    /**
     *This method is use for find cos of Radian angle
     * @param radian is float
     * @return the Trigonometry cos of an angle in radian
     */
    public double cosRadian(double radian) {
	return Math.cos(radian);
    }

    /**
     *This method is use for find cos of degree angle
     * @param degree int
     * @return the Trigonometry cos of an angle in degree
     */
    public double cosDegree(double degree) {
	return Math.cos(Math.toRadians(degree));

    }

    /**
     *This method is use for find tan of radian angle
     * @param radian is float
     * @return the Trigonometry tan of an angle in radian
     */
    public double tanRadian(double radian) {
	return Math.tan(radian);
    }

    /**
     *This method is use for find tan of degree angle
     * @param degree is degree
     * @return the Trigonometry tan of an angle in degree
     */
    public double tanDegree(double degree) {
	return Math.tan(Math.toRadians(degree));

    }

    /**
     *
     * @param x that x is integer
     * @return x power of 2
     */
    public double root(double base , double a) {
	return (double) Math.pow(base, 1/a);
    }


    /**
     *
     * @param x that x is integer
     * @return x power of 3
     */
    public double square3(double x) {
	return Math.pow(x, 3);
    }


    /**
     *This method is use for convert degree to radian
     * @param degree is angle is degree
     * @return the angle in radian
     */
    public double degree2Radian(double degree) {
	return Math.toRadians(degree);
    }
    
    public double pow(double base , double exp) {
	return Math.pow(base, exp);
    }

}
