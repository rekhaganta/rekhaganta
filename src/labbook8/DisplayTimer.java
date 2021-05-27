package labbook8;

import java.util.Date;

public class DisplayTimer implements Runnable {
	
	   public void run() {
	      try {
	    	  for(; ;) {
			 System.out.println("[" + new Date() + "]");
			 Thread.sleep(10000);
			  } 
	      }
	      catch (InterruptedException e) {
			e.printStackTrace();
	      }
		   }



}
