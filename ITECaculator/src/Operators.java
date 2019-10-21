class Operators {
    // sum method we can sum 2integer

    /**
     * Sum method use for sum 2 integer
     * 
     * @param a integer viable
     * @param b integer viable
     * @return integer viable
     */
    int sum(int a, int b) {
	int c = a + b;
	return c;
    }

    /**
     * Sum method use for divide 2 integer
     * 
     * @param a integer viable
     * @param b integer viable
     * @return double value
     */
    // divide method we can divide 2integer
    double divide(int a, int b) {
	double c = (double) a / (double) b;
	return c;
    }

    /**
     * Sum method use for multiply 2 integer
     * 
     * @param a integer viable
     * @param b integer viable
     * @return integer value
     */
    int multiply(int a, int b) {
	int c = a * b;
	return c;
    }

    // minus method we can minus 2integer
    /**
     * Sum method use for minus 2 integer
     * 
     * @param a integer viable
     * @param b integer viable
     * @return integer value
     */
    int minus(int a, int b) {
	int c = a - b;
	return c;
    }

    // modulo method we can find the reminder after divide between 2integer
    /**
     * Sum method use for modulo 2 integer
     * 
     * @param a integer viable
     * @param b integer viable
     * @return integer value
     */
    int modulo(int a, int b) {
	int c = a % b;
	return c;
    }

    /**
     *
     * @param radian
     * @return the Trigonometry sine of an angle in radian
     */
    float sin(float radian) {
	return (float) Math.sin(radian);
    }

    /**
     *
     * @param degree
     * @return the Trigonometry sine of an angle in degree
     */
    float sind(int degree) {
	return (float) Math.sin(Math.toRadians(degree));

    }

    /**
     *
     * @param radian
     * @return the Trigonometry cos of an angle in radian
     */
    float cos(float radian) {
	return (float) Math.cos(radian);
    }

    /**
     *
     * @param degree
     * @return the Trigonometry cos of an angle in degree
     */
    float cosd(int degree) {
	return (float) Math.cos(Math.toRadians(degree));

    }

    /**
     *
     * @param radian
     * @return the Trigonometry tan of an angle in radian
     */
    float tan(float radian) {
	return (float) Math.tan(radian);
    }

    /**
     *
     * @param degree
     * @return the Trigonometry tan of an angle in degree
     */
    float tand(int degree) {
	return (float) Math.tan(Math.toRadians(degree));

    }

    /**
     *
     * @param x
     * @return x power of 2
     */
    long square2(long x) {
	return (long) Math.pow(x, 2);
    }

    /**
     *
     * @param x
     * @return x power of 2
     */
    double square2(double x) {
	return Math.pow(x, 2);
    }

    /**
     *
     * @param x
     * @return x power of 3
     */
    long square3(long x) {
	return (long) Math.pow(x, 3);
    }

    /**
     *
     * @param x
     * @return x power of 3
     */
    double square3(double x) {
	return Math.pow(x, 3);
    }

    /**
     *
     * @param a
     * @return the angle in radian
     */
    double degree2Radian(double a) {
	return Math.toRadians(a);
    }

}
