import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class first1 
{
 public static void main(String args[])
 {
  add s=new add();
 }
}
class add extends JFrame implements ActionListener
{
 
 Container c;
 JButton b;
 JRadioButton r1;
 JRadioButton r2;
 JTextField t;
 JLabel l;
 public add()
 {
  c=getContentPane();
  b=new JButton("OK");
  r1=new JRadioButton("male");
  r2=new JRadioButton("female");
  t=new JTextField();
  l=new JLabel();
  setVisible(true);
  setLayout(new FlowLayout());
  setSize(400,400);
  c.add(r1);
  c.add(r2);
  c.add(t);
  c.add(l);
  c.add(b);
  b.addActionListener(this);
  
 }
 public void actionPerformed(ActionEvent e)
 {
  String name=t.getText();
  if(r1.isSelected())
  {
   name="mr."+name;
  } 
  else 
  {
   name="mrs."+name;
  }
  l.setText(name+" ");
 }
}