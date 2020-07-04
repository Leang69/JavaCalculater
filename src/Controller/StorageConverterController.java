/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.StorageConverterModel;
import View.StorageConverterLayer;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import java.util.*;
import javax.swing.border.LineBorder;
/**
 *
 * @author User
 */
public class StorageConverterController {
    StorageConverterModel model ;
    StorageConverterLayer view;
    JTextField selectTextField = null ;
    ArrayList<StorageConverterLayer.MyButton> allButton;
    StringBuilder num = new StringBuilder() ;
    
    public StorageConverterController(StorageConverterLayer v)
    {
        model = new StorageConverterModel();
        view = v;
        selectTextField = v.getTxA();
        allButton = v.getAllButton();
    }
    
    private void updateView()
    {
        JTextField changeField;
        String Ans;
        System.out.println(num);
        if(selectTextField.getText().equals(""))
            selectTextField.setText("0");
        if (selectTextField == view.getTxA())
        {
            changeField = view.getTxB();
            Ans = model.solve(num.toString(), view.getTypeA().getSelectedIndex() , view.getTypeB().getSelectedIndex());
        }
        else
        {
           changeField = view.getTxA();
            Ans = model.solve(num.toString(), view.getTypeB().getSelectedIndex() , view.getTypeA().getSelectedIndex());
         
        }
        System.out.println(Ans);
        changeField.setText(Ans);
    }
    
    public void setEven()
    {
        view.getTypeA().addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e) {
                updateView();
            }
        });
        
        view.getTypeB().addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e) {
                updateView();
            }
        });
        
         view.getTxA().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                num.setLength(0);
                selectTextField.setBorder(new LineBorder(null));
                selectTextField =  view.getTxA();
                selectTextField.setBorder(new LineBorder(Color.BLACK,4));
            }
            @Override public void mousePressed(MouseEvent e) {}
            @Override public void mouseReleased(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e) {}
            
        });
        
         view.getTxB().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                num.setLength(0);
                selectTextField.setBorder(new LineBorder(null));
                selectTextField = view.getTxB();
                selectTextField.setBorder(new LineBorder(Color.BLACK,4));
            }
            @Override public void mousePressed(MouseEvent e) {}
            @Override public void mouseReleased(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e) {}
            
        });
         
         allButton.get(0).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    num.append("7");
                    selectTextField.setText(num.toString());
                }
                updateView();
            }
        }
        );
        
        allButton.get(1).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    num.append("8");
                    selectTextField.setText(num.toString());
                }
                updateView();
            }
            
            
        }
        );
        
        allButton.get(2).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    num.append("9");
                    selectTextField.setText(num.toString());
                }
                updateView();
            }
        }
        );
        
        allButton.get(11).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    if(num.length() > 0)
                    num.deleteCharAt(num.length()-1);
                    selectTextField.setText(num.toString());
                }
                updateView();
            }
        }
        );
        
        allButton.get(3).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    num.append("4");
                    selectTextField.setText(num.toString());
                }
                updateView();
            }
        }
        );
        
        allButton.get(4).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    num.append("5");
                    selectTextField.setText(num.toString());
                }
                updateView();
            }
        }
        );
        
        allButton.get(5).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    num.append("6");
                    selectTextField.setText(num.toString());
                }
                updateView();
            }
        }
        );
        
        allButton.get(9).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    selectTextField.setText("0");
                    num.setLength(0);
                }
                
                updateView();
            }
        }
        );
        
        allButton.get(6).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    num.append("1");
                    selectTextField.setText(num.toString());
                }
                updateView();
            }
        }
        );
        
        allButton.get(7).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    num.append("2");
                    selectTextField.setText(num.toString());
                }
                updateView();
            }
        }
        );
        
        allButton.get(8).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    num.append("3");
                    selectTextField.setText(num.toString());
                }
                updateView();
            }
        }
        );
        
        allButton.get(10).addActionListener(
        new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(selectTextField != null)
                {
                    num.append("0");
                    selectTextField.setText(num.toString());
                }
                updateView();
            }
        }
        );
    }
}
