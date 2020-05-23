/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


/**
 *
 * @author User
 */
public class ProgrammingLayer extends MyFrame{
    public ProgrammingLayer(String title) {
        this.setTitle(title);
        this.setJMenuBar(new MyMenuBar());
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1000, 500));
        this.setResizable(false);
        this.buildContendPane();
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
        this.setLayout(new BorderLayout(5,5));
        JTextField Display = new JTextField("0");
        Display.setEditable(false);
        Display.setPreferredSize(new Dimension(this.getWidth(), 60));
        Display.setFont(new Font("Arial", Font.PLAIN, 36));
        Display.setBackground(Color.WHITE);
        Display.setHorizontalAlignment(JTextField.RIGHT);
        Display.setBorder(new LineBorder(Color.BLACK));
        
        JPanel keyPanel = new JPanel();
        keyPanel.setBackground(new Color(172, 240, 241));
        keyPanel.setLayout(new GridLayout(6, 6, 5, 5));
        
        keyPanel.setLayout(new GridLayout(6,6,5,5));
        MyButton[] StandardButton = new MyButton[36];
        for (MyButton standardButton : StandardButton) {
            standardButton = new MyButton();
            keyPanel.add(standardButton);
        }
        keyPanel.getComponent(31).setBackground(new Color(48,168,191));
        keyPanel.getComponent(0).setBackground(new Color(48,168,191));
        keyPanel.getComponent(6).setBackground(new Color(48,168,191));
        keyPanel.getComponent(12).setBackground(new Color(48,168,191));
        keyPanel.getComponent(18).setBackground(new Color(48,168,191));
        keyPanel.getComponent(24).setBackground(new Color(48,168,191));
        keyPanel.getComponent(30).setBackground(new Color(48,168,191));
        
       this.getContentPane().add(Display, BorderLayout.NORTH);
       this.getContentPane().add(keyPanel,BorderLayout.CENTER);
        
    }
;
}
