package HospitalManagement;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Index extends JFrame implements ActionListener
{
     JFrame f;
     JLabel l1,l2,l3;
     JButton b1,b2,b3,b4;
     
    Index()
    {
        f=new JFrame("Index page");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        
        l1=new JLabel();
        l1.setBounds(0,0,800,570);
        l1.setLayout(null);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("HospitalManagement/Icons/first page.jpg"));
        Image i1=img.getImage().getScaledInstance(800,570,Image.SCALE_DEFAULT);
        ImageIcon img1=new ImageIcon(i1);
        l1.setIcon(img1);
        
        l2=new JLabel("B.S.D Hospital");
        l2.setBounds(70,315,500,30);
        l2.setFont(new Font("Arial",Font.BOLD,30));
        l2.setForeground(Color.BLACK);
        l1.add(l2);
        f.add(l1);
      
        l3=new JLabel("Provide Best Quality Healthcare For You");
        l3.setBounds(86,340,500,30);
        l3.setFont(new Font("Arial",Font.BOLD,13));
        l3.setForeground(Color.BLACK);
        l1.add(l3);
        
        b1=new JButton("Doctor");
        b1.setBounds(50,390, 150, 40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        l1.add(b1);
        
        b2=new JButton("Patient");
        b2.setBounds(220,390, 150, 40);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        l1.add(b2);
        
        b3=new JButton("Receptionist");
        b3.setBounds(50,450, 150, 40);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        l1.add(b3);
        
        b4=new JButton("Admin");
        b4.setBounds(220,450, 150, 40);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        l1.add(b4);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        f.setSize(800,570);
        f.setLocation(300,100);
        f.setVisible(true);
        f.setResizable(false);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
         if(ae.getSource()==b1)    
         {
           f.setVisible(true);
           new LoginPage();
         }
         if(ae.getSource()==b2)    
         {
             f.setVisible(false);
             new LoginPage();
         } 
         if(ae.getSource()==b3)    
         {
             f.setVisible(false);
             new LoginPage();
         } 
         if(ae.getSource()==b4)    
         {
             f.setVisible(false);
             new LoginPage();
         } 
    }
     public static void main(String[] args)
     {
          new Index();
     }        
}

