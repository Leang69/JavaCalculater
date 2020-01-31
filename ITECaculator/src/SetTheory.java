import java.util.ArrayList;
import java.util.Scanner;

public class SetTheory {
    private ArrayList <String>  setA = new ArrayList<String>();
    private ArrayList <String>  setB = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    interface UnionHelper
    {
        String unionOperation();
        void display();
    }
    interface IntersectionHelper
    {
        String intersectionOperation();
        void display();
    }
    interface SetDifferenceHelper
    {
        String differenceOperation();
        void display();
    }

    void createSet()
    {
        String setStringA , setStringB;
        System.out.print("Please input set A : ");
        setStringA =  input.next();
        System.out.print("Please input set B : ");
        setStringB =  input.next();

    }

    class setUnion implements UnionHelper
    {

        @Override
        public String unionOperation() {
            return null;
        }

        @Override
        public void display() {

        }

    }
    void union()
    {
        setUnion set_union = new setUnion();
        createSet();
    }
}
