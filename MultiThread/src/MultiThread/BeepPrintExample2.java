package MultiThread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// how1
		// Runnable beepTask = new BeepTask();
		// Thread thread = new Thread(beepTask);

		// how2
		// Thread thread = new Thread (new Runnable(){
		// @Override
		// public void run(){
		// Toolkit toolkit = Toolkit.getDefaultToolkit();
		//
		// for (int i = 0; i < 5; i++) {
		// toolkit.beep();
		// try {Thread.sleep(500);} catch (Exception e) {}
		// }
		// }
		// });

		// how3
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();

				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		};

		// ½Ç¹« ¹öÀü
		new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();

				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		}.start();

		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}

}
