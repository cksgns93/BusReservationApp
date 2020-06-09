package Pr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InfoCenter extends JFrame {

   JPanel pNorth, pCenter, pSouth, pWork, pOff, pTel, pIcon,pTop;
   //ImgPanel pIcon;
   JLabel lbTop, lbWork, lbOff, lbTel, lbLost;
   JButton telIcon, back;
   Image img;
   ImageIcon imgIcon;
   

   public InfoCenter() {
      super("::주요 안내 센터::");
      Container cp = getContentPane();
      pNorth = new JPanel();
      pCenter = new JPanel(new GridLayout(6, 1));
      pSouth = new JPanel();
      pWork = new JPanel(new BorderLayout());
      pTop = new JPanel(new BorderLayout());
      pOff = new JPanel(new BorderLayout());
      
      pTel = new JPanel(new BorderLayout());
      pIcon = new JPanel();
      imgIcon=new ImageIcon("../images/aaa.png");
      img=imgIcon.getImage();
      back=new JButton("돌아가기");
      

     
      cp.add(pNorth, "North");
      cp.add(pCenter, "Center");
      cp.add(pSouth, "South");
      
      pCenter.add(pTop);
      pCenter.add(pWork);
      pCenter.add(pOff);
      pCenter.add(pTel);
      pTop.setBackground(Color.white);
      pNorth.setBackground(Color.white);
      pCenter.setBackground(Color.white);
      pSouth.setBackground(Color.white);
      pWork.setBackground(Color.white);
      pOff.setBackground(Color.white);
      pTel.setBackground(Color.white);// 패널
      pIcon.setBackground(Color.white);
      lbTop = new JLabel("주요 안내 사항");
      lbTop.setFont(new Font("sans-serif", Font.PLAIN, 40));
      lbWork = new JLabel("근무시간: 평일 09:00 ~ 18:00");
      lbWork.setFont(new Font("sans-serif", Font.PLAIN, 20));
      lbOff = new JLabel("토요일, 일요일, 법정 공휴일 휴무");
      lbOff.setFont(new Font("sans-serif", Font.PLAIN, 20));
      lbTel = new JLabel("1644-9030");
      lbTel.setFont(new Font("sans-serif", Font.PLAIN, 40));
      lbLost = new JLabel("분실물과 유실물은 고속버스 운송회사별 각 지역센터에서 운영하고 있습니다.");
      lbLost.setFont(new Font("sans-serif", Font.PLAIN, 13));
      cp.add(back,"North");

      pTop.add(lbTop, BorderLayout.WEST);
      pWork.add(lbWork, BorderLayout.WEST);
      pOff.add(lbOff, BorderLayout.WEST);
      pTel.add(lbTel, BorderLayout.WEST);
      pTel.add(pIcon, BorderLayout.EAST);
      pIcon.add(telIcon = new JButton(imgIcon));
      pSouth.add(lbLost);
      
      
      telIcon.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            Object obj=e.getSource();
            if (obj==telIcon) {
               JOptionPane.showMessageDialog(null, "1644-9030번호로 전화하시겠습니까?");
            }
         }
      });
      back.addActionListener(e->{
          setVisible(false);
          dispose();
       });
      
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
   

   public static void main(String[] args) {
      Info ae = new Info();
      ae.setSize(500, 700);
      ae.setVisible(true);

   }

}