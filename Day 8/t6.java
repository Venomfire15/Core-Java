class thread extends Thread{
	public void run(){
		for (int i=0;i<=10 ; ++i) {
			System.out.println("Child Thread");
			try{
				Thread.sleep(300);
			}
			catch(Exception e){}
		}
	}
}

class t6{
	public static void main(String[] args) throws Exception{
		thread t = new thread();
		t.start();
		for (int i=0;i<=10 ; ++i) {
			System.out.println("Main Thread");
		}
	}
}