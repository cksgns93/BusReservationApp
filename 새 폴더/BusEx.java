package Pr;

import javax.swing.*;
import java.awt.*;
/*버스예매실패*/
public class BusEx extends JFrame {
   JButton close;
   BusEx() {
      setTitle("레이블 예제");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      JLabel Label = new JLabel("예약 정보가 없어요");
      Label.setFont(new Font("sans-serif", Font.BOLD, 20));
      ImageIcon img = new ImageIcon("../images/예매.jpg"); 
      JLabel imageLabel = new JLabel(img);
      c.add(Label);
       c.add(imageLabel);
       close = new JButton("Close");
       c.add(close);
       close.addActionListener(e->{
          this.setVisible(false);
          this.dispose();
       });
   }
   public static void main(String [] args) {
      BusEx be=new BusEx();
      be.setSize(500,700);
      be.setVisible(true);
   }
}