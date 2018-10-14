package ua.lviv.lgs;

public class ApplicationBasic {
	public static void main(String[] args) {
			MyThread myThread = new MyThread("MyThread", 500);
			myThread.start();	
			
			MyRunnable myRunnable = new MyRunnable("MyRunnable", 500);
	}
}


class MyRunnable implements Runnable {

	private String name;
	private int delay;
	private Thread thread;

	public MyRunnable(String name, int delay) {
		this.name = name;
		this.delay = delay;
		this.thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Name : " + name + "---" + i);
			if (i == 19)
				System.out.println("Thread :" + name + " is done");
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}

class MyThread extends Thread {

	private String name;
	private int delay;

	public MyThread(String name, int delay) {

		this.name = name;
		this.delay = delay;
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			System.out.println("Name : " + name + "---" + i);
			if (i == 19)
				System.out.println("Thread :" + name + " is done");
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
