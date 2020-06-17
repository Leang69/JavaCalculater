/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Logical.Main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
/**
 *
 * @author User
 */
public class MyMenuBar extends JMenuBar{
    JButton Standard , Programmer , StorageConverter , SetTheory;
    private Font MenuBarFont = new Font("Arial", Font.BOLD, 14);
    
    MyMenuBar()
    {
        this.setBackground(new Color(152, 222, 224));
        Standard = new JButton(" Standard" );
        Programmer = new JButton(" Programmer ");
        StorageConverter = new JButton(" StorageConverter ");
        SetTheory = new JButton(" SetTheory ");
        
        Standard.setFont(MenuBarFont);
        Programmer.setFont(MenuBarFont);
        StorageConverter.setFont(MenuBarFont);
        SetTheory.setFont(MenuBarFont);
        
        Standard.setBackground(new Color(152, 222, 224));
        Programmer.setBackground(new Color(152, 222, 224));
        StorageConverter.setBackground(new Color(152, 222, 224));
        SetTheory.setBackground(new Color(152, 222, 224));
             
        Standard.setBorder(null);
        Programmer.setBorder(null);
        StorageConverter.setBorder(null);
        SetTheory.setBorder(null);
                
        this.add(Standard);
        this.add(Programmer);
        this.add(StorageConverter);
        this.add(SetTheory);
        
    }
    
    
}
