/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author windows
 */



import javax.swing.*;
import java.awt.event.*;
public class Employ extends JFrame implements ActionListener{

   
       JLabel l;
       JCheckBox cb1,cb2,cb3 ,cb4, cb5, cb6, cb7;
       JButton b;
        String msg = " ";
         int amount = 0;
    Employ(){
      l=new JLabel("FOOD ORDERING SYSTEM");  
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(400,100);
    
    
    cb1 = new JCheckBox("pizza @ N100");
    cb1.setBounds(100,100,150,20);
    
    cb2 = new JCheckBox("burger @ N30");
    cb2.setBounds(100,150,150,20);
    
    cb3 = new JCheckBox("tea @ N10 ");
    cb3.setBounds(100,200,150,20);
    
        cb4 = new JCheckBox("apples @ N150 ");
    cb4.setBounds(100,250,150,20);
    
        cb5 = new JCheckBox("doughnuts @ 300 ");
    cb5.setBounds(100,300,150,20);
    
        cb6 = new JCheckBox("sharwarma @ 1000");
    cb6.setBounds(100,350,150,20);
    
        cb7 = new JCheckBox("hollandia @ N650 ");
    cb7.setBounds(100,400,150,20);
    
    
    b = new JButton("Place Order");
    b.setBounds(100,450,150,50);
    
     b.addActionListener(this);

 
   
         
   
 
 
  
    
    
    
    add(l);
    add(cb1);
    add(cb2);
    add(cb3);
    add(cb4);
    add(cb5);
    add(cb6);
    add(cb7);
    add(b);
    
    setSize(500,500);
   
    setLayout(null);
    setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent e){
        
             try{
             
                 if(cb1.isSelected()){
                 amount += 100;
                 msg += "Pizza @N100\n";
                 }
                 
                  if(cb2.isSelected()){
                 amount += 30;
                 msg += "Burger @N30\n";
                 }
                  
                   if(cb3.isSelected()){
                 amount += 10;
                 msg += "Tea @N10\n";
                 }
                   
                    if(cb4.isSelected()){
                 amount += 150;
                 msg += "Apples @N150\n";
                 }
                 
                     if(cb5.isSelected()){
                 amount += 300;
                 msg += "Doughnut @N300\n";
                 }
                 
                      if(cb6.isSelected()){
                 amount += 1000;
                 msg += "Sharwarma @N1000\n";
                 }
                      
                       if(cb7.isSelected()){
                 amount += 650;
                 msg += "Sharwarma @N650\n";
                 }
                       
                       msg += "===================\n";
                        
                 
                 JOptionPane.showMessageDialog(this,msg+"Total: "+amount);
                 
                 
                 
             
             }
             catch(Exception ev){
             System.out.println(ev);
             }
             
           
             
             
             
         }
        
            
        
  
    
    public static void main(String args[]){
   new Employ();
       

    
    }
    
    }
    
    
    

