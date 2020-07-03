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
        if(s.charAt(0) == '-')
        {
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(0);
            sb.insert(0,"(n1×");
            sb.append(")");
            System.out.println(sb);
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
                
                if(layer.Display.getText().equals("0"))
                {
                    layer.Display.setText("1");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("1");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        StandardButton.get(27).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(layer.Display.getText().equals("0"))
                {
                    layer.Display.setText("2");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("2");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        StandardButton.get(28).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(layer.Display.getText().equals("0"))
                {
                    layer.Display.setText("3");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("3");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        StandardButton.get(20).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(layer.Display.getText().equals("0"))
                {
                    layer.Display.setText("4");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("4");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        StandardButton.get(21).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(layer.Display.getText().equals("0"))
                {
                    layer.Display.setText("5");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("5");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        StandardButton.get(22).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(layer.Display.getText().equals("0"))
                {
                    layer.Display.setText("6");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("6");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        StandardButton.get(14).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(layer.Display.getText().equals("0"))
                {
                    layer.Display.setText("7");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("7");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        //num 8
        StandardButton.get(15).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(layer.Display.getText().equals("0"))
                {
                    layer.Display.setText("8");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("8");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        //num 9
        StandardButton.get(16).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(layer.Display.getText().equals("0"))
                {

                    layer.Display.setText("9");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("9");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        //num 9
        StandardButton.get(34).addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                    if(!layer.Display.getText().contains("."))
                    {
                        StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                        num.append(".");
                        layer.Display.setText(num.toString());
                    } 
            }
        });
        
        
        
        //num π
        StandardButton.get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(layer.Display.getText().equals("0"))
                {

                    layer.Display.setText("π");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("π");
                    layer.Display.setText(num.toString());
                }

            }
        });
        StandardButton.get(8).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(layer.Display.getText().equals("0"))
                {

                    layer.Display.setText("e");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("e");
                    layer.Display.setText(num.toString());
                }

            }
        });
        StandardButton.get(32).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(layer.Display.getText().equals("0"))
                {

                    layer.Display.setText("-");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.insert(0,"-");
                    layer.Display.setText(num.toString());
                }

            }
        });
        /////////////////////////////////////////////// operator ///////////////////////////////////////
        
        StandardButton.get(35).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                setExpression(layer.Display.getText());
                StringBuilder sb = new StringBuilder(layer.Discription.getText());
                sb.setLength(sb.length()-3);
                sb.append(layer.Display.getText());
                model.Solve(Expression);
                setDiscription(layer.Display.getText() + " =");
                layer.Display.setText(model.getAnswer());
                Expression = "";
            }
        });
        
        StandardButton.get(11).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(layer.Discription.getText().contains("="))
                {
                    layer.Discription.setText("...");
                }
                
                if(!(layer.Display.getText().equals("0") || (layer.Display.getText().charAt(layer.Display.getText().length()-1)) == '+'))
                {
                    if(!(layer.Display.getText().contains("(") ^ layer.Display.getText().contains(")")))
                    {
                        setDiscription(layer.Display.getText());
                        setDiscription("+");
                        setExpression(layer.Display.getText()+"+");
                        layer.Display.setText("");
                    }
                    else
                    {
                        layer.Display.setText(layer.Display.getText() + "+");
                    }
                    
                }

            }
        });
        
        StandardButton.get(17).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(layer.Discription.getText().contains("="))
                {
                    layer.Discription.setText("...");
                }
                
                if(!(layer.Display.getText().equals("0") || (layer.Display.getText().charAt(layer.Display.getText().length()-1)) == '-'))
                {
                    if(!(layer.Display.getText().contains("(") ^ layer.Display.getText().contains(")")))
                    {
                        setDiscription(layer.Display.getText());
                        setDiscription("-");
                        setExpression(layer.Display.getText()+"-");
                        layer.Display.setText("");
                    }
                    else
                    {
                        layer.Display.setText(layer.Display.getText() + "-");
                    }
                    
                }

            }
        });
        
        StandardButton.get(23).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(layer.Discription.getText().contains("="))
                {
                    layer.Discription.setText("...");
                }
                //×
                if(!(layer.Display.getText().equals("0") || (layer.Display.getText().charAt(layer.Display.getText().length()-1)) == '×'))
                {
                    if(!(layer.Display.getText().contains("(") ^ layer.Display.getText().contains(")")))
                    {
                        setDiscription(layer.Display.getText());
                        setDiscription("×");
                        setExpression(layer.Display.getText()+"×");
                        layer.Display.setText("");
                    }
                    else
                    {
                        layer.Display.setText(layer.Display.getText() + "×");
                    }
                    
                }

            }
        });
        
        StandardButton.get(29).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(layer.Discription.getText().contains("="))
                {
                    layer.Discription.setText("...");
                }

                if(!(layer.Display.getText().equals("0") || (layer.Display.getText().charAt(layer.Display.getText().length()-1)) == '÷'))
                {
                    if(!(layer.Display.getText().contains("(") ^ layer.Display.getText().contains(")")))
                    {
                        setDiscription(layer.Display.getText());
                        setDiscription("÷");
                        setExpression(layer.Display.getText()+"÷");
                        layer.Display.setText("");
                    }
                    else
                    {
                        layer.Display.setText(layer.Display.getText() + "÷");
                    }
                    
                }

            }
        });
        
        StandardButton.get(30).addActionListener(new ActionListener() {
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
                    setDiscription("^");
                    setExpression(layer.Display.getText()+"^");
                    layer.Display.setText("");
                    }
                    else
                    {
                        layer.Display.setText(layer.Display.getText() + "^");
                    }
                }

            }
        });
        
        StandardButton.get(24).addActionListener(new ActionListener() {
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
                    setDiscription("^ 2");
                    setExpression(layer.Display.getText()+"^2");
                    layer.Display.setText("");
                    }
                    else
                    {
                        layer.Display.setText(layer.Display.getText() + "^2");
                    }
                }

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
                    setExpression(layer.Display.getText()+"s2");
                    setDiscription("√" + layer.Display.getText());
                    layer.Display.setText("");
                    }
                    else
                    {
                        layer.Display.setText(layer.Display.getText() + "√");
                    }
                }

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
                    else
                    {
                        layer.Display.setText("cuberoot(" + layer.Display.getText() + ")");
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
                    else
                    {
                        layer.Display.setText(layer.Display.getText() + "÷");
                    }
                }

            }
        });
        
        
                
        
        
        StandardButton.get(5).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                StringBuilder bul = new StringBuilder(layer.Display.getText());
                if(bul.length()-1 > 0)
                layer.Display.setText(bul.deleteCharAt(bul.length()-1).toString());
                else
                layer.Display.setText("0");       
            }
        });
        
        StandardButton.get(9).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                layer.Display.setText("0");
                layer.Discription.setText("...");
                Expression = "";
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
                  if(layer.Display.getText().equals("0"))
                {

                    layer.Display.setText("(");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("(");
                    layer.Display.setText(num.toString());
                } 
            }
        });
        StandardButton.get(3).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                  if(layer.Display.getText().equals("0"))
                {

                    layer.Display.setText(")");
                    layer.Display.repaint();
                }
                else
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append(")");
                    layer.Display.setText(num.toString());
                } 
            }
        });
    }
   
}
