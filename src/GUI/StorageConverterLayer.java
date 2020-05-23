/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class StorageConverterLayer extends MyFrame{
    public StorageConverterLayer(String title) {
        this.setLayout(new GridBagLayout());
        this.buildContendPane();
        this.setTitle(title);
        this.setJMenuBar(new MyMenuBar());
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1000, 500));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    private class MyButton extends JButton 
    {
        MyButton()
        {
            this.setBackground(new Color(152, 222, 224));
            this.setBorder(null);
        }
    }
    
    @Override 
    void buildContendPane() {
        JPanel Display = new JPanel();
        Display.setLayout(new GridLayout(4,1));
        JTextField A = new JTextField();
        JTextField B = new JTextField();
        JComboBox  typeA = new JComboBox ();
        JComboBox  typeB = new JComboBox();
        Display.add(A);
        Display.add(typeA);
        Display.add(B);
        Display.add(typeB);  
        this.getContentPane().add(Display,BorderLayout.NORTH);
        
        JPanel keyPanel = new JPanel();
        
        
        
    }
}
