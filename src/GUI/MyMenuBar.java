/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author User
 */
public class MyMenuBar extends JMenuBar{
    private JMenu Standard , Programmer , StorageConverter , SetTheory;
    private Font MenuBarFont = new Font("Arial", Font.BOLD, 14);
    MyMenuBar()
    {
        this.setBackground(new Color(152, 222, 224));
        Standard = new JMenu("Standard");
        Programmer = new JMenu("Programmer");
        StorageConverter = new JMenu("StorageConverter");
        SetTheory = new JMenu("SetTheory");
        Standard.setFont(MenuBarFont);
        Programmer.setFont(MenuBarFont);
        StorageConverter.setFont(MenuBarFont);
        SetTheory.setFont(MenuBarFont);
        this.add(Standard);
        this.add(Programmer);
        this.add(StorageConverter);
        this.add(SetTheory);
    }
}