/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.*; // import the ArrayList class


/**
 *
 * @author User
 */
public class StandardLayer extends JPanel {
    
    private ArrayList<MyButton> StandardButton = new ArrayList();
    public JLabel Display = new JLabel("0");
    public ArrayList<MyButton> getStandardButton()
    {
       return  StandardButton;   
    }
    
    public StandardLayer()
    {
        this.setSize(1000, 500);
        buildContendPane();
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
        
        this.setLayout(new GridBagLayout());
        Display.setFont(new Font("Arial", Font.PLAIN, 25));
        Display.setHorizontalAlignment(JTextField.RIGHT);
        Display.setBorder(new LineBorder(Color.BLACK));
        Display.setBorder(new LineBorder(Color.BLACK));
        
        JPanel keyPanel = new JPanel();
        keyPanel.setBackground(new Color(172, 240, 241));
        keyPanel.setLayout(new GridLayout(6,6,5,5));
        
        
        for(int i = 0 ; i < 36 ; i++)
        {
            StandardButton.add(new MyButton());
            keyPanel.add(StandardButton.get(i));
        }
        
        this.setButtonText(StandardButton,0,"log∎∎");
        this.setButtonText(StandardButton,1,"π");
        this.setButtonText(StandardButton,2,"(");
        this.setButtonText(StandardButton,3,")");
        this.setButtonText(StandardButton,4,"%");
        this.setButtonText(StandardButton,5,"DELETE");
        this.setButtonText(StandardButton,6,"∜");
        this.setButtonText(StandardButton,7,"ln");
        this.setButtonText(StandardButton,8,"mod");
        this.setButtonText(StandardButton,9,"CE");
        this.setButtonText(StandardButton,10,"C");
        this.setButtonText(StandardButton,11,"+");
        this.setButtonText(StandardButton,12,"∛");
        this.setButtonText(StandardButton,13,"log");
        this.setButtonText(StandardButton,14,"7");
        this.setButtonText(StandardButton,15,"8");
        this.setButtonText(StandardButton,16,"9");
        this.setButtonText(StandardButton,17,"-");
        this.setButtonText(StandardButton,18,"∛");
        this.setButtonText(StandardButton,19,"sin");
        this.setButtonText(StandardButton,20,"4");
        this.setButtonText(StandardButton,21,"5");
        this.setButtonText(StandardButton,22,"6");
        this.setButtonText(StandardButton,23,"×");
        this.setButtonText(StandardButton,24,"√∎");
        this.setButtonText(StandardButton,25,"cos");
        this.setButtonText(StandardButton,26,"1");
        this.setButtonText(StandardButton,27,"2");
        this.setButtonText(StandardButton,28,"3");
        this.setButtonText(StandardButton,29,"÷");
        this.setButtonText(StandardButton,30,"χ∎");
        this.setButtonText(StandardButton,31,"tan");
        this.setButtonText(StandardButton,32,"+/-");
        this.setButtonText(StandardButton,33,"0");
        this.setButtonText(StandardButton,34,".");
        this.setButtonText(StandardButton,35,"=");
       
        
        
         for(int i = 6 ; i < 9 ; i++)
        {
            StandardButton.get(i).setEnabled(false);
        }
          for(int i = 12 ; i < 14 ; i++)
        {
            StandardButton.get(i).setEnabled(false);
        }
           for(int i = 18 ; i < 20 ; i++)
        {
            StandardButton.get(i).setEnabled(false);
        }
            for(int i = 24 ; i < 26 ; i++)
        {
            StandardButton.get(i).setEnabled(false);
        }
            for(int i = 30 ; i < 32 ; i++)
        {
            StandardButton.get(i).setEnabled(false);
        }
        
        setCell(0,2,3,6,1,1,c);
        this.add(keyPanel,c);
        setCell(0,0,6,1,0.3,0.3,c);
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
    
    void setButtonText(ArrayList<MyButton> AllButton,int inx,String name)
    {
        AllButton.get(inx).setText(name);
        
    }
    
}
