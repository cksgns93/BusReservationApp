package Pr;

import javax.swing.*;
import day23.ContentJpanel;
import java.awt.*;
import java.awt.event.*;

public class Info extends JFrame {

	JPanel p = new JPanel(),p1;
	JLabel lbin;
	JButton btcenter, btcompany, main;

	

	public Info() {
		super("::이용안내::");
		Container cp = getContentPane();
		cp.add(p,BorderLayout.NORTH);
		cp.add(p1=new JPanel(),BorderLayout.CENTER);
		p.setBackground(Color.white);

		
		lbin=new JLabel("이용안내/문의");
		lbin.setFont(new Font("sans-serif",Font.BOLD,30));
		
		main=new JButton(new ImageIcon("../images/home.png"));
		p.add(main);
		p.add(lbin);
		
		
		p1.setLayout(new GridLayout(3,1));
		btcenter= new JButton("주요 안내 센터",new ImageIcon("images/center.png"));
		btcenter.setFont(new Font("sans-serif",Font.BOLD,30));
		btcompany=new JButton("고속회사 안내",new ImageIcon("images/com.png"));
		btcompany.setFont(new Font("sans-serif",Font.BOLD,30));
		
		p1.add(btcenter);
		p1.add(btcompany);
		
		btcompany.addActionListener((e)->{
			BusCompany com=new BusCompany();
			com.setSize(500, 700);
			com.setVisible(true);
			com.setLocation(600, 0);
		});
		
		main.addActionListener((e)->{
			setVisible(false);
			dispose();
		});
		btcenter.addActionListener((e)->{
			InfoCenter ic=new InfoCenter();
			ic.setSize(500, 700);
			ic.setVisible(true);
			ic.setLocation(600, 0);
		});
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public Insets getInsets() {
	      return new Insets(30,5,150,0);
	   }
	
	public static void main(String[] args) {

		Info a = new Info();
		a.setSize(500, 700);
		a.setVisible(true);
	}

}

