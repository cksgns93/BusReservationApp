package Pr;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Bus extends JFrame {
	JPanel pNorth = new JPanel(new BorderLayout());
	JPanel p = new JPanel();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	JPanel p6 = new JPanel();
	JPanel p7 = new JPanel();

	JTextField tfStart, tsets, tmoney, tgrade, tfi, tftime;
	JLabel lb1, lb2, lb3, lb4, lb5, lb6;
	JLabel lbNext, lbHome, lbinfo, lbdown;

	JTextArea ta1;
	CardLayout card = new CardLayout();
	BusList bif;

	public Bus(Object[] temp) {
		super("::예매 내역 확인::");
		Container cp = getContentPane();
		cp.add(p, "Center");
		p.setBackground(Color.white);
		pNorth.setLayout(card);
		lbNext = new JLabel();
		pNorth.setBackground(Color.white);
		pNorth.add(lbNext, "East");

		tfStart = new JTextField((String) temp[0], 35);

		p1.add(tfStart);
		tfStart.setBorder(new TitledBorder("출발지"));
		tfStart.setEditable(false);
		p.add(p1);

		// Bus 도착지

		tfi = new JTextField((String) temp[1], 35);
		p2.add(tfi);
		tfi.setBorder(new TitledBorder("도착지"));
		tfi.setEditable(false);
		p.add(p2);

		// Bus 시간대
		tftime = new JTextField("" + temp[2] + "시", 35);
		p3.add(tftime);
		tftime.setBorder(new TitledBorder("출발 시간"));
		tftime.setEditable(false);
		p.add(p3);

		// Bus 금액
		tmoney = new JTextField("" + temp[4] + "원", 35);
		p5.add(tmoney);
		tmoney.setBorder(new TitledBorder("가격"));
		tmoney.setEditable(false);
		p.add(p5);

		// Bus 등급
		tgrade = new JTextField((String) temp[5], 35);
		p6.add(tgrade);
		tgrade.setBorder(new TitledBorder("등급"));
		tgrade.setEditable(false);
		p.add(p6);

		// 아래
		lbdown = new JLabel("저희 버스를 이용해 주셔서 감사합니다.");
		lbdown.setFont(new Font("Sans-Serif", Font.PLAIN, 25));
		p.add(lbdown, "south");

		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
	 public Insets getInsets() {
	      return new Insets(200,0,150,0);
	   }

}
