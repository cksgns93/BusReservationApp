package Pr;

import javax.swing.*;
import day16.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class busMain extends JFrame {

   JPanel p, p1,p2, p2btn, p3;
   JButton btlogin, btjoin, btreserve, btcheck, btInfo;
   Image img, imgb;
   ImageIcon top=new ImageIcon("../images/background.jpg");
   ImageIcon bottom=new ImageIcon("../images/bottom.jpg");
   int x=0,y=0;
   Object [] temp = new Object[15];
   HashMap<String, Member4> userMap=new HashMap<>();
   
   Member ss=new Member(this);
   Login lg=new Login(this);
   
   
   
   public busMain() {
      super("::BusAppMain::");
      Container cp = getContentPane();
      cp.setLayout(new GridLayout(0,1));
      p=new JPanel() {
    	  @Override
    		public void paintComponent(Graphics g) {
    			super.paintComponent(g);
    			g.drawImage(img, x, y, this);
    			
    		}
      };
      p3=new JPanel() {
    	  @Override
    		public void paintComponent(Graphics g) {
    			super.paintComponent(g);
    			g.drawImage(imgb, x, y, this);
    			
    		}
      };
      cp.add(p);
      p2=new JPanel(new BorderLayout());
      System.out.println(this.getClass());
      btreserve=new JButton("고속버스 예매", new ImageIcon(this.getClass().getResource("../images/bus1.png")));
      btcheck=new JButton("예매내역 확인",new ImageIcon(this.getClass().getResource("../images/check1.png")));
      btreserve.setBackground(Color.WHITE);
      btcheck.setBackground(Color.white);
      cp.add(btreserve);
      cp.add(p2);
      cp.add(p3);
      
      btreserve.setFont(new Font("sans-serif",Font.BOLD,30));
      btcheck.setFont(new Font("sans-serif",Font.BOLD,30));
      btlogin=new JButton("로그인");
      btjoin=new JButton("회원가입");
      btInfo=new JButton("이용안내");
      
      p2btn=new JPanel();
      p2btn.setLayout(new GridLayout(1,3));
      p2btn.add(btlogin);
      p2btn.add(btjoin);
      p2btn.add(btInfo);
      
      p2.add(p2btn,"South");
      p2.add(btcheck,"Center");
  
      btlogin.setBackground(Color.blue);
      btlogin.setForeground(Color.white);
      btjoin.setBackground(Color.blue);
      btjoin.setForeground(Color.white);
      btInfo.setBackground(Color.blue);
      btInfo.setForeground(Color.white);
      
      img=top.getImage(); 
      imgb=bottom.getImage(); 
      this.setBackground(Color.white);
      
      //reserve
      btreserve.addActionListener((e)->{
         MyRes cd = new MyRes(temp);
         cd.setLocation(500, 0);
         cd.setSize(500,700);
         cd.setVisible(true);
      });
      //check 
      
      btcheck.addActionListener((e)->{
    	boolean ischeck=(temp[0]==null)?true:false;
		if(!ischeck) {
			boolean ischeck2=(temp[6]==null)?true:false;
			if(!ischeck2) {
				Bus22 bc2=new Bus22(temp);
		         bc2.setSize(500,700);
		         bc2.setVisible(true);
		         bc2.setLocation(500, 0);
			}else {
				Bus bc =new Bus(temp);
				bc.setSize(500,700);
		        bc.setVisible(true);
		        bc.setLocation(500, 0);
			}  
		}
		else{
			BusEx be=new BusEx();
			be.setSize(500,700);
			be.setVisible(true);
			be.setLocation(500, 0);
		}
         
      });
      
      //login
      btlogin.addActionListener((e)->{
         
         lg.setSize(500, 150);
         lg.setVisible(true);
         lg.setLocation(500, 0);
         
      });
      
    //login-join event
      lg.join.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            ss.setVisible(true);
            ss.setSize(400, 600);
         }
      });
      
      //join
      btjoin.addActionListener((e)->{
      
         ss.setSize(500, 700);
         ss.setLocation(500, 0);
         ss.setVisible(true);
      }); 
      
    //Info
      btInfo.addActionListener((e)->{
         Info in=new Info();
         in.setSize(500, 700);
         in.setLocation(500, 0);
         in.setVisible(true);
      }); 
      
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }  

   public static void main(String[] args) {
      
      busMain a = new busMain();
      a.setSize(500, 700);
      a.setVisible(true);
   }

}
