class thread extends Thread{
	public void run(){
		for (int i=0;i<=10 ; ++i) {
			System.out.println("Child Thread");
			//Thread.yield();
		}
	}
}

class t5{
	public static void main(String[] args) throws Exception{
		thread t = new thread();
		t.start();
		t.join();
		for (int i=0;i<=10 ; ++i) {
			System.out.println("Main Thread");
		}
	}
}