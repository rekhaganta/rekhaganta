package labbook8;

public class DisplayTimerDemo {
	 public static void main(String[] args) {
			DisplayTimer dt = new DisplayTimer();
			Thread t = new Thread(dt);
			t.start();
			 
		 }


}

