class ThreadStateExample extends Thread
{
  public void run(){
   try{
    System.out.println("thread is RUNNING");
	Thread.sleep(1000);
	System.out.println("Thread is running again");
	}catch (InterruptedException e){
	  System.out.println(e);
	}
   }
   public static void main(String[]args) throws Exception{
    ThreadStateExample t=new ThreadStateExample();
    System.out.println("After Creating thread:"+t.getState());
    t.start();
    System.out.println("After start():"+t.getState());
    t.join();
	System.out.println("After completion():"+t.getState());
	}
  }	
      