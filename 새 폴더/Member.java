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
      info = new JLabel("회원정보입력", JLabel.CENTER);
      nec = new JLabel("필수정보");
      no_nec = new JLabel("선택정보");
      
      id = new JTextField(20);
      name = new JTextField(20);
      birth = new JTextField(20);
      tel = new JTextField(20);
      email = new JTextField(20);

      tfPwd = new JPasswordField(20);
      apw = new JPasswordField(20);

      
      name.setBorder(new TitledBorder("이름"));
      id.setBorder(new TitledBorder("아이디"));
      tfPwd.setBorder(new TitledBorder("비밀번호"));
      apw.setBorder(new TitledBorder("비밀번호 확인"));
      tel.setBorder(new TitledBorder("전화번호"));
      email.setBorder(new TitledBorder("이메일 주소"));
      birth.setBorder(new TitledBorder("생년월일"));

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

      j1 = new JButton("회원가입");
      j1.setBackground(Color.blue);
      j1.setForeground(Color.white);
      p2.add(j1);
      
      j1.addActionListener(new ActionListener() {////회원가입 완료 버튼 액션 이벤트////
          @Override
          public void actionPerformed(ActionEvent e) {
             Object obj=e.getSource();
             System.out.println("회원가입");
            //1. 사용자가 아이니다 비밀번호를 입력하지 않은 경우
                
             boolean isOk= joinCheck();//유효성 체크
             if(!isOk) {
                return;
             }
             try{
                Member4 user=new Member4(name.getText(),id.getText(), tfPwd.getText(),
                      birth.getText(), email.getText());
                parent.userMap.put(user.getID(), user);
                
                JOptionPane.showMessageDialog(p1, "회원가입 성공");
                dispose();
             // Login.this.pack();//Login
              // Login.this.setVisible(true);//Login
                parent.setSize(500,700);
                parent.setVisible(true);
               
             }catch (Exception ex){
                JOptionPane.showMessageDialog(p1, "회원가입 실패");
             }
             
          }
       });

      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      }
      ///////////
   

public boolean joinCheck() {
      String nameStr = name.getText();
    if(nameStr.trim().isEmpty() || nameStr == null ) {
       JOptionPane.showMessageDialog(p1, "성함을 기재 해 주세요.");
       name.requestFocus();
       return false;
    }
    
    String idStr = id.getText();
    if(idStr.trim().equals("") || idStr == null ) {
       JOptionPane.showMessageDialog(p1, "아이디를 입력하세요");
       id.requestFocus();
       return false;
    }
    
   String pwdStr = tfPwd.getText();
    if(pwdStr.trim().isEmpty() || pwdStr == null ) {
       JOptionPane.showMessageDialog(p1, "비밀번호를 입력하세요");
       tfPwd.requestFocus();
       return false;
    }
    
  
    
    return true;
}//----------------------------------
}