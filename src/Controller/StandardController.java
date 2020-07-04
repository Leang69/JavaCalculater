/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.StandardLayer;
import CoreFucntion.Operators;
import javax.swing.event.*;
import java.awt.event.*;
import Model.StandardModel;
import java.util.ArrayList;
import javax.swing.*;
import java.util.*;


/**
 *
 * @author User
 */
public class StandardController {
    private StandardLayer view;
    private final ArrayList<StandardLayer.MyButton> StandardButton;
    private StandardModel model;
    private String Expression = "";
    private String number = "";
    private String saveNum = "";

    public StandardController(StandardLayer Mylayer)
    {
        view = Mylayer;
        model = new StandardModel();
        StandardButton = view.getStandardButton();
    }
    
    void setDisplayEmp()
    {
       view.Display.setText("");
    }
    
    void setDiscription(String s)
    {
        StringBuilder sb = new StringBuilder(view.Discription.getText());
        sb.insert(sb.length()-3,s+" ");
        view.Discription.setText(sb.toString());
    }
    private void inputOpe(String op) {
                if(Expression.length() > 0 && Expression.charAt(Expression.length()-1) == ')')
                {
                    setExpression(op);
                }
                else if(number.equals(""))
                {
                number = saveNum;
                setExpression(number);
                setExpression(op);
                }
                else
                {
                    setExpression(number);
                    setExpression(op);
                }
                if(view.Discription.getText().contains("="))
                {
                    view.Discription.setText("...");
                }
                setDiscription(number);
                setDiscription(op);
                saveNum = number;
                number = "";
            }
    void setExpression(String s)
    {
        if(s.equals(""))
        s = saveNum;
            
        if(s.charAt(0) == '-' && s.length() > 1)
        {
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(0);
            sb.insert(0,"n");
             Expression = Expression + sb.toString();
        }
        else
        {
             Expression = Expression + s;
        }
    }
    
    
    
    public void setButtonAction()
    {
        
        StandardButton.get(33).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(!view.Display.getText().equals("0"))
                {
                String a = "0";
                saveNum = "";
                StringBuilder num = new StringBuilder(number) ;
                num.append("a");
                number = num.toString();
                view.Display.setText(number);     
                }

            }
        });
        
        StandardButton.get(26).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String a = "1";
                saveNum = "";
                StringBuilder num = new StringBuilder(number) ;
                num.append(a);
                number = num.toString();
                view.Display.setText(number);                
            }
        });
        
        StandardButton.get(27).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String a = "2";
                saveNum = "";
                StringBuilder num = new StringBuilder(number) ;
                num.append(a);
                number = num.toString();
                view.Display.setText(number);  

            }
        });
        
        StandardButton.get(28).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String a = "3";
                saveNum = "";
                StringBuilder num = new StringBuilder(number) ;
                num.append(a);
                number = num.toString();
                view.Display.setText(number);  

            }
        });
        
        StandardButton.get(20).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String a = "4";
                saveNum = "";
                StringBuilder num = new StringBuilder(number) ;
                num.append(a);
                number = num.toString();
                view.Display.setText(number);  

            }
        });
        
        StandardButton.get(21).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String a = "5";
                saveNum = "";
                StringBuilder num = new StringBuilder(number) ;
                num.append(a);
                number = num.toString();
                view.Display.setText(number);  

            }
        });
        
        StandardButton.get(22).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String a = "6";
                saveNum = "";
                StringBuilder num = new StringBuilder(number) ;
                num.append(a);
                number = num.toString();
                view.Display.setText(number);  

            }
        });
        
        StandardButton.get(14).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String a = "7";
                saveNum = "";
                StringBuilder num = new StringBuilder(number) ;
                num.append(a);
                number = num.toString();
                view.Display.setText(number);  

            }
        });
        
        //num 8
        StandardButton.get(15).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String a = "8";
                saveNum = "";
                StringBuilder num = new StringBuilder(number) ;
                num.append(a);
                number = num.toString();
                view.Display.setText(number);  

            }
        });
        
        //num 9
        StandardButton.get(16).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String a = "9";
                saveNum = "";
                StringBuilder num = new StringBuilder(number) ;
                num.append(a);
                number = num.toString();
                view.Display.setText(number);  

            }
        });
        
        
        //num .
        StandardButton.get(34).addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                saveNum = "";
                StringBuilder num = new StringBuilder(number) ;
                if(num.length() == 0)
                {
                    num.append("0.");
                }
                if(!num.toString().contains("."))
                {
                    num.append(".");
                }
                number = num.toString();
                view.Display.setText(number);  
            }
        });
        
        
        
        //num π
        StandardButton.get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String a = "π";
                 StringBuilder num = new StringBuilder(number) ;
                if(!num.toString().contains("."))
                num.append(a);
                number = num.toString();
                view.Display.setText(number);  

            }
        });
        StandardButton.get(8).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                 String a = "e";
                StringBuilder num = new StringBuilder(number) ;
                if(!num.toString().contains("."))
                num.append(a);
                number = num.toString();
                view.Display.setText(number);  

            }
        });
        StandardButton.get(32).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(number) ;
                if(num.charAt(0) != '-')
                num.insert(0,"-");
                else
                num.deleteCharAt(0);
                number = num.toString();
                view.Display.setText(number);  

            }
        });
        /////////////////////////////////////////////// operator ///////////////////////////////////////
        
        StandardButton.get(35).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                StringBuilder sb = new StringBuilder(view.Discription.getText());
                if(number.equals(""))
                {
                number = saveNum;
                }
                setExpression(number);
                sb.append(number);
                setDiscription(number);
                sb.setLength(sb.length()-3);
                setDiscription(" =");
                model.Solve(Expression);
                view.Display.setText(model.getAnswer());
                Expression = "";
                saveNum = model.getAnswer();
                number = "";
            }
        });
        
        StandardButton.get(11).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String op = "+";
                inputOpe(op);
                
            }
        });
        
        StandardButton.get(17).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String op = "-";
                inputOpe(op);

            }
        });
        
        StandardButton.get(23).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String op = "×";
                inputOpe(op);

            }
        });
        
        StandardButton.get(29).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String op = "÷";
                inputOpe(op);

            }
        });
        
        StandardButton.get(30).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String op = "^";
                inputOpe(op);

            }
        });
        
        StandardButton.get(24).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String op = "^ 2";
                inputOpe(op);

            }

            
        });
        
        StandardButton.get(6).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(view.Discription.getText().contains("="))
                {
                    view.Discription.setText("...");
                }
                
                if(!(view.Display.getText().equals("0")))
                {
                    if(!(view.Display.getText().contains("(") ^ view.Display.getText().contains(")")))
                    {
                    setDiscription("√" + number);
                    model.Solve(view.Display.getText()+"s2");
                    number = model.getAnswer();
                    setDiscription(view.Discription.getText()+ " =");
                    view.Display.setText(number);
                    }
                }
                saveNum = number;
                number = "";


            }
        });
        
        /*StandardButton.get(12).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(view.Discription.getText().contains("="))
                {
                    view.Discription.setText("...");
                }
                
                if(!(view.Display.getText().equals("0")))
                {
                    if(!(view.Display.getText().contains("(") ^ view.Display.getText().contains(")")))
                    {
                    setExpression(view.Display.getText()+"s3");
                    setDiscription(" cuberoot(" + view.Display.getText() + ")");
                    view.Display.setText("");
                    }
                }

            }
        });
        
        StandardButton.get(18).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(view.Discription.getText().contains("="))
                {
                    view.Discription.setText("...");
                }
                
                if(!(view.Display.getText().equals("0") || (view.Display.getText().charAt(view.Display.getText().length()-1)) == '^'))
                {
                    if(!(view.Display.getText().contains("(") ^ view.Display.getText().contains(")")))
                    {
                        
                    setDiscription(view.Display.getText());
                    setDiscription("root");
                    setExpression(view.Display.getText()+"s");
                    view.Display.setText("");
                       
                    }
                }

            }
        });*/
        
        
                
        
        
        StandardButton.get(5).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                StringBuilder bul = new StringBuilder(number);
                if(bul.length()-1 > 0)
                view.Display.setText(bul.deleteCharAt(bul.length()-1).toString());
                else
                view.Display.setText("0");  
                
                number = bul.toString();
            }
        });
        
        StandardButton.get(9).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                view.Display.setText("0");
                view.Discription.setText("...");
                Expression = "";
                number = "";
            }
        });
        
        StandardButton.get(9).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                view.Display.setText("0");
                view.Discription.setText("...");
                number = "";
            }
        });
        
        StandardButton.get(33).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(!view.Display.getText().equals("0"))
                {
                    StringBuilder num = new StringBuilder( view.Display.getText() ) ;
                    num.append("0");
                    view.Display.setText(num.toString());
                }

            }
        });
        
        StandardButton.get(2).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
               //layer.Display.setText("(");
                    setDiscription("(");
                    setExpression("(");
                    view.Display.repaint();
            }
        });
        StandardButton.get(3).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                //layer.Display.setText("(");
                    setDiscription(view.Display.getText());
                    setDiscription(")");
                    setExpression(number);
                    setExpression(")");
                    number = "";
                    view.Display.repaint();
            }
        });
    }
   
}
