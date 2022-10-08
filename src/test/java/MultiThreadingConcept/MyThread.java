package MultiThreadingConcept;

 class ThreadDemo extends Thread{

	
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}

}

 public class MyThread{
	public static void main(String[] args) {
		
		MyThread t= new MyThread();
		System.out.println("Test");
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

	private void start() {
		// TODO Auto-generated method stub
		
	}
}
