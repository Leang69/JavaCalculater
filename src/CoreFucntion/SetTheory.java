package CoreFucntion;

import java.util.*;

public class SetTheory {
    private String answer = "";
    private ArrayList <String>  setA = new ArrayList<String>();
    private ArrayList <String>  setB = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    
    public String getAnswer()
    {
        if( answer.length() > 0 && answer.charAt(answer.length()-1) == ',')
        {
            StringBuilder n = new StringBuilder(answer);
            n.deleteCharAt(n.length()-1);
            answer = n.toString();
        }
        if(answer.length() == 0)
        {
            answer = "∅";
        }
        return answer;
    }
    
    interface UnionHelper
    {
        ArrayList<String> unionOperation();
        void display(ArrayList <String> union);
    }
    interface IntersectionHelper
    {
        ArrayList<String>  intersectionOperation();
        void display(ArrayList <String> intersection);
    }
    interface SetDifferenceHelper
    {
        ArrayList<String>  differenceOperation(ArrayList <String>  setA , ArrayList <String>  setB);
        void display(ArrayList <String> difference);
    }

    void createSet(String a , String b)
    {
        String setStringA , setStringB;
        StringBuilder builder = new StringBuilder();
        setStringA =  a;
        setStringB =  b;
        setStringA = setStringA + ",";
        setStringB =  setStringB + ",";
        filterArray(setStringA, builder, setA);
        filterArray(setStringB, builder, setB);
    }

    private void filterArray(String setStringA, StringBuilder builder, ArrayList<String> setA) {
        for (int i = 0 ; i < setStringA.length() ; i++)
        {
            if(setStringA.charAt(i) == ',')
            {
                if(!setA.contains(builder.toString()))
                {
                    setA.add(builder.toString());
                }
                builder.setLength(0);

            }
            else
            {
                builder.append(setStringA.charAt(i));
            }

        }
    }

    class SetUnion implements UnionHelper
    {
        @Override
        public ArrayList<String> unionOperation()
        {
            ArrayList<String> union = new ArrayList<String>();
            union.addAll(setA);
            for (String a : setB)
            {
                if (!union.contains(a))
                {
                    union.add(a);
                }
            }
            setA.removeAll(setA);
            setB.removeAll(setB);
            union.sort(Comparator.comparing(Integer::parseInt));
            return union;
        }

        @Override
        public void display(ArrayList<String> union)
        {
            System.out.print("Union of set A and set B : ");
            System.out.print(union);
            System.out.println();
        }

    }
    public String union(String a , String b)
    {
        SetUnion set_union = new SetUnion();
        createSet(a,b);
        ArrayList<String> tmp = set_union.unionOperation();
        
        answer = "";
        
        for (String s : tmp)
        {
                answer = answer + s + ",";
        }

        
        return answer;
    }

    public String intersection(String a , String b)
    {
        class SetIntersection implements IntersectionHelper
        {

            @Override
            public ArrayList<String> intersectionOperation() 
            {
                ArrayList<String> intersection = new ArrayList<String>();
                for (String a : setA)
                {
                    if (setB.contains(a))
                    { intersection.add(a); }
                }
                setA.removeAll(setA);
                setB.removeAll(setB);
                Collections.sort(intersection);
                return intersection;
            }

            @Override
            public void display(ArrayList<String> intersection)
            {
                System.out.print("intersection of set A and set B : ");
                System.out.print(intersection);
                System.out.println();
            }
        }
        SetIntersection intersection = new SetIntersection();
        createSet(a,b);
        ArrayList<String> tmp = intersection.intersectionOperation();
        
        answer = "";
        
        for (String s : tmp)
        {
                answer = answer + s + ",";
        }

        
        return answer;
    }
    
    public String setDiff(String a , String b , int menu)
    {
        ArrayList<String> tmp = null;
        SetDifferenceHelper SetDifference = new SetDifferenceHelper()
        {
            @Override
            public ArrayList<String> differenceOperation(ArrayList<String> setA, ArrayList<String> setB)
            {
                ArrayList<String> difference = new ArrayList<String>();
                for (String a : setA)
                {
                    if (!setB.contains(a))
                    {
                        difference.add(a);
                    }
                }
                setA.removeAll(setA);
                setB.removeAll(setB);
                Collections.sort(difference);
                return difference;
            }

            @Override
            public void display(ArrayList<String> difference)
            {
                System.out.print("difference : ");
                System.out.print(difference);
                System.out.println();
            }
        };
        switch (menu)
        {
           case 2:
                    createSet(a,b);
                    tmp = SetDifference.differenceOperation(setA,setB);
                    break;
            case 3:
                    createSet(a,b);
                    tmp = SetDifference.differenceOperation(setB,setA);
                    break;
        }
        
        answer = "";
        
        for (String s : tmp)
        {
                answer = answer + s + ",";
        }

        return answer;
    }
}
