/**
 * This class is use for handle a normal Number Arithmetic
 */
class Operators {
    /**
     * Sum method use for sum 2 integer
     * 
     * @param a integer viable
     * @param b integer viable
     * @return integer viable form a + b
     */
    int sum(int a, int b) {
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
    double divide(int a, int b) {
        return (double) a / (double) b;
    }

    /**
     * multiply method use for multiply 2 integer
     * 
     * @param a integer viable
     * @param b integer viable
     * @return integer value form a * b
     */
    int multiply(int a, int b) {
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
    int minus(int a, int b) {
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
    int modulo(int a, int b) {
        return a % b;
    }

    /**
     *This method is use for find sin of Radian angle
     * @param radian is float
     * @return the Trigonometry sine of an angle in radian
     */
    float sinRadian(float radian) {
	return (float) Math.sin(radian);
    }

    /**
     *This method is use for find sin of Degree angle
     * @param degree is int
     * @return the Trigonometry sine of an angle in degree
     */
    float sinDegree(int degree) {
	return (float) Math.sin(Math.toRadians(degree));

    }

    /**
     *This method is use for find cos of Radian angle
     * @param radian is float
     * @return the Trigonometry cos of an angle in radian
     */
    float cosRadian(float radian) {
	return (float) Math.cos(radian);
    }

    /**
     *This method is use for find cos of degree angle
     * @param degree int
     * @return the Trigonometry cos of an angle in degree
     */
    float cosDegree(int degree) {
	return (float) Math.cos(Math.toRadians(degree));

    }

    /**
     *This method is use for find tan of radian angle
     * @param radian is float
     * @return the Trigonometry tan of an angle in radian
     */
    float tanRadian(float radian) {
	return (float) Math.tan(radian);
    }

    /**
     *This method is use for find tan of degree angle
     * @param degree is degree
     * @return the Trigonometry tan of an angle in degree
     */
    float tanDegree(int degree) {
	return (float) Math.tan(Math.toRadians(degree));

    }

    /**
     *
     * @param x that x is integer
     * @return x power of 2
     */
    long square2(long x) {
	return (long) Math.pow(x, 2);
    }

    /**
     *
     * @param x that x is floating number
     * @return x power of 2
     */
    double square2(double x) {
	return Math.pow(x, 2);
    }

    /**
     *
     * @param x that x is integer
     * @return x power of 3
     */
    long square3(long x) {
	return (long) Math.pow(x, 3);
    }

    /**
     *
     * @param x that x is floating number
     * @return x power of 3
     */
    double square3(double x) {
	return Math.pow(x, 3);
    }

    /**
     *This method is use for convert degree to radian
     * @param degree is angle is degree
     * @return the angle in radian
     */
    double degree2Radian(double degree) {
	return Math.toRadians(degree);
    }

}
