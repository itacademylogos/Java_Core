package ua.lviv.lgs;

public class ApplicationDeadLock {

	public static void main(String[] args) {
		ResourceA resourceA = new ResourceA();
		ResourceB resourceB = new ResourceB();
		resourceA.resourceB = resourceB;
		resourceB.resourceA = resourceA;
		
		MyThread1 t1 = new MyThread1();
		t1.resourseA = resourceA;
		MyThread2 t2 = new MyThread2();
		t2.resourseB = resourceB;
		
		t1.start();
		t2.start();
	}

}

class ResourceA{
	ResourceB resourceB;
	
	public synchronized int getNumber() {
		return  resourceB.returnNumber();
	}
	
	public synchronized int returnNumber() {
		return 1;
	}
	
}

class ResourceB{
	ResourceA resourceA;
	
	public synchronized int getNumber() {
		return  resourceA.returnNumber();
	}
	
	public synchronized int returnNumber() {
		return 2;
	}
}

class MyThread1 extends Thread{
	ResourceA resourseA;
	
	@Override
	public void run() {
		System.out.println(resourseA.getNumber());
	}
}

class MyThread2 extends Thread{
	ResourceB resourseB;
	
	@Override
	public void run() {
		System.out.println(resourseB.getNumber());
	}
}
