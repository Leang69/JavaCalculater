/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;
import GUI.StandardLayer;
import Logical.*;
import java.text.DecimalFormat;

/**
 *
 * @author User
 */
public class StandardModel {
    
    String expression;
    StandardLayer view ;
    String answer;
    Operators operators = new Operators();
    
    public void setExpression(String input)
    {
        expression = input;
    }
    
    public StandardModel(StandardLayer Myview)
    {
        this.view = Myview;
    }
            
    
    Stack<Character> stack = new Stack<>();
    Queue<String> postFix = new LinkedList<>(); 
    
    
    public void Solve(String expression)
    {
        infixToPostFix(expression);
        Stack<String> a = new Stack<>();
        while(!postFix.isEmpty()){
            if(isNumeric(postFix.peek())){
		a.push(postFix.remove());
	}
	else if(postFix.peek().equals("^") || postFix.peek().equals("*") || postFix.peek().equals("/")|| postFix.peek().equals("+") || postFix.peek().equals("-") ){
				Double A = Double.parseDouble(a.pop());
				Double B = Double.parseDouble(a.pop());
				String op = postFix.remove();
				a.push(Operation(A, B, op));			
            }
	}
        answer = a.pop();
	view.Display.setText(answer);
        
    }
    
    public boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
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
		else if(c.equals("*")){
			ans = operators.multiply(b, a);
		}
		else if(c.equals("/")){
			ans = operators.divide(b, a);
		}
		return String.valueOf(ans);
	}
    
    public int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
    
    public Queue<String> infixToPostFix(String expression){

        String tmp = "";
        
        for (int i = 0; i <expression.length() ; i++) {
            char c = expression.charAt(i);

            //check if char is operator
            if(precedence(c)>0){
                postFix.add(tmp);
                tmp = "";
                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
                    postFix.add(stack.pop().toString());
                }
                stack.push(c);
            }else if(c==')'){
                char x = stack.pop();
                while(x!='('){
                    tmp += x;
                    x = stack.pop();
                }
            }else if(c=='('){
                stack.push(c);
            }else{
                //character is neither operator nor ( 
                tmp += c;
            }
        }
        postFix.add(tmp);
        for (int i = 0; i <=stack.size() ; i++) {
            postFix.add(stack.pop().toString());
        }
        return postFix;
    }    
}
