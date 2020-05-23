/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.*; // import the ArrayList class


/**
 *
 * @author User
 */
public class StandardLayer extends MyFrame {
    
    public StandardLayer(String title)
    {
        this.buildContendPane();
        this.setTitle(title);
        this.setJMenuBar(new MyMenuBar());
        this.setVisible(true);
        this.setMinimumSize(new Dimension(1000, 500));
        //this.setResizable(false);
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
    /*private class MyGridBagConstraints extends GridBagConstraints 
    {
        MyGridBagConstraints()
        {
            this.weightx = 1 ; 
            this.weighty = 1;
            this.fill = GridBagConstraints.BOTH; 
            this.insets = new Insets(5,5,5,5);
          
        }
        void setCell(int posX , int posY , int w , int h,int Anchor)
        {
            this.gridx = posX;
            this.gridy = posY;
            this.gridwidth = w;
            this.gridheight = h;
            this.anchor = Anchor;
        }
    }*/
    
    void setCell(int posX , int posY , int w , int h,GridBagConstraints c)
        {
            c.gridx = posX;
            c.gridy = posY;
            c.gridwidth = w;
            c.gridheight = h;
        }
    
    @Override 
    void buildContendPane()
    {
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1 ; 
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH; 
        c.insets = new Insets(5,5,5,5);
        
        this.setLayout(new GridBagLayout());
        JTextField Display = new JTextField("0");
        Display.setEditable(false);
        Display.setFont(new Font("Arial", Font.PLAIN, 25));
        Display.setBackground(Color.WHITE);
        Display.setHorizontalAlignment(JTextField.RIGHT);
        Display.setBorder(new LineBorder(Color.BLACK));
        Display.setBorder(new LineBorder(Color.BLACK));
        
        JPanel keyPanel = new JPanel();
        keyPanel.setBackground(new Color(172, 240, 241));
        keyPanel.setLayout(new GridLayout(6,6,5,5));
        
        ArrayList<MyButton> StandardButton = new ArrayList();
        for(int i = 0 ; i < 36 ; i++)
        {
            StandardButton.add(new MyButton());
            keyPanel.add(StandardButton.get(i));
        }
        
        this.setButtonText(StandardButton,0,"Leang");
        setCell(0,2,3,6,c);
        this.getContentPane().add(keyPanel,c);
        c.weightx = 0.3; 
        c.weighty = 0.3;
        setCell(0,0,6,1,c);
        this.getContentPane().add(Display,c);   
    }
    void setButtonText(ArrayList<MyButton> AllButton,int inx,String name)
    {
        AllButton.get(inx).setText(name);
    }
}
