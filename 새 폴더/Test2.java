package Pr;


import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class Test2 extends JFrame{

   JFrame frame;
   JPanel panel;
   JButton close;
   String[] choices = new String[]{
              "서울","강원"
   };
   String[] choices2 = new String[]{
           "인천","경기","서울","대전","강원"        
   };
   JComboBox<String> comboBox = new JComboBox<>(choices);
   JComboBox<String> comboBox2 = new JComboBox<>(choices2);
   JTextComponent textComponent,textComponent2;

   public Test2(JTextArea parent1, JTextArea parent2){

       frame = new JFrame();
       panel = new JPanel();
       textComponent = (JTextComponent) comboBox.getEditor().getEditorComponent();
       textComponent2 = (JTextComponent) comboBox2.getEditor().getEditorComponent();
       
       frame.setSize(300, 100);
       frame.setResizable(false);

       panel.setLayout(new FlowLayout());

       comboBox.setEditable(true);
       comboBox.setSelectedItem(null);
       comboBox2.setEditable(true);
       comboBox2.setSelectedItem(null);
       close=new JButton("적용하기");
       
       panel.add(comboBox);
       panel.add(comboBox2);
       panel.add(close);
       frame.add(panel);
       frame.setLocationRelativeTo(parent1);
       frame.setVisible(true);
       
       close.addActionListener((e)->{
          Object obj = e.getSource();
          if(obj==close) {
              parent1.setText(""+comboBox.getSelectedItem().toString());
              parent2.setText(""+comboBox2.getSelectedItem().toString());
          }
         frame.setVisible(false);
         frame.dispose();
       });
       
       this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   }
}