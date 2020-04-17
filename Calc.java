import java.applet.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code = Calc.class width = "600" height = "600">
</applet>*/
public class Calc extends Applet implements ActionListener
{
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
Label l1=new Label("1st num");
Label l2=new Label("2nd num");
Label l3=new Label("result");
Button b1,b2,b3,b4,b5;
public void init()
{
b1=new Button("add");
b2=new Button("sub");
b3=new Button("mul");
b4=new Button("div");
b5=new Button("mod");
//setLayout(new GridLayout(3,2));
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String s1=t1.getText();
String s2=t2.getText();
Double num1=Double.parseDouble(s1);
Double num2=Double.parseDouble(s2);
Double num3;
String a;
if(e.getSource()==b1)
{
num3=num1+num2;
a=Double.toString(num3);
t3.setText(a);
}
else if(e.getSource()==b2)
{
num3=num1-num2;
a=Double.toString(num3);
t3.setText(a);
}
else if(e.getSource()==b3)
{
num3=num1*num2;
a=Double.toString(num3);
t3.setText(a);
}
else if(e.getSource()==b4)
{
num3=num1/num2;
a=Double.toString(num3);
t3.setText(a);
}
else
{
num3=num1%num2;
a=Double.toString(num3);
t3.setText(a);
}
}
}