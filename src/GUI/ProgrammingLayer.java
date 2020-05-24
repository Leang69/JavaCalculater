/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*; // import the ArrayList class


/**
 *
 * @author User
 */
public class ProgrammingLayer extends MyFrame{
    public ProgrammingLayer(String title) {
        this.iniFrame(title, 1000, 500);   
    }
    private class MyButton extends JButton 
    {
        MyButton()
        {
            this.setBackground(new Color(152, 222, 224));
            this.setBorder(null);
            this.setFont(new Font("Arial", Font.BOLD, 25));
        }
    }
    
    @Override 
    void buildContendPane() {
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1 ; 
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH; 
        c.insets = new Insets(5,5,5,5);
        
        this.setLayout(new GridBagLayout());
        
        
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
        
        ArrayList<MyButton> ProgrammingButton =new ArrayList();
        for(int i = 0 ; i < 36 ; i++)
        {
            ProgrammingButton.add(new MyButton());
            keyPanel.add(ProgrammingButton.get(i));
        }
        
        keyPanel.getComponent(0).setBackground(new Color(48,168,191));
        keyPanel.getComponent(6).setBackground(new Color(48,168,191));
        keyPanel.getComponent(12).setBackground(new Color(48,168,191));
        keyPanel.getComponent(18).setBackground(new Color(48,168,191));
        keyPanel.getComponent(24).setVisible(false);
        keyPanel.getComponent(30).setVisible(false);
        keyPanel.getComponent(31).setVisible(false);
        
        
        this.setButtonText(ProgrammingButton,0,"HEX");
        this.setButtonText(ProgrammingButton,1,"A");
        this.setButtonText(ProgrammingButton,2,"(");
        this.setButtonText(ProgrammingButton,3,")");
        this.setButtonText(ProgrammingButton,4,"Ans");
        this.setButtonText(ProgrammingButton,5,"DELETE");
        this.setButtonText(ProgrammingButton,6,"DEC");
        this.setButtonText(ProgrammingButton,7,"B");
        this.setButtonText(ProgrammingButton,8,"<<");
        this.setButtonText(ProgrammingButton,9,">>");
        this.setButtonText(ProgrammingButton,10,"C");
        this.setButtonText(ProgrammingButton,11,"+");
        this.setButtonText(ProgrammingButton,12,"BIN");
        this.setButtonText(ProgrammingButton,13,"C");
        this.setButtonText(ProgrammingButton,14,"7");
        this.setButtonText(ProgrammingButton,15,"8");
        this.setButtonText(ProgrammingButton,16,"9");
        this.setButtonText(ProgrammingButton,17,"-");
        this.setButtonText(ProgrammingButton,18,"OCT");
        this.setButtonText(ProgrammingButton,19,"D");
        this.setButtonText(ProgrammingButton,20,"4");
        this.setButtonText(ProgrammingButton,21,"5");
        this.setButtonText(ProgrammingButton,22,"6");
        this.setButtonText(ProgrammingButton,23,"×");
        this.setButtonText(ProgrammingButton,24,"√∎");
        this.setButtonText(ProgrammingButton,25,"F");
        this.setButtonText(ProgrammingButton,26,"1");
        this.setButtonText(ProgrammingButton,27,"2");
        this.setButtonText(ProgrammingButton,28,"3");
        this.setButtonText(ProgrammingButton,29,"÷");
        this.setButtonText(ProgrammingButton,30,"χ∎");
        this.setButtonText(ProgrammingButton,31,"tan");
        this.setButtonText(ProgrammingButton,32,"+/-");
        this.setButtonText(ProgrammingButton,33,"0");
        this.setButtonText(ProgrammingButton,34,".");
        this.setButtonText(ProgrammingButton,35,"=");
        
        
        
       setCell(0,2,3,6,1,1,c);
       this.getContentPane().add(keyPanel,c);
       setCell(0,0,6,1,0.3,0.3,c);
       this.getContentPane().add(Display,c);
        
    }
    private void setButtonText(ArrayList<MyButton> AllButton,int inx,String name)
    {
        AllButton.get(inx).setText(name);  
    }
}
