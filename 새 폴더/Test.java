package Pr;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class Test extends JFrame{
   JPanel frame= new JPanel();
   JButton close;
   public Test(JButton parent){
      Container cp = getContentPane();
      UtilDateModel model = new UtilDateModel();
      JDatePanelImpl datePanel = new JDatePanelImpl(model);
      JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
      
      frame.add(datePicker);
      close = new JButton("close");
      cp.add(frame);
      cp.add(close,"South");
      
      close.addActionListener((e)->{
         String str=""+model.getYear();
         str+=" "+(model.getMonth()+1);
         str+=" "+model.getDay();
         parent.setText(str);
         this.setVisible(false);
         this.dispose();
      });
      
   }
}