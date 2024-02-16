class t3 extends Thread{
	public void run(){
		System.out.println("Inside run method");
	}

	public static void main(String[] args) {
		t3 t = new t3();
		t3 t1 = new t3();
		t3 t2 = new t3();

		System.out.println("t1 thread priority "+t.getPriority());
		System.out.println("t2 thread priority "+t1.getPriority());
		System.out.println("t3 thread priority "+t2.getPriority());

		t.setPriority(2);
		t1.setPriority(5);
		t2.setPriority(8);

		System.out.println("t1 thread priority "+t.getPriority());
		System.out.println("t2 thread priority "+t1.getPriority());
		System.out.println("t3 thread priority "+t2.getPriority());
	}
}