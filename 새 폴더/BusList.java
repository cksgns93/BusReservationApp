package Pr;

import java.awt.Color;
import java.awt.Container;
import java.util.Vector;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BusList extends JFrame {
   JPanel p = new JPanel();
   JTable table; //View
   JButton btClose;
   int b;
   DefaultTableModel model; //Model (data�� ���´�)
   Object [][] data= {
            {"����","��õ", 9, 3, 6900, "�Ϲ�"},
            {"����","��õ", 13, 10, 6900, "�Ϲ�"},
            {"����","��õ", 15, 22, 9800, "�����̾�"},
            {"����","��õ", 17, 17, 8800, "���"},
            {"����","���", 10, 20, 8000, "�Ϲ�"},
            {"����","���", 14, 17, 8000, "�Ϲ�"},
            {"����","���", 17, 5, 11000, "�����̾�"},
            {"����","����", 10, 20, 18000, "���"},
            {"����","����", 12, 35, 16000, "�Ϲ�"},
            {"����","����", 16, 37, 16000, "�Ϲ�"},
            {"����","����", 9, 37, 12000, "�Ϲ�"},
            {"����","����", 12, 8, 15000, "�����̾�"},
            {"����","����", 15, 17, 13000, "���"},
            {"����","��õ", 10, 3, 7900, "�Ϲ�"},
            {"����","��õ", 13, 10, 7900, "�Ϲ�"},
            {"����","��õ", 15, 22, 9800, "�����̾�"},
            {"����","��õ", 17, 17, 8800, "���"},
            {"����","��õ", 20, 5,7900, "�Ϲ�"},
            {"����","���", 10, 20, 10000, "�Ϲ�"},
            {"����","���", 14, 17, 10000, "�Ϲ�"},
            {"����","���", 17, 5, 13000, "�����̾�"},
            {"����","����", 10, 1, 18000, "���"},
            {"����","����", 12, 20, 16000, "�Ϲ�"},
            {"����","����", 16, 35, 16000, "�Ϲ�"},
            {"����","����", 9, 37, 12000, "�Ϲ�"},
            {"����","����", 12, 8, 15000, "�����̾�"},
            {"����","����", 15, 15, 13000, "���"},     
   };
   String [] colHeader= {"���","����","�ð�","�¼���","����","���"};
   public BusList(MyRes parent,Object[] temp,int c) {
      super("::BusList::");
      Container cp = getContentPane();
      cp.add(p, "Center");
      p.setBackground(Color.white);
      table= new JTable(); //view
      model = new DefaultTableModel(data,colHeader); //��
      Vector <Integer> tt = new Vector <Integer>();

      b=c;
      if(b==1) {
    	  for(int i=0;i<model.getRowCount();i++) {
    	         if(!(data[i][0].equals(parent.Tchul.getText()))||!(data[i][1].equals(parent.Tdo.getText()))) {
    	            tt.add(i);
    	         }
    	      }
	      int a=0;
	      for(int i=0;i<tt.size();i++) {
	         model.removeRow(tt.get(i)-a);
	         a++;
	      }
      }else if(b==2) {
    	  for(int i=0;i<model.getRowCount();i++) {
    	         if(!(data[i][0].equals(parent.Tdo.getText()))||!(data[i][1].equals(parent.Tchul.getText()))) {
    	            tt.add(i);
    	         }
    	      }
	      int a=0;
	      for(int i=0;i<tt.size();i++) {
	         model.removeRow(tt.get(i)-a);
	         a++;
	      }
      }
      
      table.setModel(model); //view�� �� ����
      
      p.add(new JScrollPane(table));
      table.setRowHeight(25);
      table.setSelectionBackground(Color.blue);
      table.setSelectionForeground(Color.white);
      btClose = new JButton("�����ϱ�");
      p.add(btClose);
      btClose.addActionListener(e->{
         parent.setVisible(false);
         parent.dispose();
         this.setVisible(false);
         this.dispose();
         if(b==2) {
        	 int row = table.getSelectedRow();
             for(int i=6;i<table.getColumnCount()+6;i++) {
            	 temp[i]=model.getValueAt(row, i-6);
            	 System.out.println(temp[i]);
             }
         }
         else if(b==1) {
        	 int row = table.getSelectedRow();
             for(int i=0;i<table.getColumnCount();i++) {
            	 temp[i]=model.getValueAt(row, i);
            	 System.out.println(temp[i]);
             }
         }
      });
      
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   public static void main(String[] args) {

   }
}

