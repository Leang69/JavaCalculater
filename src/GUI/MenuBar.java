/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
/**
 *
 * @author User
 */
public class MenuBar extends JMenuBar{
    private JMenu Standard , Programmer , StorageConverter , SetTheory;
    MenuBar()
    {
        Standard = new JMenu("Standard");
        Programmer = new JMenu("Programmer");
        StorageConverter = new JMenu("StorageConverter");
        SetTheory = new JMenu("SetTheory");
        this.add(Standard);
        this.add(Programmer);
        this.add(StorageConverter);
        this.add(SetTheory);
    }
}
