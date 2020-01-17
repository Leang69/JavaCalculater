/**
 * This class is use for handle a Bitwise operator ( and , or , xor , bit wise inversion , left - right shift )
 */
public class BitWise {
    /**
     * @param a
     * @param b
     * @return
     */
    int logicalAND (int a , int b)
    {
        return a & b;
    }
    int logicalOR (int a , int b)
    {
        return a | b;
    }
    int logicalXOR (int a , int b)
    {
        return a ^ b;
    }
    int bitwiseInversion (int a)
    {
        return ~a;
    }
    int leftShift (int a , int b)
    {
        return a << b;
    }
    int rightShift (int a , int b)
    {
        return a >> b;
    }
}
