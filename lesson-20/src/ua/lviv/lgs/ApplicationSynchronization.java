package ua.lviv.lgs;

public class ApplicationSynchronization {
	static int number = 0;

	public static void main(String[] args) throws InterruptedException {

		Thread myThread = new Thread(new Worker());
		myThread.start();
		
		Thread myThread2 = new Thread(new Worker());
		myThread2.start();
		

		Thread myThread3 = new Thread(new Worker());
		myThread3.start();
		
		Thread myThread4 = new Thread(new Worker());
		myThread4.start();
		
		Thread myThread5 = new Thread(new Worker());
		myThread5.start();
		

		Thread myThread6 = new Thread(new Worker());
		myThread6.start();
		
		
		myThread.join();
		myThread2.join();
		myThread3.join();
		myThread4.join();
		myThread5.join();
		myThread6.join();
		
		System.out.println(number);
		
	}

	static synchronized void incrementNumber() {
		number++;
	}

}

class Worker implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 2000; i++) {
			ApplicationSynchronization.incrementNumber();;
		}

	}

}
