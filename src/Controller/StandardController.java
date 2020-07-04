/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.StandardLayer;
import Logical.Operators;
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
    private StandardLayer layer;
    private final ArrayList<StandardLayer.MyButton> StandardButton;
    private StandardModel model;
    private String Expression = "";
    private String Ans = "";

    public StandardController(StandardLayer Mylayer)
    {
        layer = Mylayer;
        model = new StandardModel();
        StandardButton = layer.getStandardButton();
    }
    
    void setDisplayEmp()
    {
       layer.Display.setText("");
    }
    
    void setDiscription(String s)
    {
        StringBuilder sb = new StringBuilder(layer.Discription.getText());
        sb.insert(sb.length()-3,s+" ");
        layer.Discription.setText(sb.toString());
        
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
                layer.Display.setText(Ans);                
            }
        });
        
        StandardButton.get(27).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("2");
                Ans = num.toString();
                layer.Display.setText(Ans);  

            }
        });
        
        StandardButton.get(28).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("3");
                Ans = num.toString();
                layer.Display.setText(Ans);  

            }
        });
        
        StandardButton.get(20).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("4");
                Ans = num.toString();
                layer.Display.setText(Ans);  

            }
        });
        
        StandardButton.get(21).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("5");
                Ans = num.toString();
                layer.Display.setText(Ans);  

            }
        });
        
        StandardButton.get(22).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("6");
                Ans = num.toString();
                layer.Display.setText(Ans);  

            }
        });
        
        StandardButton.get(14).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                StringBuilder num = new StringBuilder(Ans) ;
                num.append("7");
                Ans = num.toString();
                layer.Display.setText(Ans);  

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
                layer.Display.setText(Ans);  

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
                layer.Display.setText(Ans);  

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
                layer.Display.setText(Ans);  
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
                layer.Display.setText(Ans);  

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
                layer.Display.setText(Ans);  

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
                layer.Display.setText(Ans);  

            }
        });
        /////////////////////////////////////////////// operator ///////////////////////////////////////
        
        StandardButton.get(35).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                StringBuilder sb = new StringBuilder(layer.Discription.getText());
                if(Ans != "")
                {
                setExpression(Ans);
                sb.setLength(sb.length()-3);
                sb.append(Ans);
                setDiscription(Ans);
                }
                else
                {
                Ans = layer.Display.getText();
                setExpression(Ans);
                sb.setLength(sb.length()-3);
                sb.append(Ans);
                setDiscription(Ans);
                }
                setDiscription(" =");
                model.Solve(Expression);
                layer.Display.setText(model.getAnswer());
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
                if(layer.Discription.getText().contains("="))
                {
                    layer.Discription.setText("...");
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
                if(layer.Discription.getText().contains("="))
                {
                    layer.Discription.setText("...");
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
                if(layer.Discription.getText().contains("="))
                {
                    layer.Discription.setText("...");
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
                if(layer.Discription.getText().contains("="))
                {
                    layer.Discription.setText("...");
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
                if(layer.Discription.getText().contains("="))
                {
                    layer.Discription.setText("...");
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
                if(layer.Discription.getText().contains("="))
                {
                    layer.Discription.setText("...");
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
                if(layer.Discription.getText().contains("="))
                {
                    layer.Discription.setText("...");
                }
                
                if(!(layer.Display.getText().equals("0")))
                {
                    if(!(layer.Display.getText().contains("(") ^ layer.Display.getText().contains(")")))
                    {
                    model.Solve(layer.Display.getText()+"s2");
                    setExpression(model.getAnswer());
                    Ans = model.getAnswer();
                    setDiscription("√" + layer.Display.getText());
                    layer.Display.setText(Ans);
                    }
                }
                Ans = "";

            }
        });
        
        StandardButton.get(12).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(layer.Discription.getText().contains("="))
                {
                    layer.Discription.setText("...");
                }
                
                if(!(layer.Display.getText().equals("0")))
                {
                    if(!(layer.Display.getText().contains("(") ^ layer.Display.getText().contains(")")))
                    {
                    setExpression(layer.Display.getText()+"s3");
                    setDiscription(" cuberoot(" + layer.Display.getText() + ")");
                    layer.Display.setText("");
                    }
                }

            }
        });
        
        StandardButton.get(18).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(layer.Discription.getText().contains("="))
                {
                    layer.Discription.setText("...");
                }
                
                if(!(layer.Display.getText().equals("0") || (layer.Display.getText().charAt(layer.Display.getText().length()-1)) == '^'))
                {
                    if(!(layer.Display.getText().contains("(") ^ layer.Display.getText().contains(")")))
                    {
                        
                    setDiscription(layer.Display.getText());
                    setDiscription("root");
                    setExpression(layer.Display.getText()+"s");
                    layer.Display.setText("");
                       
                    }
                }

            }
        });
        
        
                
        
        
        StandardButton.get(5).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                StringBuilder bul = new StringBuilder(Ans);
                if(bul.length()-1 > 0)
                layer.Display.setText(bul.deleteCharAt(bul.length()-1).toString());
                else
                layer.Display.setText("0");  
                
                Ans = bul.toString();
            }
        });
        
        StandardButton.get(9).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                layer.Display.setText("0");
                layer.Discription.setText("...");
                Expression = "";
                Ans = "";
            }
        });
        
        StandardButton.get(9).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                layer.Display.setText("0");
                layer.Discription.setText("...");
                Ans = "";
            }
        });
        
        StandardButton.get(33).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(!layer.Display.getText().equals("0"))
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("0");
                    layer.Display.setText(num.toString());
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
                    layer.Display.repaint();
            }
        });
        StandardButton.get(3).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                //layer.Display.setText("(");
                    setDiscription(layer.Display.getText());
                    setDiscription(")");
                    setExpression(Ans);
                    setExpression(")");
                    Ans = "";
                    layer.Display.repaint();
            }
        });
    }
   
}
