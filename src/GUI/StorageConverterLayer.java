/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.Dimension;
import java.util.*;

/**
 *
 * @author User
 */
public class StorageConverterLayer extends MyFrame{
    public StorageConverterLayer(String title) {
        this.buildContendPane();
        this.setTitle(title);
        this.setJMenuBar(new MyMenuBar());
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1000,500));
        //this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
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
    
    void setCell(int posX , int posY , int w , int h,GridBagConstraints c)
     {
            c.gridx = posX;
            c.gridy = posY;
            c.gridwidth = w;
            c.gridheight = h;
    }
    
    @Override 
    void buildContendPane() {
        
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1 ; 
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH; 
        c.insets = new Insets(5,5,5,5);
        
        this.setLayout(new GridBagLayout());
        
        
        
        JPanel Display = new JPanel();
        Display.setLayout(new GridBagLayout());
        
        //set tpye 
        String[] StorageType = {"Bits" , "Bytes","Kilobits","Kibibits","Kilobytes","Kibibytes","Megabits","Mebibits","Megabytes", "Mebibytes",
                                "Gigabits","Gibibits","Gigabytes","Givibytes","Terabits","Tebibits","Terabytes","Tebibytes"};
        JTextField A = new JTextField("1000");
        JTextField B = new JTextField("1000");
        JComboBox  typeA = new JComboBox (StorageType);
        JComboBox  typeB = new JComboBox(StorageType);
        
        //Set TextField Style
        A.setFont(new Font("Arial", Font.PLAIN, 25));
        B.setFont(new Font("Arial", Font.PLAIN, 25));
        A.setEditable(false);
        B.setEditable(false);
        A.setBackground(Color.WHITE);
        B.setBackground(Color.WHITE);
        
        //set combo Box
        typeA.setFont(new Font("Arial", Font.PLAIN, 20));
        typeB.setFont(new Font("Arial", Font.PLAIN, 20));

        
        //set Gridlayout
        GridBagConstraints cD = new GridBagConstraints();
        cD.weightx = 1 ; 
        cD.weighty = 1;
        cD.fill = GridBagConstraints.BOTH; 
        cD.insets = new Insets(5,5,5,5);
        
        setCell(0,0,6,3,c);
        c.weightx = 1; 
        c.weighty = 1;
        Display.add(A,c);
        setCell(0,3,3,3,c);
        c.weightx = 0.1; 
        c.weighty = 0.1;
        Display.add(typeA,c);
        setCell(0,6,6,3,c);
        c.weightx = 1; 
        c.weighty = 1;
        Display.add(B,c);
        setCell(0,9,3,3,c);
        c.weightx = 0.1; 
        c.weighty = 0.1;
        Display.add(typeB,c);

        
        
        
        JPanel keyPanel = new JPanel(new GridLayout(4,3,5,5));
        keyPanel.setBackground(new Color(172, 240, 241));
        ArrayList<MyButton> AllButton = new ArrayList();
        for(int i = 0 ; i < 12 ; i++)
        {
            AllButton.add(new MyButton());
            keyPanel.add(AllButton.get(i));
        }
       
        this.setButtonText(AllButton,0,"9");
        this.setButtonText(AllButton,1,"8");
        this.setButtonText(AllButton,2,"DELETE");
        this.setButtonText(AllButton,3,"7");
        this.setButtonText(AllButton,4,"6");
        this.setButtonText(AllButton,5,"CE");
        this.setButtonText(AllButton,6,"4");
        this.setButtonText(AllButton,7,"5");
        this.setButtonText(AllButton,8,"3");
        this.setButtonText(AllButton,9,"2");
        this.setButtonText(AllButton,10,"1");
        this.setButtonText(AllButton,11,"0");
   
        c.weightx = 1; 
        c.weighty = 1;
        setCell(3,0,6,6,c);
        this.getContentPane().add(keyPanel,c);
        c.weightx = 0.7; 
        c.weighty = 0.7;
        setCell(0,0,3,6,c);
        this.getContentPane().add(Display,c);
 
    }
    private void setButtonText(ArrayList<MyButton> AllButton,int inx,String name)
    {
        AllButton.get(inx).setText(name);  
    }
 
}
