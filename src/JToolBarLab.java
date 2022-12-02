/*  Programmer: Albert Duenas
JToolBar Lab
Date: 11/30/22
Version: 1.2
Description: This program gives the user an option to click one of three buttons and depending on the button they click
it will show the results for it. The buttons are displayed on a toolbar.*/


//JDemoToolBar.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JToolBarLab extends JFrame implements ActionListener{
    BorderLayout bord = new BorderLayout();
    JTextArea edit = new JTextArea(8,30);
    JScrollPane scroll = new
            JScrollPane(edit,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,

            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    JPanel pane = new JPanel();
    JButton b1 = new JButton("Math");
    JButton b2 = new JButton("Computer");
    JButton b3 = new JButton("Business");
    JToolBar bar = new JToolBar();

    public JToolBarLab()
    {
        super("Event Handlers Toolbar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bar.add(b1);
        bar.add(b2);
        bar.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        pane.setLayout(bord);
        pane.add(scroll);
        pane.add(edit,BorderLayout.NORTH);
        pane.add(bar);
        setContentPane(pane);
    }

    public static void main(String[] arguments)
    {
        JFrame tFrame = new JToolBarLab();
        tFrame.setSize(400,200);
        tFrame.setVisible(true);
    }




    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == b1)
        {
            edit.append("\nOur Math Courses are:\nAlgebra, Geometry, Trigonometry, Calculus\n");
        }
        else if (source == b2)
        {
            edit.append("\nOur Computer Courses are:\nIntro to Comp Sci, Data Structures, Algorithm, Operating Systems\n");
        }
        else if (source == b3)
        {
            edit.append("\nOur business courses are:\nAccounting, Management, Human Resources, Economics\n");
        }
    }
}
