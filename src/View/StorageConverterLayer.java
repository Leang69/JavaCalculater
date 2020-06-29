/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import javax.swing.*;
import java.awt.Dimension;
import java.util.*;

/**
 *
 * @author User
 */
public class StorageConverterLayer extends JPanel{
    public StorageConverterLayer() {
         this.setSize(1000, 500);
         buildContendPane();
    }

    class MyButton extends JButton 
    {
         MyButton()
         {
            this.setBackground(new Color(152, 222, 224));
            this.setBorder(null);
            this.setFont(new Font("Arial", Font.BOLD, 25));
         }   
    }

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
        String[] StorageType = {"Bytes","Kilobytes","Kibibytes","Megabytes",
                                "Gigabytes","Terabytes","Petabyte"};
        JTextField A = new JTextField("");
        JTextField B = new JTextField("");
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
        
        setCell(0,0,6,3,1,1,c);
        Display.add(A,c);
        setCell(0,3,3,3,0.1,0.1,c);
        Display.add(typeA,c);
        setCell(0,6,6,3,1,1,c);
        Display.add(B,c);
        setCell(0,9,3,3,0.1,0.1,c);
        Display.add(typeB,c);


        JPanel keyPanel = new JPanel(new GridLayout(4,3,5,5));
        keyPanel.setBackground(new Color(172, 240, 241));
        
        
        
        ArrayList<MyButton> AllButton = new ArrayList();
        for(int i = 0 ; i < 12 ; i++)
        {
            AllButton.add(new MyButton());
            keyPanel.add(AllButton.get(i));
        }
       
        this.setButtonText(AllButton,0,"7");
        this.setButtonText(AllButton,1,"8");
        this.setButtonText(AllButton,2,"9");
        this.setButtonText(AllButton,3,"4");
        this.setButtonText(AllButton,4,"5");
        this.setButtonText(AllButton,5,"6");
        this.setButtonText(AllButton,6,"1");
        this.setButtonText(AllButton,7,"2");
        this.setButtonText(AllButton,8,"3");
        this.setButtonText(AllButton,9,"CE");
        this.setButtonText(AllButton,10,"0");
        this.setButtonText(AllButton,11,"Backspace");
   
        
        setCell(3,0,6,6,1,1,c);
        this.add(keyPanel,c);
        setCell(0,0,3,6,0.7,0.7,c);
        this.add(Display,c);
 
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
    
    private void setButtonText(ArrayList<MyButton> AllButton,int inx,String name)
    {
        AllButton.get(inx).setText(name);  
    }
 
}
