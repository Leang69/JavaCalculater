/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Logical.SetTheory;
import View.Set_Theory;

/**
 *
 * @author User
 */
public class setTheoryModel {
    String answer;
    SetTheory setTheory = new SetTheory();
    Set_Theory setTheoryView;
    //String[] setOperatorsName = {"Intersection" , "Union","Set Difference A-B","Set Difference B-A"};
    public setTheoryModel(Set_Theory MysetTheory)
    {
        setTheoryView = MysetTheory;
    }
    public void Solve(String setA , String setB , int operator)
    {
        if(operator == 0)
        {
            setTheory.intersection(setA, setB);
            setTheoryView.Answer.setText(setTheory.getAnswer());
        }
        else if (operator == 1)
        {
            setTheory.union(setA, setB);
            setTheoryView.Answer.setText(setTheory.getAnswer());
        }
        else if (operator == 2)
        {
            setTheory.setDiff(setA, setB, operator);
            setTheoryView.Answer.setText(setTheory.getAnswer());
        }
        else if (operator == 3)
        {
            setTheory.setDiff(setA, setB, operator);
            setTheoryView.Answer.setText(setTheory.getAnswer());
        }
    }
}
