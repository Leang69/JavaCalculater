/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import javax.swing.*;

/**
 *
 * @author User
 */
abstract class MyFrame extends JFrame{
    void iniFrame(String title,int height , int weight)
    {
        this.buildContendPane();
        this.setTitle(title);
        this.setJMenuBar(new MyMenuBar());
        this.setVisible(true);
        this.setMinimumSize(new Dimension(height,weight));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    /**
     * 
     * @param posX
     * @param posY
     * @param w
     * @param h
     * @param weightx
     * @param weighty
     * @param c 
     */
    void setCell(int posX ,int posY ,int w ,int h,double weightx,double weighty,GridBagConstraints c)
    {
            c.gridx = posX;
            c.gridy = posY;
            c.gridwidth = w;
            c.gridheight = h;
            c.weightx = weightx;
            c.weighty = weighty;
    }
    abstract void buildContendPane();
}
