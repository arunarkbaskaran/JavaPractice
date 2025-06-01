package Practice;

class ThreadSample1 extends Thread {
	public void run() {
        System.out.println("Thread is running... TS1");
    }
}
class ThreadSample2 extends Thread {
	public void run() {
        System.out.println("Thread is running... TS2");
    }
}
class ThreadSample3 extends Thread {
	public void run() {
        System.out.println("Thread is running... TS3");
    }
}
class ThreadSample4 extends Thread {
	public void run() {
        System.out.println("Thread is running... TS4");
    }
}
class ThreadSample5 extends Thread {
	public void run() {
        System.out.println("Thread is running... TS5");
    }
}

public class ThreadExample {
	public static void main(String[] args) {
		ThreadSample1 ts1 = new ThreadSample1();
		ThreadSample2 ts2 = new ThreadSample2();
		ThreadSample3 ts3 = new ThreadSample3();
		ThreadSample4 ts4 = new ThreadSample4();
		ThreadSample5 ts5 = new ThreadSample5();
		ts1.start();
		ts2.start();
		ts3.start();
		ts4.start();
		ts5.start();
	}

}
