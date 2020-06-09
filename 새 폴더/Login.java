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
      login=new JButton("로그인");
      join=new JButton("회원가입");
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
      login.addActionListener(new ActionListener() {////로그인 버튼 액션 이벤트////
          public void actionPerformed(ActionEvent e2) {
                String id=tid.getText();
                String pw=tpw.getText();
                String namestr=ss.getName();
                boolean b=parent.userMap.containsKey(id);
                
                if(b) {
                   //JOptionPane.showMessageDialog(pCenter, "로그인 실패");
                   
                   Member4 user=parent.userMap.get(id);               
                   
                   if(id.equals(parent.userMap.get(id).getID())&&pw.equals(parent.userMap.get(id).getPW())) {
                      System.out.println("aaabbbb");//로그인 성공 까지 저장되는 정보가 잘 가져와지는지 테스트 지워도 상관없음
                         JOptionPane.showMessageDialog(pCenter,"로그인 성공");
                         dispose();
                       
                   }
                }else {
                   JOptionPane.showMessageDialog(pCenter, "로그인 실패");
                }
          }
       });////로그인 버튼 액션 이벤트////
      join.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            parent.ss.setVisible(true);
            parent.ss.setSize(400, 600);
         }
      });

      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }//생성자
   
   class MyHandler implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         Object obj=e.getSource();
         if (obj==join) {
            ss.setVisible(true);
            ss.setSize(400, 600);
         }else if (obj==login) {//로그인
            String idStr=tid.getText();
            String pwStr=new String(tpw.getPassword());
            boolean isExist=parent.userMap.containsKey(idStr);
            System.out.println(isExist);
            if(isExist==false) {
               JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 확인하세요.");
            }
            else if(idStr.equals(parent.userMap.get(idStr).getID())&&
                  pwStr.equals(parent.userMap.get(idStr).getPW())) {
               JOptionPane.showMessageDialog(null, idStr+"님 환영합니다.");
               dispose();
            }
         }
      }
   }

  

}