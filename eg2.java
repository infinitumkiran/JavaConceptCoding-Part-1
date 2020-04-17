import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class abc extends JFrame implements ActionListener
{
 Container c;
 JButton b;
 JLabel l1;
 JLabel l2;
 JTextField t1;
 JTextField t2;
 JLabel l3;
 public abc()
 {
 c=getContentPane();
 c.setLayout(new GridLayout());
 b=new JButton("add");
 c.setBackground(Color.yellow);
 t1=new JTextField(290);
 t2=new JTextField(100);
 l1=new JLabel("first no");
 l2=new JLabel("second no");
 setVisible(true);
 setTitle("swing example");
 l1.setBounds(100,100,40,70);
 l2.setBounds(120,120,40,70);
 //t1.setBounds();
 //t2.setBounds();
 b.setBounds(200,200,40,70);
 setSize(400,400);
 c.add(b);
 c.add(l1);
 c.add(l2);
 c.add(l3);
 c.add(t1);
 c.add(t2);
 
 //setDefaultCloseOperation(JFrame EXIT_ON_CLOSE);
 b.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
  int n1=Integer.parseInt(t1.getText());
  int n2=Integer.parseInt(t2.getText());
  int n3=n1+n2;
  l3.setText(n3+" ");
 }
}
 class eg2
 {
 public static void main(String args[])
 {
  abc e=new abc();
 }
 }