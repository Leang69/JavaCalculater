/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.Set_Theory;
import Logical.Operators;
import javax.swing.event.*;
import java.awt.event.*;
import Model.setTheoryModel;
import Model.StandardModel;
import java.awt.Color;
import javax.swing.*;
import java.util.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author User
 */
public class Set_TheoryController {
    setTheoryModel SetTheoryModel;
    Set_Theory setTheoryView;
    JTextField selectTextField = null ;
    private final ArrayList<Set_Theory.MyButton> setTheoryButton;
    
    public Set_TheoryController(Set_Theory MysetTheoryView)
    {
        setTheoryView = MysetTheoryView;
        SetTheoryModel = new setTheoryModel(setTheoryView);
        selectTextField = setTheoryView.setA;
        setTheoryButton = setTheoryView.getSetTheoryButtons();
    }
    
    public void setEven()
    {
        setTheoryView.setB.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                selectTextField.setBorder(new LineBorder(null));
                selectTextField = setTheoryView.setB;
                selectTextField.setBorder(new LineBorder(Color.BLACK,4));
            }
            @Override public void mousePressed(MouseEvent e) {}
            @Override public void mouseReleased(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e) {}
            
        });
        
        setTheoryView.setA.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                selectTextField.setBorder(new LineBorder(null));
                selectTextField = setTheoryView.setA;
                selectTextField.setBorder(new LineBorder(Color.BLACK,4));
            }
            @Override public void mousePressed(MouseEvent e) {}
            @Override public void mouseReleased(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e) {}
            
        });
        
        
        /*this.setButtonText(SetTheoryButtons,0,"9");
        this.setButtonText(SetTheoryButtons,1,"8");
        this.setButtonText(SetTheoryButtons,2,"7");
        this.setButtonText(SetTheoryButtons,3,"DELETE");
        this.setButtonText(SetTheoryButtons,4,"6");
        this.setButtonText(SetTheoryButtons,5,"5");
        this.setButtonText(SetTheoryButtons,6,"4");
        this.setButtonText(SetTheoryButtons,7,"CE");
        this.setButtonText(SetTheoryButtons,8,"3");
        this.setButtonText(SetTheoryButtons,9,"2");
        this.setButtonText(SetTheoryButtons,10,"1");
        this.setButtonText(SetTheoryButtons,11,"ENTER");
        this.setButtonText(SetTheoryButtons,12,"0");
        this.setButtonText(SetTheoryButtons,13,"0");
        this.setButtonText(SetTheoryButtons,14,".");
        this.setButtonText(SetTheoryButtons,15,"0");*/
        
        setTheoryButton.get(0).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    num.append("7");
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
        setTheoryButton.get(1).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    num.append("8");
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
        setTheoryButton.get(2).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    num.append("9");
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
        setTheoryButton.get(3).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    if(num.length() > 0)
                    num.deleteCharAt(num.length()-1);
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
        setTheoryButton.get(4).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    num.append("4");
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
        setTheoryButton.get(5).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    num.append("5");
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
        setTheoryButton.get(6).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    num.append("6");
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
        setTheoryButton.get(7).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    selectTextField.setText("");
                }
            }
        }
        );
        
        setTheoryButton.get(8).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    num.append("1");
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
        setTheoryButton.get(9).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    num.append("2");
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
        setTheoryButton.get(10).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    num.append("3");
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
        setTheoryButton.get(11).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                   setTheoryView.Answer.setText("");
                   SetTheoryModel.Solve(setTheoryView.setA.getText() , setTheoryView.setB.getText() , setTheoryView.setOperators.getSelectedIndex());
                }
                
            }
        }
        );
        
        setTheoryButton.get(12).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    num.append("9");
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
        setTheoryButton.get(13).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    num.append("0");
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
        setTheoryButton.get(14).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    num.append(",");
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
        setTheoryButton.get(15).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    StringBuilder num = new StringBuilder( selectTextField.getText() ) ;
                    num.append("0");
                    selectTextField.setText(num.toString());
                }
            }
        }
        );
        
    }
    
            
    
}
