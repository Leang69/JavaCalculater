import jdk.nashorn.api.scripting.ScriptObjectMirror;

public class binaryArithmetic {
    Complement complement = new Complement();
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
                System.out.println("con 1");
                StringBuilder builder = new StringBuilder();
                builder.append(answer);
                builder.deleteCharAt(0);
                answer = builder.toString();
                answer = binaryAdd(answer,"1");

            }

        }
        else if ((answer.length() == binaryA.length() || answer.length() == binaryB.length()))
        {
            System.out.println("con 2");
            answer = complement.firstComplement(answer);
            StringBuilder builder = new StringBuilder();
            builder.append(answer);
            builder.insert(0,"- ");
            answer = builder.toString();
        }
        return answer;
    }


        class Complement
        {
            String firstComplement(String a)
            {
                StringBuilder answer = new StringBuilder();
                for(int i = 0 ; i < a.length() ; i++)
                {
                    if(a.charAt(i) == '0')
                    {
                        answer.append(1);
                    }
                    else if(a.charAt(i) == '1')
                    {
                        answer.append(0);
                    }
                }
                return answer.toString();
            }
            String secondComplement(String a)
            {
                String answer;
                answer = firstComplement(a);
                return  binaryAdd(answer,"1");
            }
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




    String multiply(String a, String b)
    {
        String answer;
        StringBuilder builder = new StringBuilder();
        builder.append(b);
        b = builder.reverse().toString();
        if (b.charAt(0) == '1')
        {
            answer = a;
        }
        else
        {
            answer = "0";
        }
        builder = new StringBuilder();
        builder.append(a);
        for (int i = 1 ; i < b.length() ; i++)
        {
            builder.append(0);
            if (b.charAt(i) == '1')
            {
                answer = binaryAdd(answer,builder.toString());
            }
        }
        return answer;
    }
    String divide(String a, String b)
    {
        StringBuilder answer = new StringBuilder();
        StringBuilder remain = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        long valA,valB;
        valB = Long.parseLong(b);
        remain.append(a.charAt(0));
        for (int i = 0 ; i < a.length() ; i++)
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
                remain.append(complement.subtractWith2ndComplement(tmp.toString(),b));
                answer.append(1);
                tmp.setLength(0);
            }
            if (i != a.length()-1)
            {
                remain.append(a.charAt(i+1));
            }
        }
        if (remain.charAt(0) == '0')
        {
            remain.delete(0,remain.indexOf("1",0));
        }
        System.out.println("Remainder : " +remain);
        return answer.toString();
    }



}
