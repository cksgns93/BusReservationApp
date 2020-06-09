package Pr;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BusCompany extends JFrame {
   JPanel p = new JPanel();
   JButton back,p1,p2,p3,p4;
   public BusCompany() {
      super("::BusCompany::");
      Container cp = getContentPane();
      cp.add(p, "Center");
      back= new JButton("돌아가기");
      cp.add(back,"North");
      p.setLayout(new GridLayout(4,1,3,3));
      p.setBackground(Color.white);
      ImageIcon icon = new ImageIcon("../images/11.png");
      ImageIcon icon2 = new ImageIcon("../images/22.png");
      ImageIcon icon3 = new ImageIcon("../images/33.png");
      ImageIcon icon4 = new ImageIcon("../images/44.png");
      p1= new JButton();
      p1.setBounds(0, 0, 500, 165);
      int offset = p1.getInsets().left;
      p1.setIcon(resizeIcon(icon,p1.getWidth()-offset,p1.getHeight()-offset));
      p2= new JButton(new ImageIcon("../images/22.png"));
      p2.setIcon(resizeIcon(icon2,p1.getWidth()-offset,p1.getHeight()-offset));
      p3= new JButton(new ImageIcon("../images/33.png"));
      p3.setIcon(resizeIcon(icon3,p1.getWidth()-offset,p1.getHeight()-offset));
      p4= new JButton(new ImageIcon("../images/44.png"));
      p4.setIcon(resizeIcon(icon4,p1.getWidth()-offset,p1.getHeight()-offset));
      p.add(p1);
      p.add(p2);
      p.add(p3);
      p.add(p4);
      p1.addActionListener(e->{
         Runtime runtime = Runtime.getRuntime();
         try {
            runtime.exec("C:/Program Files/Internet Explorer/iexplore.exe https://www.kumhobuslines.co.kr/fr/main/main");
         } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
         }
      });
      p2.addActionListener(e->{
         Runtime runtime = Runtime.getRuntime();
         try {
            runtime.exec("C:/Program Files/Internet Explorer/iexplore.exe https://www.dongbubus.com/jsp/express/main/index.jsp");
         } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
         }
      });
      p3.addActionListener(e->{
         Runtime runtime = Runtime.getRuntime();
         try {
            runtime.exec("C:/Program Files/Internet Explorer/iexplore.exe http://www.dyexpress.co.kr/");
         } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
         }
      });
      p4.addActionListener(e->{
         Runtime runtime = Runtime.getRuntime();
         try {
            runtime.exec("C:/Program Files/Internet Explorer/iexplore.exe http://www.samhwaexpress.co.kr/");
         } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
         }
      });
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      back.addActionListener(e->{
         setVisible(false);
         dispose();
      });
   }
   
   private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
          Image img = icon.getImage();  
          Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
          return new ImageIcon(resizedImage);
   }
   public static void main(String[] args) {
      BusCompany ae = new BusCompany();
      ae.setSize(500, 700);
      ae.setVisible(true);
   }
}