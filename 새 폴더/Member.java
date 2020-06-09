package Pr;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import day16.MyJPanel;
import java.io.IOException;
import javax.swing.border.*;

public class Member extends JFrame {

   JPanel p1, p2; 
   JTextField id, name, birth, tel, email;
   JLabel info, nec, no_nec, gender;
   JButton j1;
   GridLayout grid;
   JPasswordField tfPwd, apw;
   BorderLayout d1;
   Member4 mb;
   Login login;
   busMain parent;

   public Member(busMain parent) {
      super("::MemberJoinGui::");
      Container cp = getContentPane();
      p1 = new MyJPanel(30, 10, 10, 10);
      p2 = new JPanel();
      grid = new GridLayout(10, 1);
      p1 = new JPanel(grid);
      cp.add(p1, "Center");
      cp.add(p2, "South");
      info = new JLabel("ȸ�������Է�", JLabel.CENTER);
      nec = new JLabel("�ʼ�����");
      no_nec = new JLabel("��������");
      
      id = new JTextField(20);
      name = new JTextField(20);
      birth = new JTextField(20);
      tel = new JTextField(20);
      email = new JTextField(20);

      tfPwd = new JPasswordField(20);
      apw = new JPasswordField(20);

      
      name.setBorder(new TitledBorder("�̸�"));
      id.setBorder(new TitledBorder("���̵�"));
      tfPwd.setBorder(new TitledBorder("��й�ȣ"));
      apw.setBorder(new TitledBorder("��й�ȣ Ȯ��"));
      tel.setBorder(new TitledBorder("��ȭ��ȣ"));
      email.setBorder(new TitledBorder("�̸��� �ּ�"));
      birth.setBorder(new TitledBorder("�������"));

      p1.setBackground(Color.white);

      info.setBackground(Color.black);
      name.setBackground(Color.white);
      id.setBackground(Color.white);
      tfPwd.setBackground(Color.white);
      apw.setBackground(Color.white);
      tel.setBackground(Color.white);
      birth.setBackground(Color.white);
      no_nec.setBackground(Color.white);
      email.setBackground(Color.white);

      p1.add(info);
      p1.add(nec);
      p1.add(name);
      p1.add(id);
      p1.add(tfPwd);
      p1.add(apw);

      p1.add(no_nec);
      p1.add(birth);
      p1.add(tel);
      p1.add(email);

      j1 = new JButton("ȸ������");
      j1.setBackground(Color.blue);
      j1.setForeground(Color.white);
      p2.add(j1);
      
      j1.addActionListener(new ActionListener() {////ȸ������ �Ϸ� ��ư �׼� �̺�Ʈ////
          @Override
          public void actionPerformed(ActionEvent e) {
             Object obj=e.getSource();
             System.out.println("ȸ������");
            //1. ����ڰ� ���̴ϴ� ��й�ȣ�� �Է����� ���� ���
                
             boolean isOk= joinCheck();//��ȿ�� üũ
             if(!isOk) {
                return;
             }
             try{
                Member4 user=new Member4(name.getText(),id.getText(), tfPwd.getText(),
                      birth.getText(), email.getText());
                parent.userMap.put(user.getID(), user);
                
                JOptionPane.showMessageDialog(p1, "ȸ������ ����");
                dispose();
             // Login.this.pack();//Login
              // Login.this.setVisible(true);//Login
                parent.setSize(500,700);
                parent.setVisible(true);
               
             }catch (Exception ex){
                JOptionPane.showMessageDialog(p1, "ȸ������ ����");
             }
             
          }
       });

      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      }
      ///////////
   

public boolean joinCheck() {
      String nameStr = name.getText();
    if(nameStr.trim().isEmpty() || nameStr == null ) {
       JOptionPane.showMessageDialog(p1, "������ ���� �� �ּ���.");
       name.requestFocus();
       return false;
    }
    
    String idStr = id.getText();
    if(idStr.trim().equals("") || idStr == null ) {
       JOptionPane.showMessageDialog(p1, "���̵� �Է��ϼ���");
       id.requestFocus();
       return false;
    }
    
   String pwdStr = tfPwd.getText();
    if(pwdStr.trim().isEmpty() || pwdStr == null ) {
       JOptionPane.showMessageDialog(p1, "��й�ȣ�� �Է��ϼ���");
       tfPwd.requestFocus();
       return false;
    }
    
  
    
    return true;
}//----------------------------------
}