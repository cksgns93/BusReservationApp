package Pr;

import javax.swing.*;

import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;


public class MyRes extends JFrame {
   JPanel p1, p2, p3, p4, p5, p6 ,pGrade;
   JButton Ow, Rt, Lu ,Tga,To;
   JRadioButton SA, S1, S2, S3;
   JLabel back;
   JTextArea Tchul, Tdo;
   
   public MyRes(Object[] temp) {
      super("::고속버스 예매::");
      Container cp = getContentPane();
      //위에 바
      p6 = new JPanel();
      cp.add(p6,"North");
      p6.setBackground(Color.lightGray);
      back=new JLabel(new ImageIcon("images/111.PNG"));
      p6.setLayout(new FlowLayout(FlowLayout.LEFT));
      p6.add(back);
      MyHandler my = new MyHandler();
      back.addMouseListener(my);
      
      //편도 왕복
      p1 = new JPanel();
      cp.add(p1, "Center");
      p1.setBackground(Color.white);
      p1.setLayout(new FlowLayout());
      Ow = new JButton("편도");
      Rt = new JButton("왕복");
      Ow.setPreferredSize(new Dimension(225, 40));
      Rt.setPreferredSize(new Dimension(225, 40));
      p1.add(Ow);
      p1.add(Rt);
      //출발지 선택지
      Tchul = new JTextArea("",10,20);
      Tchul.setBackground(Color.lightGray);
      Tdo = new JTextArea("",10,20);
      Tdo.setBackground(Color.lightGray);
      Tchul.setBorder(new TitledBorder("출발지"));
      Tdo.setBorder(new TitledBorder("도착지"));
      p1.add(Tchul);
      p1.add(Tdo);
      Tchul.addMouseListener(my);
      Tdo.addMouseListener(my);
      
      //가는날 편도,왕복
      Tga= new JButton();
      Tga.setBorder(new TitledBorder("가는날"));
      Tga.setBackground(Color.LIGHT_GRAY);
      Tga.setPreferredSize(new Dimension(450, 200));
      To = new JButton();
      To.setBorder(new TitledBorder("오는날"));
      To.setBackground(Color.LIGHT_GRAY);
      p3 = new JPanel();
      p3.add(new JScrollPane(Tga));
      p3.add(new JScrollPane(To));
      p1.add(new JScrollPane(p3));
      //등급  라디오로 바꾸기
      SA= new JRadioButton("전체");
      S1= new JRadioButton("프리미엄");
      S2= new JRadioButton("우등");
      S3= new JRadioButton("일반");
      ButtonGroup SSS = new ButtonGroup();
      SSS.add(SA);
      SSS.add(S1);
      SSS.add(S2);
      SSS.add(S3);
      SA.setPreferredSize(new Dimension(110, 40));
      S1.setPreferredSize(new Dimension(110, 40));
      S2.setPreferredSize(new Dimension(110, 40));
      S3.setPreferredSize(new Dimension(110, 40));
      p4= new JPanel();
      p4.add(SA);
      p4.add(S1);
      p4.add(S2);
      p4.add(S3);
      p1.add(p4);
      //조회 버튼 영역
      Lu = new JButton("조회하기");
      Lu.setPreferredSize(new Dimension(480, 50));
      p2 = new JPanel();
      p2.setLayout(new GridLayout(1,1,10,10));
      cp.add(p2,BorderLayout.SOUTH);
      p2.add(Lu);
      
      //Action 처리
      Ow.addActionListener((e)->{
         Tga.setPreferredSize(new Dimension(450, 200));
         To.setPreferredSize(new Dimension(0, 0));
         p3.add(new JScrollPane(Tga));
         p3.add(new JScrollPane(To));
         p3.validate();
         Tga.validate();
         To.validate();
      });
      Rt.addActionListener((e)->{
         System.out.println("작동");
         Tga.setPreferredSize(new Dimension(220, 200));
         To.setPreferredSize(new Dimension(220, 200));
         p3.add(new JScrollPane(Tga));
         p3.add(new JScrollPane(To));
         Tga.validate();
         To.validate();
         p3.validate();
      });
      
      Lu.addActionListener(e->{
    	temp[12]=Tga.getText();
    	temp[13]=To.getText();
    	 int b = (To.getText().equals(""))? 1: 2;
    	 if(b==1) {
    		 BusList cd = new BusList(this,temp,b);
             cd.setSize(500,500);
             cd.setVisible(true);
    	 }else if(b==2) {
    		 BusList cd = new BusList(this,temp,1);
             cd.setSize(500,500);
             cd.setVisible(true);
             BusList cd2 = new BusList(this,temp,2);
             cd2.setSize(500,500);
             cd2.setVisible(true);
    	 }
         
      });
      
      Tga.addMouseListener(my);
      To.addMouseListener(my);
      
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
   
   class MyHandler extends MouseAdapter{
      @Override
      public void mouseClicked(MouseEvent e) {
         Object obj = e.getSource();
         if(obj==Tga) {
            Test cd = new Test(Tga);
            cd.setSize(300,300);
            cd.setVisible(true);
         }else if(obj==To) {
            Test cd = new Test(To);
            cd.setSize(300,300);
            cd.setVisible(true);
         }else if(obj==Tchul) {
            Test2 cd = new Test2(Tchul, Tdo);
         }else if(obj==Tdo) {
            Test2 cd = new Test2(Tchul, Tdo);
         }
      }
   }
   
   public static void main(String[] args) {
      Object data[][] = {
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5}
      };
      MyRes ae = new MyRes(data);
      ae.setSize(500, 700);
      ae.setVisible(true);
   }
}