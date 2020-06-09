package Pr;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import day16.MyJPanel;

public class Login extends JFrame {

   JPanel pCenter, pSouth, pWest;
   JButton login, join;
   JLabel id, pw;
   JTextField tid;
   JPasswordField tpw;
   busMain parent;
   Member ss=new Member(parent);

   public Login(busMain parent) {
      super("::Login::");
      Container cp = getContentPane();
      pCenter=new MyJPanel(15,10,10,10);
      pWest=new MyJPanel(15,10,10,10);
      pSouth=new JPanel();
      this.parent=parent;
      cp.add(pCenter, "Center");
      cp.add(pSouth, "South");
      cp.add(pWest, "West");
      
      pCenter.setBackground(Color.white);
      pSouth.setBackground(Color.white);
      pWest.setBackground(Color.white);
      pWest.setLayout(new BorderLayout());
      pCenter.setLayout(new BorderLayout());
      
      id=new JLabel("ID",JLabel.CENTER);
      pw=new JLabel("PASSWORD",JLabel.CENTER);
      tid=new JTextField(20);
      tpw=new JPasswordField(20);
      login=new JButton("�α���");
      join=new JButton("ȸ������");
      login.setBackground(Color.blue);
      login.setForeground(Color.white);
      join.setBackground(Color.blue);
      join.setForeground(Color.white);
      
      pWest.add(id,"North");
      pWest.add(pw,"South");
      pCenter.add(tid,"North");
      pCenter.add(tpw,"South");
      pSouth.add(login);
      pSouth.add(join);
      
      //MyHandler my=new MyHandler();
      login.addActionListener(new ActionListener() {////�α��� ��ư �׼� �̺�Ʈ////
          public void actionPerformed(ActionEvent e2) {
                String id=tid.getText();
                String pw=tpw.getText();
                String namestr=ss.getName();
                boolean b=parent.userMap.containsKey(id);
                
                if(b) {
                   //JOptionPane.showMessageDialog(pCenter, "�α��� ����");
                   
                   Member4 user=parent.userMap.get(id);               
                   
                   if(id.equals(parent.userMap.get(id).getID())&&pw.equals(parent.userMap.get(id).getPW())) {
                      System.out.println("aaabbbb");//�α��� ���� ���� ����Ǵ� ������ �� ������������ �׽�Ʈ ������ �������
                         JOptionPane.showMessageDialog(pCenter,"�α��� ����");
                         dispose();
                       
                   }
                }else {
                   JOptionPane.showMessageDialog(pCenter, "�α��� ����");
                }
          }
       });////�α��� ��ư �׼� �̺�Ʈ////
      join.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            parent.ss.setVisible(true);
            parent.ss.setSize(400, 600);
         }
      });

      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }//������
   
   class MyHandler implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         Object obj=e.getSource();
         if (obj==join) {
            ss.setVisible(true);
            ss.setSize(400, 600);
         }else if (obj==login) {//�α���
            String idStr=tid.getText();
            String pwStr=new String(tpw.getPassword());
            boolean isExist=parent.userMap.containsKey(idStr);
            System.out.println(isExist);
            if(isExist==false) {
               JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� Ȯ���ϼ���.");
            }
            else if(idStr.equals(parent.userMap.get(idStr).getID())&&
                  pwStr.equals(parent.userMap.get(idStr).getPW())) {
               JOptionPane.showMessageDialog(null, idStr+"�� ȯ���մϴ�.");
               dispose();
            }
         }
      }
   }

  

}