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
      super("::예매 내역 확인::");
      Container cp = getContentPane();
      cp.add(p, "Center");
      p.setBackground(Color.white);
      pNorth.setLayout(card);
      lbNext = new JLabel();
      pNorth.setBackground(Color.white);
      pNorth.add(lbNext, "East");

      
      lbup = new JLabel("                  가는 날짜                                                             ");
      lbup.setFont(new Font("Sans-Serif", Font.PLAIN|Font.BOLD, 25));
      p.add(lbup);
      
      // Bus 출발지
      
      tfStart = new JTextField((String) temp[0], 13);
      p1.add(tfStart);
      tfStart.setBorder(new TitledBorder("출발지"));
      tfStart.setEditable(false);
      p.add(p1);

      // Bus 가는날 날짜설정

      tfi = new JTextField((String) temp[12], 20);
      p2.add(tfi);
      tfi.setBorder(new TitledBorder("가는날"));
      tfi.setEditable(false);
      p.add(p2);
      
      // 도착지 
      tfStart2 = new JTextField((String) temp[1], 13);
      p3.add(tfStart2);
      tfStart2.setBorder(new TitledBorder("도착지"));
      tfStart2.setEditable(false);
      p.add(p3);

      // Bus 도착예정시간

      tsets2 = new JTextField("" + temp[2] + "시", 20);
      p4.add(tsets2);
      tsets2.setBorder(new TitledBorder("출발 시간"));
      tsets2.setEditable(false);
      p.add(p4);         
      
      // Bus 금액
      
      tmoney = new JTextField("" + temp[4] + "원", 35);
      p5.add(tmoney);
      tmoney.setBorder(new TitledBorder("가격"));
      tmoney.setEditable(false);
      p.add(p5);

      // Bus 등급

      tgrade = new JTextField((String) temp[5], 35);
      p6.add(tgrade);
      tgrade.setBorder(new TitledBorder("등급"));
      tgrade.setEditable(false);
      p.add(p6);

      // 아래
      lbdown = new JLabel("                  오는 날짜                                                          ");
      lbdown.setFont(new Font("Sans-Serif", Font.PLAIN|Font.BOLD, 25));
      p.add(lbdown, "south");
      
      // Bus22 오는날 출발지
      
      tfRestart = new JTextField((String) temp[6],13);
      p7.add(tfRestart);
      tfRestart.setBorder(new TitledBorder("출발지"));
      tfRestart.setEditable(false);
      p.add(p7);
      
      // Bus22 오는날 출발시간 날짜!
      
      tfi2 = new JTextField((String) temp[13], 20);
      p8.add(tfi2);
      tfi2.setBorder(new TitledBorder("오는 날"));
      tfi2.setEditable(false);
      p.add(p8);
      
      // Bus22 오는날 도착지 
      tfStart2 = new JTextField((String) temp[7], 13);
      p9.add(tfStart2);
      tfStart2.setBorder(new TitledBorder("도착지"));
      tfStart2.setEditable(false);
      p.add(p9);

      // Bus22 오는날 도착시간 

      tsets2 = new JTextField("" + temp[8] + "시", 20);
      p10.add(tsets2);
      tsets2.setBorder(new TitledBorder("출발  시간"));
      tsets2.setEditable(false);
      p.add(p10);
      
      // Bus 금액2
      
      tmoney2 = new JTextField("" + temp[10] + "원", 35);
      p11.add(tmoney2);
      tmoney2.setBorder(new TitledBorder("가격"));
      tmoney2.setEditable(false);
      p.add(p11);

      // Bus 등급2

      tgrade2 = new JTextField((String) temp[11], 35);
      p12.add(tgrade2);
      tgrade2.setBorder(new TitledBorder("등급"));
      tgrade2.setEditable(false);
      p.add(p12);
      
      
      

      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

   }
   
     public Insets getInsets() {
        return new Insets(50,0,80,0); 
        }

}