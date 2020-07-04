/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import CoreFucntion.SetTheory;
import View.Set_Theory;

/**
 *
 * @author User
 */
public class setTheoryModel {
    private String answer;
    SetTheory setTheory = new SetTheory();
    public setTheoryModel()
    {
        
    }
    
    public String getAnswer()
    {
        return answer;
    }
    
    public void Solve(String setA , String setB , int operator)
    {
        if(operator == 0)
        {
            setTheory.intersection(setA, setB);
            answer = setTheory.getAnswer();
        }
        else if (operator == 1)
        {
            setTheory.union(setA, setB);
            answer = setTheory.getAnswer();
        }
        else if (operator == 2)
        {
            setTheory.setDiff(setA, setB, operator);
            answer = setTheory.getAnswer();
        }
        else if (operator == 3)
        {
            setTheory.setDiff(setA, setB, operator);
            answer = setTheory.getAnswer();
        }
    }
}
