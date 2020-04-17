class producer extends Thread
{
 StringBuffer sb;
 producer()
 {
  sb=new StringBuffer();
 }
 public void run()
 {
  synchronized(sb)
  {
   try{
    for(int i=0;i<10;i++)
    {
     sb.append(i+":");
     Thread.sleep(1000);
     System.out.println("appending");
    }
    }
   catch(InterruptedException ie)
   {
    ie.printStackTrace();
   }
   sb.notify();
   
  }
 }
}
class consumer extends Thread
{
 producer p;
 consumer(producer p)
 {
  this.p=p;
 }
 public void run()
 {
  synchronized(p.sb)
  {
   try{
    p.sb.wait();
   }
   catch(InterruptedException ie)
   {
    System.out.println(ie);
    }
   System.out.println(p.sb);
  }
 } 
}
 class eg
 {
 public static void main(String args[])
 {
  producer p=new producer();
  consumer c=new consumer(p);
  Thread t1=new Thread(p);
  Thread t2=new Thread(c);
  t1.start();
  t2.start();
 }
}