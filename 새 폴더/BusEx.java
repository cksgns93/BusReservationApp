package Pr;

import javax.swing.*;
import java.awt.*;
/*�������Ž���*/
public class BusEx extends JFrame {
   JButton close;
   BusEx() {
      setTitle("���̺� ����");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      JLabel Label = new JLabel("���� ������ �����");
      Label.setFont(new Font("sans-serif", Font.BOLD, 20));
      ImageIcon img = new ImageIcon("../images/����.jpg"); 
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