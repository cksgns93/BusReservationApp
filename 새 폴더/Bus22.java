package Pr;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Bus22 extends JFrame {
   JPanel pNorth = new JPanel(new BorderLayout());
   JPanel p = new JPanel();
   JPanel p1 = new JPanel();
   JPanel p2 = new JPanel();
   JPanel p3 = new JPanel();
   JPanel p4 = new JPanel();
   JPanel p5 = new JPanel();
   JPanel p6 = new JPanel();
   JPanel p7 = new JPanel();
   JPanel p8 = new JPanel();
   JPanel p9 = new JPanel();
   JPanel p10 = new JPanel();
   JPanel p11 = new JPanel();
   JPanel p12 = new JPanel();
   JPanel p13 = new JPanel();
  

   JTextField tfStart,tfStart2, tfRestart,tfi2,tsets2, tmoney,tmoney2, tgrade,tgrade2, 
   tfi, tftime, tfg, tfset;
   JLabel lb1, lb2, lb3, lb4, lb5, lb6;
   JLabel lbNext, lbHome, lbinfo, lbdown,lbstart,lbup;

 //  JTextArea ta1;
   CardLayout card = new CardLayout();
//   BusList bif;

   public Bus22(Object[] temp) {
      super("::���� ���� Ȯ��::");
      Container cp = getContentPane();
      cp.add(p, "Center");
      p.setBackground(Color.white);
      pNorth.setLayout(card);
      lbNext = new JLabel();
      pNorth.setBackground(Color.white);
      pNorth.add(lbNext, "East");

      
      lbup = new JLabel("                  ���� ��¥                                                             ");
      lbup.setFont(new Font("Sans-Serif", Font.PLAIN|Font.BOLD, 25));
      p.add(lbup);
      
      // Bus �����
      
      tfStart = new JTextField((String) temp[0], 13);
      p1.add(tfStart);
      tfStart.setBorder(new TitledBorder("�����"));
      tfStart.setEditable(false);
      p.add(p1);

      // Bus ���³� ��¥����

      tfi = new JTextField((String) temp[12], 20);
      p2.add(tfi);
      tfi.setBorder(new TitledBorder("���³�"));
      tfi.setEditable(false);
      p.add(p2);
      
      // ������ 
      tfStart2 = new JTextField((String) temp[1], 13);
      p3.add(tfStart2);
      tfStart2.setBorder(new TitledBorder("������"));
      tfStart2.setEditable(false);
      p.add(p3);

      // Bus ���������ð�

      tsets2 = new JTextField("" + temp[2] + "��", 20);
      p4.add(tsets2);
      tsets2.setBorder(new TitledBorder("��� �ð�"));
      tsets2.setEditable(false);
      p.add(p4);         
      
      // Bus �ݾ�
      
      tmoney = new JTextField("" + temp[4] + "��", 35);
      p5.add(tmoney);
      tmoney.setBorder(new TitledBorder("����"));
      tmoney.setEditable(false);
      p.add(p5);

      // Bus ���

      tgrade = new JTextField((String) temp[5], 35);
      p6.add(tgrade);
      tgrade.setBorder(new TitledBorder("���"));
      tgrade.setEditable(false);
      p.add(p6);

      // �Ʒ�
      lbdown = new JLabel("                  ���� ��¥                                                          ");
      lbdown.setFont(new Font("Sans-Serif", Font.PLAIN|Font.BOLD, 25));
      p.add(lbdown, "south");
      
      // Bus22 ���³� �����
      
      tfRestart = new JTextField((String) temp[6],13);
      p7.add(tfRestart);
      tfRestart.setBorder(new TitledBorder("�����"));
      tfRestart.setEditable(false);
      p.add(p7);
      
      // Bus22 ���³� ��߽ð� ��¥!
      
      tfi2 = new JTextField((String) temp[13], 20);
      p8.add(tfi2);
      tfi2.setBorder(new TitledBorder("���� ��"));
      tfi2.setEditable(false);
      p.add(p8);
      
      // Bus22 ���³� ������ 
      tfStart2 = new JTextField((String) temp[7], 13);
      p9.add(tfStart2);
      tfStart2.setBorder(new TitledBorder("������"));
      tfStart2.setEditable(false);
      p.add(p9);

      // Bus22 ���³� �����ð� 

      tsets2 = new JTextField("" + temp[8] + "��", 20);
      p10.add(tsets2);
      tsets2.setBorder(new TitledBorder("���  �ð�"));
      tsets2.setEditable(false);
      p.add(p10);
      
      // Bus �ݾ�2
      
      tmoney2 = new JTextField("" + temp[10] + "��", 35);
      p11.add(tmoney2);
      tmoney2.setBorder(new TitledBorder("����"));
      tmoney2.setEditable(false);
      p.add(p11);

      // Bus ���2

      tgrade2 = new JTextField((String) temp[11], 35);
      p12.add(tgrade2);
      tgrade2.setBorder(new TitledBorder("���"));
      tgrade2.setEditable(false);
      p.add(p12);
      
      
      

      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

   }
   
     public Insets getInsets() {
        return new Insets(50,0,80,0); 
        }

}