import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=funny.class width=400 height=400></applet>*/
public class funny extends Applet implements ActionListener,ItemListener
{
 List L;
 Label l;
 Checkbox c1;
 Checkbox c2;
 Checkbox c3;
 String lmgs;
 String msg;
 public void init()
{
 L=new List();
 l=new Label("greetings rishi mamu");
 c1=new Checkbox("apple",true);
 c2=new Checkbox("banana",false);
 c3=new Checkbox("orange",false);
 L.add("ds programming");
 L.add("java");
 L.add("pspd");
 add(l);
 add(L);
 add(c1);
 add(c2);
 add(c3);
 c1.addItemListener(this);
 c2.addItemListener(this);
 c3.addItemListener(this);
 L.addItemListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 { 
  repaint();
 }
 public void itemStateChanged(ItemEvent ie)
 {
  repaint();
 }
 public void paint(Graphics g)
 {
  lmgs=L.getSelectedItem();
  g.drawString(lmgs,180,180);
  msg="apple"+c1.getState();
  g.drawString(msg,110,100);
  msg="banana"+c2.getState();
  g.drawString(msg,120,100);
  msg="orange"+c3.getState();
  g.drawString(msg,130,100);
 }
 }