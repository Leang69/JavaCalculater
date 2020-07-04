/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.MyFrame;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 *
 * @author User
 */
public class CalculatorMind {
    public static void main(String[] args) {  
        MyFrame myFrame = new MyFrame();           
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
                if(this.isNumeric(tmp))
                {
                    postFix.add(tmp);
                    tmp = ""; 
                    oparator.push('*');
                }
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
    
}

