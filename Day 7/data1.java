import java.util.*;

class Queue1{
	int front=0;
	int rear=-1;
	int queue[] = new int[5];

	Scanner sc = new Scanner(System.in);

	public void insert(){
		int data;
		++rear;
		if(rear<queue.length){
			System.out.println("Enter the data to insert ");
			data = sc.nextInt();
			queue[rear] = data;
			System.out.println(data+" is Inserted");
		}
		else
			System.out.println("Queue is Full ");
	}

	public void delete(){
		if(rear!=-1){
			int data;
			data = queue[front];
			for(int i=0;i<queue.length-1;++i){
				queue[i] = queue[i+1];
			}
			--rear;
			System.out.println("Deleted element "+data); 
		}
		else
			System.out.println("Queue is Empty ");
	}

	public void display(){
		if(rear!=-1){
			for(int i=0; i<rear; ++i){
				System.out.print(queue[i]+" ");
			}
			System.out.println();
		}
		else
			System.out.println("Queue is Empty");
	}
}



class data1{
	public static void main(String[] args) {

		Queue1 q = new Queue1();
		Scanner sc = new Scanner(System.in);

		int choice;

		while(true){

			System.out.println("\n1.Insert Data ");
			System.out.println("2.Delete Data ");
			System.out.println("3.Display ");
			System.out.println("4.Exit ");
			System.out.println("Enter the choice : ");
			choice = sc.nextInt();
			System.out.println();

			switch(choice){
			case 1: q.insert();
					break;
			case 2: q.delete();
					break;
			case 3: q.display();
					break;
			case 4: System.exit(0);

			default: System.out.println("Wrong Input");
					 break;
			}
		}
	}
}