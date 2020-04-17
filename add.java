import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class first 
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
 JTextField t1;
 JTextField t2;
 JLabel l;
 public add()
 {
  c=getContentPane();
  b=new JButton("OK");
  t1=new JTextField(10);
  t2=new JTextField(20);
  l=new JLabel();
  setVisible(true);
  setLayout(new FlowLayout());
  setSize(400,400);
  c.add(t1);
  c.add(t2);
  c.add(l);
  c.add(b);
  b.addActionListener(this);
  
 }
 public void actionPerformed(ActionEvent e)
 {
  int n1=Integer.parseInt(t1.getText());
  int n2=Integer.parseInt(t2.getText());
  int n3=n1+n2;
  l.setText(n3+" "); 
 }
}