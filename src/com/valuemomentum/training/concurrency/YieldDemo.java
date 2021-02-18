package com.valuemomentum.training.concurrency;
class Mythread3 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName()+"in control");
	}
}
//Driver class
public class YieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Mythread3 t=new Mythread3();
      t.start();
      for(int i=0;i<5;i++)
      {
    	  Thread.yield();
    	  System.out.println(Thread.currentThread().getName()+"in control");
      }
      
      
	}

}
