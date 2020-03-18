package Model;

import java.util.*;

public class SetTheory {
    private ArrayList <String>  setA = new ArrayList<String>();
    private ArrayList <String>  setB = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
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

    void createSet()
    {
        String setStringA , setStringB;
        StringBuilder builder = new StringBuilder();
        System.out.print("Please input set A : ");
        setStringA =  input.nextLine();
        System.out.print("Please input set B : ");
        setStringB =  input.nextLine();
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
    void union()
    {
        SetUnion set_union = new SetUnion();
        createSet();
        set_union.display(set_union.unionOperation());
    }

    void intersection()
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
        createSet();
        intersection.display(intersection.intersectionOperation());
    }
    void setDiff()
    {
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
        int menu;
        while (true)
        {
            System.out.println("1 : A - B");
            System.out.println("2 : B - A");
            System.out.println("0 : Back to main menu");
            System.out.println("-----------------------");
            System.out.print("Input menu : ");
            menu = input.nextInt();
            input.nextLine();
            System.out.println("-----------------------");
            switch (menu)
            {
                case 1:
                    createSet();
                    System.out.print("A - B : ");
                    SetDifference.display(SetDifference.differenceOperation(setA,setB));
                    break;
                case 2:
                    createSet();
                    System.out.print("B - A : ");
                    SetDifference.display(SetDifference.differenceOperation(setB,setA));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please input again");
            }
            if (menu == 0)
            {
                break;
            }
        }
    }
}
