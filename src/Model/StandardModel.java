/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;
import Logical.*;
import java.text.DecimalFormat;

/**
 *
 * @author User
 */
public class StandardModel {
    
    String expression;
    String answer;
    Operators operators = new Operators();
    
    public String getAnswer()
    {
        return answer;
    }
    
    public void setExpression(String input)
    {
        expression = input;
    }
    

    
    public void Solve(String expression)
    {
        Queue<String> postFix = new LinkedList<>(); 
        postFix = infixToPostFix(expression);
        Stack<String> a = new Stack<>();
        while(!postFix.isEmpty())
        {   
            if(isNumeric(postFix.peek())) 
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
    
    public boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException e) {
        return false;
    }
    return true;
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
    
    public int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '÷':
            case '×':
                return 2;
            case '^':
            case 's':
                return 3;    
        }
        return -1;
    }
    
    public Queue<String> infixToPostFix(String expression){

        Stack<Character> oparator = new Stack<>();
        Queue<String> postFix = new LinkedList<>(); 
        String tmp = "";
        
        for (int i = 0; i <expression.length() ; i++) 
        {
            char c = expression.charAt(i);
            if(precedence(c)>0)
            {
                if(!tmp.equals(""))
                {
                   if(this.isNumeric(tmp))
                   postFix.add(tmp);
                   tmp = ""; 
                }
                while(oparator.isEmpty()== false && precedence(oparator.peek())>=precedence(c))
                {
                    postFix.add(oparator.pop().toString());
                }
                oparator.push(c);
            }
            else if(c == ')')
            {
                if(this.isNumeric(tmp))
                postFix.add(tmp);
                tmp = "";
                while(true)
                {
                    if(oparator.peek() != '(')
                    {
                        postFix.add(""+oparator.pop()); 
                    }
                    else if(oparator.peek() == '(')
                    {
                        oparator.pop();
                        break;
                    }
                }  
            }
            else if(c == '(')
            {
                oparator.push(c);
            }
            else if (c == 'π')
            {
                tmp = "3.14159265359";
            }
            else if (c == 'n')
            {
                tmp = tmp + "-";
            }
            else if (c == 'e')
            {
                tmp = "2.718281828459";
            }
            else
            {
                tmp = tmp + c;
            }
        }
        if(!tmp.isEmpty())
        {
           postFix.add(tmp);
        }

        while(!oparator.isEmpty()) 
        {
            postFix.add(oparator.pop().toString());
        }   
        System.out.println(postFix.toString());
        return postFix;
    }    
}
