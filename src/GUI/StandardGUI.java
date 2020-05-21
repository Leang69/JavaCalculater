/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 *
 * @author User
 */
public class StandardGUI extends JFrame {
    public StandardGUI()
    {
        this.setJMenuBar(new MenuBar());
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setMinimumSize(new Dimension(1000,500));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout();
    };
    private class MyButton extends JButton 
    {
        MyButton()
        {
            this.setBackground(new Color(70, 200, 240));
        }
    }
    void setLayout()
    {
        JLabel Display = new JLabel("0",SwingConstants.RIGHT);
        Display.setPreferredSize(new Dimension(this.getWidth(),(int)(this.getHeight()*0.15)));
        Display.setFont(new Font("Arial",Font.PLAIN,36));
        JPanel keyPanel = new JPanel();
        Display.setSize(1000, 20);
        Display.setBorder(new LineBorder(Color.BLACK));
        
        Container containPane = this.getContentPane();
        containPane.setLayout(new BorderLayout(5,5));
        
        containPane.add(Display,BorderLayout.NORTH);
        keyPanel.setLayout(new GridLayout(6,6,5,5));
        MyButton[] StandardButton = new MyButton[36];
        for(MyButton standardButton : StandardButton)
        {
            standardButton = new MyButton();
            keyPanel.add(standardButton);
        }   
        
        containPane.add(keyPanel,BorderLayout.CENTER);
        
    }
}
