import java.util.ArrayList;
import java.util.Scanner;

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
        ArrayList<String>  differenceOperation();
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
        for (int i = 0 ; i < setStringB.length() ; i++)
        {
            if(setStringB.charAt(i) == ',')
            {
                if(!setB.contains(builder.toString()))
                {
                    setB.add(builder.toString());
                }
                builder.setLength(0);
            }
            else
            {
                builder.append(setStringB.charAt(i));
            }

        }

        /*for (String set : setA)
        {
            System.out.println(set);
        }
        System.out.println("----------------------------------------------");
        for (String set : setB)
        {
            System.out.println(set);
        }*/

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
                for (String b : setA)
                {
                    for (String a : setB)
                    {
                        if (b.contains(a))
                        {
                            intersection.add(a);
                        }
                    }

                }
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
            public ArrayList<String> differenceOperation()
            {
                ArrayList<String> difference = new ArrayList<String>();
                Scanner input = new Scanner(System.in);
                int menu;
                do {
                    System.out.println("A - B");
                    System.out.println("B - A");
                    System.out.println("-----------------------");
                    System.out.print("Input menu : ");
                    menu = input.nextInt();
                    System.out.println("-----------------------");
                    switch (menu) {
                        case 1:
                        {
                            difference.addAll(setA);
                            for (String a : setA)
                            {
                                for (String b : setB)
                                {
                                    if (a.contains(b))
                                    {
                                        difference.remove(a);
                                    }
                                }
                            }
                        }
                        case 2:
                        {
                            difference.addAll(setB);
                            for (String a : setB)
                            {
                                for (String b : setA)
                                {
                                    if (a.contains(b))
                                    {
                                        difference.remove(a);
                                    }
                                }
                            }
                        }
                            break;
                        case 0:
                            break;
                        default:
                            System.out.print("Please input again : ");
                    }

                } while (menu != 0);
                return difference;
            }

            @Override
            public void display(ArrayList<String> difference) {
                System.out.print("difference : ");
                System.out.print(difference);
                System.out.println();
            }
        };
        createSet();
        SetDifference.display(SetDifference.differenceOperation());
    }
}
