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
    private String Ans = "";
    private String saveAnswer = "";

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
    void setExpression(String s)
    {
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
        StandardButton.get(26).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("1");
                Ans = num.toString();
                view.Display.setText(Ans);                
            }
        });
        
        StandardButton.get(27).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("2");
                Ans = num.toString();
                view.Display.setText(Ans);  

            }
        });
        
        StandardButton.get(28).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("3");
                Ans = num.toString();
                view.Display.setText(Ans);  

            }
        });
        
        StandardButton.get(20).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("4");
                Ans = num.toString();
                view.Display.setText(Ans);  

            }
        });
        
        StandardButton.get(21).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("5");
                Ans = num.toString();
                view.Display.setText(Ans);  

            }
        });
        
        StandardButton.get(22).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("6");
                Ans = num.toString();
                view.Display.setText(Ans);  

            }
        });
        
        StandardButton.get(14).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("7");
                Ans = num.toString();
                view.Display.setText(Ans);  

            }
        });
        
        //num 8
        StandardButton.get(15).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("8");
                Ans = num.toString();
                view.Display.setText(Ans);  

            }
        });
        
        //num 9
        StandardButton.get(16).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("9");
                Ans = num.toString();
                view.Display.setText(Ans);  

            }
        });
        
        //num .
        StandardButton.get(34).addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                StringBuilder num = new StringBuilder(Ans) ;
                if(num.length() == 0)
                {
                    num.append("0.");
                }
                if(!num.toString().contains("."))
                {
                    num.append(".");
                }
                Ans = num.toString();
                view.Display.setText(Ans);  
            }
        });
        
        
        
        //num π
        StandardButton.get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                 StringBuilder num = new StringBuilder(Ans) ;
                if(!num.toString().contains("."))
                num.append("π");
                Ans = num.toString();
                view.Display.setText(Ans);  

            }
        });
        StandardButton.get(8).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                 StringBuilder num = new StringBuilder(Ans) ;
                if(!num.toString().contains("."))
                num.append("e");
                Ans = num.toString();
                view.Display.setText(Ans);  

            }
        });
        StandardButton.get(32).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                if(num.charAt(0) != '-')
                num.insert(0,"-");
                else
                num.deleteCharAt(0);
                Ans = num.toString();
                view.Display.setText(Ans);  

            }
        });
        /////////////////////////////////////////////// operator ///////////////////////////////////////
        
        StandardButton.get(35).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                StringBuilder sb = new StringBuilder(view.Discription.getText());
                if(Ans != "")
                {
                setExpression(Ans);
                sb.setLength(sb.length()-3);
                sb.append(Ans);
                setDiscription(Ans);
                }
                else
                {
                Ans = view.Display.getText();
                setExpression(Ans);
                sb.setLength(sb.length()-3);
                sb.append(Ans);
                setDiscription(Ans);
                }
                setDiscription(" =");
                model.Solve(Expression);
                view.Display.setText(model.getAnswer());
                Expression = "";
                Ans = model.getAnswer();
            }
        });
        
        StandardButton.get(11).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String op = "+";
                if(Ans.equals(""))
                {
                    setExpression(op); 
                }
                else
                {
                   setExpression(Ans);
                    setExpression(op);     
                 }
                if(view.Discription.getText().contains("="))
                {
                    view.Discription.setText("...");
                }
                setDiscription(Ans);
                setDiscription(op);
                
                Ans = "";

            }
        });
        
        StandardButton.get(17).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String op = "-";
                if(Ans.equals(""))
                {
                    setExpression(op); 
                }
                else
                {
                   setExpression(Ans);
                    setExpression(op);     
                 }
                if(view.Discription.getText().contains("="))
                {
                    view.Discription.setText("...");
                }
                setDiscription(Ans);
                setDiscription(op);
                
                Ans = "";

            }
        });
        
        StandardButton.get(23).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String op = "×";
                if(Ans.equals(""))
                {
                    setExpression(op); 
                }
                else
                {
                   setExpression(Ans);
                    setExpression(op);     
                 }
                if(view.Discription.getText().contains("="))
                {
                    view.Discription.setText("...");
                }
                setDiscription(Ans);
                setDiscription(op);
                
                Ans = "";

            }
        });
        
        StandardButton.get(29).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String op = "÷";
                if(Ans.equals(""))
                {
                    setExpression(op); 
                }
                else
                {
                   setExpression(Ans);
                    setExpression(op);     
                 }
                if(view.Discription.getText().contains("="))
                {
                    view.Discription.setText("...");
                }
                setDiscription(Ans);
                setDiscription(op);
                
                Ans = "";

            }
        });
        
        StandardButton.get(30).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String op = "^";
                if(Ans.equals(""))
                {
                    setExpression(op); 
                }
                else
                {
                   setExpression(Ans);
                    setExpression(op);     
                 }
                if(view.Discription.getText().contains("="))
                {
                    view.Discription.setText("...");
                }
                setDiscription(Ans);
                setDiscription(op);
                
                Ans = "";

            }
        });
        
        StandardButton.get(24).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                String op = "^ 2";
                if(Ans.equals(""))
                {
                    setExpression(op); 
                }
                else
                {
                   setExpression(Ans);
                    setExpression(op);     
                 }
                if(view.Discription.getText().contains("="))
                {
                    view.Discription.setText("...");
                }
                setDiscription(Ans);
                setDiscription(op);
                
                Ans = "";

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
                    model.Solve(view.Display.getText()+"s2");
                    setExpression(model.getAnswer());
                    Ans = model.getAnswer();
                    setDiscription("√" + view.Display.getText());
                    view.Display.setText(Ans);
                    }
                }
                Ans = "";

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
                StringBuilder bul = new StringBuilder(Ans);
                if(bul.length()-1 > 0)
                view.Display.setText(bul.deleteCharAt(bul.length()-1).toString());
                else
                view.Display.setText("0");  
                
                Ans = bul.toString();
            }
        });
        
        StandardButton.get(9).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                view.Display.setText("0");
                view.Discription.setText("...");
                Expression = "";
                Ans = "";
            }
        });
        
        StandardButton.get(9).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                view.Display.setText("0");
                view.Discription.setText("...");
                Ans = "";
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
                    setExpression(Ans);
                    setExpression(")");
                    Ans = "";
                    view.Display.repaint();
            }
        });
    }
   
}
