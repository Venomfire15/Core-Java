class A{
	public static synchronized void print(String name){
		for(int i=0; i<3; ++i){
			System.out.println(" Batting : "+name);
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException in){
				in.printStackTrace();
			}
		}
	}
}

class t1 extends Thread{
	public void run(){
		A.print("Sachin");
	}
}

class t2 extends Thread{
	public void run(){
		//A a = new A();
		A.print("Dhoni");
	}
}

class t3 extends Thread{
	public void run(){
		//A a = new A();
		A.print("Virat");
	}
}

class t7{
	public static void main(String[] args) {
		new t1().start();
		new t2().start();
		new t3().start();
	}
}