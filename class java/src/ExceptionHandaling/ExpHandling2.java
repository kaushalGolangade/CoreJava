package ExceptionHandaling;

import java.io.File;

public class ExpHandling2 {

	public static void main(String[] args)  {
		
		File file = new File ("gfyu");
		System.out.println("start");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
		

	}

}
