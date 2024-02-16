//Super

class vehicle{
	int speed = 170;
}

class car extends vehicle{
	int speed = 130;
	void display(){
		System.out.println(speed);
		System.out.println(super.speed);
	}
}

class Super{
	public static void main(String[] args) {
		car c = new car();
		c.display();
	}
}