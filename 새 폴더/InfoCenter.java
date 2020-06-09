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
      super("::�ֿ� �ȳ� ����::");
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
      back=new JButton("���ư���");
      

     
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
      pTel.setBackground(Color.white);// �г�
      pIcon.setBackground(Color.white);
      lbTop = new JLabel("�ֿ� �ȳ� ����");
      lbTop.setFont(new Font("sans-serif", Font.PLAIN, 40));
      lbWork = new JLabel("�ٹ��ð�: ���� 09:00 ~ 18:00");
      lbWork.setFont(new Font("sans-serif", Font.PLAIN, 20));
      lbOff = new JLabel("�����, �Ͽ���, ���� ������ �޹�");
      lbOff.setFont(new Font("sans-serif", Font.PLAIN, 20));
      lbTel = new JLabel("1644-9030");
      lbTel.setFont(new Font("sans-serif", Font.PLAIN, 40));
      lbLost = new JLabel("�нǹ��� ���ǹ��� ��ӹ��� ���ȸ�纰 �� �������Ϳ��� ��ϰ� �ֽ��ϴ�.");
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
               JOptionPane.showMessageDialog(null, "1644-9030��ȣ�� ��ȭ�Ͻðڽ��ϱ�?");
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