/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Controller.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

/**
 *
 * @author User
 */
public class MyFrame extends JFrame {
    MyMenuBar MenuBar = new MyMenuBar();
    
    
    private ProgrammingLayer programming = new ProgrammingLayer();
    private Set_Theory setTheory = new Set_Theory();
    private StandardLayer standard = new StandardLayer();
    private StorageConverterLayer storageConverter = new StorageConverterLayer();
    
    StandardController standardController = new StandardController(standard);
    
    
    public MyFrame()
    {
        this.iniFrame("Standard", 1000, 500);
        this.add(standard);
        standardController.setButtonAction();
    }
    void iniFrame(String title,int height , int weight)
    {
        this.setTitle(title);
        this.setJMenuBar(MenuBar);
        this.setBackground(Color.WHITE);
        this.setMinimumSize(new Dimension(height,weight));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setVisible(true);
        MenuBar.Standard.addActionListener(new MyMenuListenser(this));
        MenuBar.Programmer.addActionListener(new MyMenuListenser(this) );
        MenuBar.StorageConverter.addActionListener(new MyMenuListenser(this));
        MenuBar.SetTheory.addActionListener(new MyMenuListenser(this));
    }
    
    
   
    
    class MyMenuListenser implements ActionListener
    {
        MyFrame outerClass;
        MyMenuListenser(MyFrame a)
        {
            outerClass = a;
        }
      @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource() == MenuBar.Programmer)
        {
            outerClass.getContentPane().removeAll();
            outerClass.add(outerClass.programming);
            outerClass.revalidate();
            outerClass.repaint();
            outerClass.setTitle("Programming");
        }
        else if(e.getSource() == MenuBar.Standard)
        {
            outerClass.getContentPane().removeAll();
            outerClass.add(outerClass.standard);
            outerClass.revalidate();
            outerClass.repaint();
            outerClass.setTitle("Standard");
        }
        else if(e.getSource() == MenuBar.StorageConverter)
        {

            outerClass.getContentPane().removeAll();
            outerClass.add(outerClass.storageConverter);
            outerClass.revalidate();
            outerClass.repaint();
            outerClass.setTitle("StorageConverter");
        }
        else if(e.getSource() == MenuBar.SetTheory)
        {
            outerClass.getContentPane().removeAll();
            outerClass.add(outerClass.setTheory);
            outerClass.revalidate();
            outerClass.repaint();
            outerClass.setTitle("Set Theory");
        }
    }


        
    }
    
    
}
