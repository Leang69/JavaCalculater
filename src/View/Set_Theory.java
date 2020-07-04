/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*; // import the ArrayList class

/**
 *
 * @author User
 */
public class Set_Theory extends JPanel{
    private ArrayList<MyButton> SetTheoryButtons =new ArrayList();
    public JTextField setA , setB , Answer; 
    public JComboBox setOperators;
    public Set_Theory()
    {
       this.setSize(1000, 500);
       buildContendPane();
    }
    
    public ArrayList<MyButton> getSetTheoryButtons()
    {
        return SetTheoryButtons;
    }
    
    public class MyButton extends JButton 
    {
        MyButton()
        {
            this.setBackground(new Color(152, 222, 224));
            this.setBorder(null);
            this.setFont(new Font("Arial", Font.BOLD, 25));
        }
    }
    
    void buildContendPane()
    {
        
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH; 
        c.insets = new Insets(5,5,5,5);
        JPanel Display = new JPanel(new GridBagLayout());
        Display.setBackground(Color.WHITE);
        
        JLabel setALable = new JLabel("Set A");
        JLabel setBLable = new JLabel("Set B");
        setALable.setFont(new Font("Arial", Font.BOLD, 25 ));
        setBLable.setFont(new Font("Arial", Font.BOLD, 25 ));
        
        setA = new JTextField("");
        setB = new JTextField("");
        Answer = new JTextField();
        setA.setBackground(Color.WHITE);
        setB.setBackground(Color.WHITE);
        Answer.setBackground(Color.WHITE);
        
        
        
        setA.setFont(new Font("Cambria Math", Font.BOLD, 25 ));
        setB.setFont(new Font("Cambria Math", Font.BOLD, 25 ));
        Answer.setFont(new Font("Cambria Math", Font.BOLD, 25 ));
        setA.setEditable(false);
        setB.setEditable(false);
        Answer.setEditable(false);
        
        
        String[] setOperatorsName = {"Intersection (∩)" , "Union (∪)","Set Difference A-B","Set Difference B-A"};
        setOperators = new JComboBox(setOperatorsName);
        setOperators.setBackground(Color.WHITE);
        setOperators.setFont(new Font("Cambria Math", Font.BOLD, 25 ));
        
        this.setCell(0, 0, 1, 3, 0.1, 0.1, c);
        Display.add(setALable,c);
        
        this.setCell(0, 3, 1, 3, 0.1, 0.1, c);
        Display.add(setBLable,c);
        
        this.setCell(4,0,10,3,0.9,0.9,c);
        Display.add(setA,c);
        
        this.setCell(4,3,10,3,0.9,0.9,c);
        Display.add(setB,c);
        
        this.setCell(0,6,1,4,0.1,0.1,c);
        Display.add(setOperators,c);
        
        this.setCell(4,6,1,4,0.9,0.9,c);
        Display.add(Answer,c);
        
        
        JPanel keyPanel = new JPanel();
        keyPanel.setBackground(new Color(172, 240, 241));
        keyPanel.setLayout(new GridLayout(4,4, 5, 5));
        
        
        for(int i = 0 ; i < 16 ; i++)
        {
            SetTheoryButtons.add(new MyButton());
            keyPanel.add(SetTheoryButtons.get(i));
        }
        keyPanel.getComponent(12).setVisible(false);
        keyPanel.getComponent(15).setVisible(false);
        
        this.setButtonText(SetTheoryButtons,0,"7");
        this.setButtonText(SetTheoryButtons,1,"8");
        this.setButtonText(SetTheoryButtons,2,"9");
        this.setButtonText(SetTheoryButtons,3,"DELETE");
        this.setButtonText(SetTheoryButtons,4,"4");
        this.setButtonText(SetTheoryButtons,5,"5");
        this.setButtonText(SetTheoryButtons,6,"6");
        this.setButtonText(SetTheoryButtons,7,"CE");
        this.setButtonText(SetTheoryButtons,8,"1");
        this.setButtonText(SetTheoryButtons,9,"2");
        this.setButtonText(SetTheoryButtons,10,"3");
        this.setButtonText(SetTheoryButtons,11,"ENTER");
        this.setButtonText(SetTheoryButtons,12,"0");
        this.setButtonText(SetTheoryButtons,13,"0");
        this.setButtonText(SetTheoryButtons,14,",");
        this.setButtonText(SetTheoryButtons,15,"0");
        
        
        
   
        this.setLayout(new GridBagLayout());
        this.setCell(0, 0, 14, 4, 0.2, 0.2, c);
        this.add(Display,c);
        this.setCell(0, 4, 14, 10, 0.8, 0.8, c);
        this.add(keyPanel,c);
        
       
    }
    
     void setCell(int posX ,int posY ,int w ,int h,double weightx,double weighty,GridBagConstraints c)
    {
            c.gridx = posX;
            c.gridy = posY;
            c.gridwidth = w;
            c.gridheight = h;
            c.weightx = weightx;
            c.weighty = weighty;
    }
     
     public 
    
    void setButtonText(ArrayList<MyButton> ProgrammingButton,int inx,String name)
    {
        ProgrammingButton.get(inx).setText(name);
        
    }
}


