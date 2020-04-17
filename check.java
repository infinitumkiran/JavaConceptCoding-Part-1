import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=check.class width=400 height=400></applet.*/
public class check extends Applet implements ItemListener
{
 Checkbox c1;
 Checkbox c2;
 Checkbox c3;
 CheckboxGroup cbg;
 String msg;
 //Button b;
 public void init()
 {
  cbg=new CheckboxGroup();
  c1=new Checkbox("male",cbg,true);
  c2=new Checkbox("female",cbg,false);
  c3=new Checkbox("undefined",cbg,false);
  //b=new Button();
  add(c1);
  add(c2);
  add(c3);
  //add(b);
  c1.addItemListener(this);
  c2.addItemListener(this);
  c3.addItemListener(this);
   }
 public void itemStateChanged(ItemEvent i)
 {
  repaint();
 }
 public void paint(Graphics g)
 {
  msg="Current Selection"+cbg.getSelectedCheckbox().getState();
  g.drawString(msg,100,140);
  
 }
}