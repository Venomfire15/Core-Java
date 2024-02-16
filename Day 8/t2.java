class thread implements Runnable{
	public void run(){
		for (int i=0;i<=10 ; ++i) {
			System.out.println("Child Thread");
		}
	}
}

class t2{
	public static void main(String[] args) {
		Thread t = new Thread(new thread());
		t.start();
		for (int i=0;i<=10 ; ++i) {
			System.out.println("Main Thread");
		}
	}
}