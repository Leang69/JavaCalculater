/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import CoreFucntion.Operators;
import java.util.*;


/**
 *
 * @author User
 */
public class StandardModel {
    
    String expression;
    String answer;
    CalculatorMind mind = new CalculatorMind();
    Operators operators = new Operators();
    
    public String getAnswer()
    {
        return answer;
    }
    public void setExpression(String input)
    {
        //gfvhg
        expression = input;
    }
    

    
    public void Solve(String expression)
    {
        Queue<String> postFix = new LinkedList<>(); 
        postFix = mind.infixToPostFix(expression);
        Stack<String> a = new Stack<>();
        while(!postFix.isEmpty())
        {   
            if(mind.isNumeric(postFix.peek())) 
            {
		a.push(postFix.remove());
            }
            else if(postFix.peek().equals("^") || postFix.peek().equals("÷") || 
                postFix.peek().equals("×")|| postFix.peek().equals("+") || 
                postFix.peek().equals("-") || postFix.peek().equals("s")
                    )
            {
				Double A = Double.parseDouble(a.pop());
				Double B = Double.parseDouble(a.pop());
				String op = postFix.remove();
				a.push(Operation(A, B, op));			
            }
	}
        answer = a.pop();
        if(answer.substring(answer.length()-2).equals(".0"))
        {
            StringBuilder s = new StringBuilder(answer);
            s.setLength(s.length()-2);
            answer = s.toString();
        }
        
    }
    public String Operation(Double a, Double b, String c){
		Double ans = 0.0;
		if(c.equals("+")){
			ans = operators.sum(b, a);
		}
		else if(c.equals("-")){
			ans = operators.minus(b, a);
		}
		else if(c.equals("×")){
			ans = operators.multiply(b, a);
		}
		else if(c.equals("÷")){
			ans = operators.divide(b, a);
		}
                else if(c.equals("^")){
			ans = operators.pow(b, a);
		}
                else if(c.equals("s")){
			ans = operators.root(b,a);
		}
		return String.valueOf(ans);
	}
    
    
    
        
}
