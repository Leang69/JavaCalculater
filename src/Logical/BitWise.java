package Logical;

/**
 * This class is use for handle a Bitwise operator ( and , or , xor , bit wise inversion , left - right shift )
 */
public class BitWise {
    /**
     * 
     * This method is use for find the Binary AND with between 2 integer.<br>
     * The OR operator compares each binary digit of two integers and gives back 1 if either of them is 1.
     * @param a is int
     * @param b is int
     * @return The value answer as integer 
     */
    int logicalAND (int a , int b)
    {
        return a & b;
    }
    /**
     * This method is use for find the Binary OR with between 2 integer.<br>
     * The AND operator compares each binary digit of two integers and gives back 1 if both are 1, otherwise it returns 0.
     * @param a is int
     * @param b is int
     * @return The value answer as integer 
     */
    int logicalOR (int a , int b)
    {
        return a | b;
    }
    /**
     * This method is use for find the Binary XOR with between 2 integer.<br>
     * The XOR operator compares each binary digit of two integers and gives back 1 if both the compared bits are different. 
     * @param a is int
     * @param b is int
     * @return The value answer as integer 
     */
    int logicalXOR (int a , int b)
    {
        return a ^ b;
    }
    /**
     * This method is use for find the inversion for a integer value.<br>
     * It convert a parameter to 2nd complement.
     * @param a is int
     * @return The value answer as integer 
     */
    int bitwiseInversion (int a)
    {
        return ~a;
    }
    /**
     * This method is use for find a new value of parameter A in binary after left shift b time. <br>
     * @param a 
     * is a value 
     * @param b 
     * is a number of time that you want to shift 
     * @return the new integer value after left shift
     */
    int leftShift (int a , int b)
    {
        return a << b;
    }
    /**
     * This method is use for find a new value of parameter A in binary after right shift b time.
     * @param a is a value 
     * @param b is a number of time that you want to shift 
     * @return  the new integer value after right shift
     */
    int rightShift (int a , int b)
    {
        return a >> b;
    }
}
