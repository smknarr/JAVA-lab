class MyThread implements Runnable 
{ 
      public int tno, delay, pulse;
      MyThread(int a,int b) 
      { 
        tno = a; 
        delay = b;
        pulse = 0;
      } 
      public void run() 
      { 
         for(int i=0;i<5;i++) 
            { 
                 System.out.println("Thread " + tno +" pulse number " + (pulse+1)); 
                 try 
                 { 
                     Thread.sleep(delay); 
                 } 
                 catch(InterruptedException e) 
                 { 
                      e.printStackTrace(); 
                 } 
                 pulse++;
            } 
                      System.out.println("Thread " + tno +" done."); 
        } 
} 
public class b1
      { 
            public static void main(String[] args) 
          { 
                  MyThread r1 = new MyThread(1,150); 
                  MyThread r2 = new MyThread(2,300); 
                  MyThread r3 = new MyThread(3,750); 
                  Thread t1 = new Thread(r1); 
                  Thread t2 = new Thread(r2); 
                  Thread t3 = new Thread(r3); 
                  t1.start(); 
                  t2.start(); 
                  t3.start(); 
          } 
      } 