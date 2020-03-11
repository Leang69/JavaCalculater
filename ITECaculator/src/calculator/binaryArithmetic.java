package calculator;

import jdk.nashorn.api.scripting.ScriptObjectMirror;
/**
 * This Class is use for do binary arithmetic ( sum , subtraction , multiply , divide , 1st and 2nh complement )
 * @author Leang
 *
 */
public class binaryArithmetic {
	/**
	 * This instant of Complement inner class
	 */
	//dftvygbhnjmk,l
    Complement complement = new Complement();
    /**
     * This method is use for fine a answer for sum between 2 binary number.
     * @param binaryA is string
     * @param binaryB is string
     * @return A answer of binaryA + binaryB
     */
    //Hello
    String binaryAdd(String binaryA,String binaryB)
    {
        StringBuilder answer = new StringBuilder();
        char carry = '0';
        if (binaryA.length() > binaryB.length())
        {
            StringBuilder builder = new StringBuilder(binaryB);
            // builder.append();
            for (int i = binaryB.length() ; i  < binaryA.length() ; i++)
            {
                //builder.append(0);
                builder.insert(0,0);
            }

            binaryB = builder.toString();

        }
        else if (binaryA.length() < binaryB.length())
        {
            StringBuilder builder = new StringBuilder(binaryA);
            // builder.append();
            for (int i = binaryA.length() ; i  < binaryB.length() ; i++)
            {
                builder.insert(0,0);
            }
            binaryA = builder.toString();
        }

        for (int i = binaryA.length() - 1  ; i >= 0 ; i--)
        {

            //if ((Character.compare(binaryA.charAt(i),'0')) && (Character.compare(binaryB.charAt(i),'0')))
            if ((binaryA.charAt(i) == '0') && (binaryB.charAt(i) == '0'))
            {
                if (carry == '0')
                {
                    answer.append(0);
                    carry = '0';
                }
                else {
                    answer.append(1);
                    carry = '0';
                }

            }
            else if (((binaryA.charAt(i) == '0') && (binaryB.charAt(i) == '1')) || ((binaryA.charAt(i) == '1') && (binaryB.charAt(i) == '0')))
            {
                if (carry == '0')
                {
                    answer.append(1);
                    carry = '0';
                }
                else {
                    answer.append(0);
                    carry = '1';
                }
            }
            else if (((binaryA.charAt(i) == '1') && (binaryB.charAt(i) == '1')) )
            {
                if (carry == '0')
                {
                    answer.append(0);
                }
                else {
                    answer.append(1);
                }
                carry = '1';
            }
        }
        //System.out.println(carry);
        StringBuilder builder = new StringBuilder(answer.toString());
        if (carry == '1') {
            builder.append(carry);
        }
        return builder.reverse().toString();
    }
    /**
     * This method is use for fine a answer for Subtraction between 2 binary number.
     * @param binaryA is binary number
     * @param binaryB is binary number
     * @return answer binaryA - binaryB
     */
    String binarySubtraction(String binaryA,String binaryB)
    {
        if (binaryA.length() > binaryB.length())
        {
            StringBuilder builder = new StringBuilder(binaryB);
            //builder.append();
            for (int i = binaryB.length() ; i  < binaryA.length() ; i++)
            {
                //builder.append(0);
                builder.insert(0,0);
            }

            binaryB = builder.toString();

        }
        else if (binaryA.length() < binaryB.length())
        {
            StringBuilder builder = new StringBuilder(binaryA);
            // builder.append();
            for (int i = binaryA.length() ; i  < binaryB.length() ; i++)
            {
                builder.insert(0,0);
            }
            binaryA = builder.toString();
        }
        binaryB = complement.firstComplement(binaryB);
        //System.out.println(binaryB);
        String answer = binaryAdd(binaryA,binaryB);
        //System.out.println(answer);
        if (answer.length() == binaryA.length() + 1 || answer.length() == binaryB.length() + 1)
        {

            if (answer.charAt(0) == '1' )
            {
                //System.out.println("con 1");
                StringBuilder builder = new StringBuilder();
                builder.append(answer);
                builder.deleteCharAt(0);
                answer = builder.toString();
                answer = binaryAdd(answer,"1");

            }

        }
        else if ((answer.length() == binaryA.length() || answer.length() == binaryB.length()))
        {
            //System.out.println("con 2");
            answer = complement.firstComplement(answer);
            StringBuilder builder = new StringBuilder();
            builder.append(answer);
            builder.insert(0,"- ");
            answer = builder.toString();
        }
        return answer;
    }

    	/**
    	 * This is a inner class of calculator.binaryArithmetic class.<br>
    	 * It use for find a 1st and 2nd complement
    	 * @author Leang
    	 *
    	 */
        class Complement
        {
        	/**
        	 * This method is use for find a 1st complement of parameter a
        	 * @param binaryA is binary number
        	 * @return A binary a in 1st complement form.
        	 */
            String firstComplement(String binaryA)

            {
                StringBuilder answer = new StringBuilder();
                for(int i = 0 ; i < binaryA.length() ; i++)
                {
                    if(binaryA.charAt(i) == '0')
                    {
                        answer.append(1);
                    }
                    else if(binaryA.charAt(i) == '1')
                    {
                        answer.append(0);
                    }
                }
                return answer.toString();
            }
            /**
             * This method is use for find a 2nd complement of parameter a
             * @param binaryA is binary number
             * @return A binary a in 2nd complement form.
             */
            String secondComplement(String binaryA)
            {
                String answer;
                answer = firstComplement(binaryA);
                return  binaryAdd(answer,"1");
            }
            /**
             * This method is use for find a answer of subtract between 2 binary number that implement by 2nd complement.
             * @param binaryA is binary number
             * @param binaryB is binary number
             * @return A answer of binaryA - bunaryB
             */
            String subtractWith2ndComplement(String binaryA, String binaryB)
            {
                if (binaryA.length() > binaryB.length())
                {
                    StringBuilder builder = new StringBuilder(binaryB);
                    //builder.append();
                    for (int i = binaryB.length() ; i  < binaryA.length() ; i++)
                    {
                        //builder.append(0);
                        builder.insert(0,0);
                    }

                    binaryB = builder.toString();

                }
                else if (binaryA.length() < binaryB.length())
                {
                    StringBuilder builder = new StringBuilder(binaryA);
                    // builder.append();
                    for (int i = binaryA.length() ; i  < binaryB.length() ; i++)
                    {
                        builder.insert(0,0);
                    }
                    binaryA = builder.toString();
                }
                binaryB = secondComplement(binaryB);
                //System.out.println(binaryB);
                String answer = binaryAdd(binaryA,binaryB);
                //System.out.println(answer);
                if (answer.length() == binaryA.length() + 1 || answer.length() == binaryB.length() + 1)
                {

                    if (answer.charAt(0) == '1' )
                    {
                        StringBuilder builder = new StringBuilder();
                        builder.append(answer);
                        builder.deleteCharAt(0);
                        answer = builder.toString();

                    }

                }
                else if ((answer.length() == binaryA.length() || answer.length() == binaryB.length()))
                {
                    answer = secondComplement(answer);
                    StringBuilder builder = new StringBuilder();
                    builder.append(answer);
                    builder.insert(0,"- ");
                    answer = builder.toString();
                }
                return answer;

            }
        }



    /**
     * This method is use for find a answer of multiply between 2 binary number
     * @param binaryA is binary number
     * @param binaryB is binary number
     * @return answer of  binaryA * binaryB
     */
    String multiply(String binaryA, String binaryB)
    {
        String answer = "";
        StringBuilder builder = new StringBuilder(binaryB);
        binaryB = builder.reverse().toString();
        builder.setLength(0);
        builder.append(binaryA);
        for (int i = 0 ; i < binaryB.length() ; i++)
        {

            if (binaryB.charAt(i) == '1')
            {
                answer = binaryAdd(answer,builder.toString());
            }
            builder.append(0);
        }
        return answer;
    }
    /**
     * This method is use for find a answer of divide between 2 binary number
     * @param binaryA is binary number
     * @param binaryB is binary number
     * @return answer of  binaryA / binaryB
     */
    String divide(String binaryA, String binaryB)
    {
    	
        StringBuilder answer = new StringBuilder();
        StringBuilder remain = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        long valA,valB;
        valB = Long.parseLong(binaryB);
        remain.append(binaryA.charAt(0));
        for (int i = 0 ; i < binaryA.length() ; i++)
        {
            valA = Long.parseLong(remain.toString());
            if (valA < valB)
            {
                if (answer.length() != 0)
                {
                    answer.append(0);
                }
            }
            else
            {
                tmp.append(remain);
                remain.setLength(0);
                remain.append(complement.subtractWith2ndComplement(tmp.toString(),binaryB));
                answer.append(1);
                tmp.setLength(0);
            }
            if (i != binaryA.length()-1)
            {
                remain.append(binaryA.charAt(i+1));
            }
        }
        valA = Long.parseLong(remain.toString());
        if(valA == 0)
        {
        	return "0";
        }
        if (remain.charAt(0) == '0' )
        {
            remain.delete(0,remain.indexOf("1",0));
        }
        System.out.println("Remainder : " +remain);
        return answer.toString();
    }



}
