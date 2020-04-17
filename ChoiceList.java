import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=ChoiceList.class width=400 height=400 > </applet>*/                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
public class ChoiceList extends Applet implements ItemListener,ActionListener
{
 Choice c;
 List l;
 String cmgs,lmgs;
 public void init()
 {
  c=new Choice();
  l=new List();
  c.add("java");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
  c.add("ds");
  c.add("dld");
  l.add("java");
  l.add("ds");
  l.add("dld");
  add(c);
  add(l);
  c.addItemListener(this);
  l.addItemListener(this);
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
 cmgs=c.getSelectedItem();
 lmgs=l.getSelectedItem();
 g.drawString(cmgs,300,200);
 g.drawString(lmgs,300,400);
 
 }
}
