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

    public StandardController(StandardLayer Mylayer)
    {
        layer = Mylayer;
        model = new StandardModel();
        StandardButton = layer.getStandardButton();
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
        StandardButton.get(34).addActionListener(new ActionListener() {
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
                    num.append(".");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        
        /////////////////////////////////////////////// operator ///////////////////////////////////////
        StandardButton.get(11).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(!(layer.Display.getText().equals("0") || (layer.Display.getText().charAt(layer.Display.getText().length()-1)) == '+'))
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("+");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        StandardButton.get(17).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(!(layer.Display.getText().equals("0") || (layer.Display.getText().charAt(layer.Display.getText().length()-1)) == '-'))
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("-");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        StandardButton.get(23).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                
                if(!(layer.Display.getText().equals("0") || (layer.Display.getText().charAt(layer.Display.getText().length()-1)) == '*'))
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("×");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        StandardButton.get(29).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(!(layer.Display.getText().equals("0") || (layer.Display.getText().charAt(layer.Display.getText().length()-1)) == '/'))
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("÷");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        StandardButton.get(30).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(!(layer.Display.getText().equals("0") || (layer.Display.getText().charAt(layer.Display.getText().length()-1)) == '/'))
                {
                    StringBuilder num = new StringBuilder( layer.Display.getText() ) ;
                    num.append("^");
                    layer.Display.setText(num.toString());
                }

            }
        });
        
        
        StandardButton.get(35).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                model.Solve(layer.Display.getText());
                layer.Display.setText(model.getAnswer());
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
