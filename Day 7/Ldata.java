import java.util.*;

class Linked{

	class GetNode{
		int data;
		GetNode next;
		public GetNode(){
			next=null;
		}
	}

	GetNode head;
	Scanner sc = new Scanner(System.in);

	public void append(){
		int data;
		System.out.println("Enter Data ");
		data = sc.nextInt();

		GetNode newNode = new GetNode();

		newNode.data = data;

		if(head==null){
			head = newNode;
		}
		else{
			GetNode ptr = head;
			while(ptr.next!=null){
				ptr = ptr.next;
			}
			ptr.next = newNode;
		}
	}

	public void addAtBeg(){
		int data;
		System.out.println("Enter Data ");
		data = sc.nextInt();

		GetNode newNode = new GetNode();

		newNode.data = data;

		if(head==null){
			head = newNode;
		}
		else{
			GetNode ptr = head;
			newNode.next = ptr;
			head = newNode;
		}
	}

	public void addAtAft(){
		int data,sch;
		int flag=0;
		System.out.println("Enter Node to add after ");
		sch = sc.nextInt();
		System.out.println("Enter Data ");
		data = sc.nextInt();

		GetNode newNode = new GetNode();

		newNode.data = data;

		if(head==null){
			head = newNode;
		}
		else{
			GetNode ptr = head;
			GetNode preptr = new GetNode();

			while(ptr!=null){
				if(sch==ptr.data){
					flag = 1;
					break;
				}
				else
					ptr = ptr.next;
			}

			if(ptr.next==null && flag==0)
				System.out.println("Node not found ");
			else{
				preptr = ptr.next;
				ptr.next = newNode;
				newNode.next = preptr;
			}
		}
	}


	public void delete(){
		int sch;
		System.out.println("Enter Node to add after ");
		sch = sc.nextInt();

		GetNode newNode = new GetNode();

		if(head==null){
			System.out.println("List Empty");;
		}
		else{
			GetNode ptr;
			ptr=head;

			while(ptr!=null){
				if(sch==ptr.data){
					flag=1;
					break;
				}
				else
					ptr = ptr.next;
			}

			if(ptr.next==null)
				System.out.println("Key not found");
			else{
				GetNode ptr1,ptr2;
				ptr1 = ptr.next;
				ptr2 = ptr1.next;
				ptr.next = ptr2;
				System.out.println("Node "+ptr1.data+" is deleted...");
			}
		}
	}


	public void display(){
			GetNode ptr = head;
			while(ptr!=null){
				System.out.print(ptr.data+"<-- ");
				ptr = ptr.next;
			}
		}
}

class Ldata{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Linked l = new Linked();

		int choice;

		while(true){
			System.out.println("\n1.Add node at end ");
			System.out.println("2.Display List ");
			System.out.println("3.Add node at beg");
			System.out.println("4.Add after node ");
			System.out.println("5.Delete at next node of ");
			System.out.println("0.Exit \n");
			System.out.println("Enter choice ");
			choice = sc.nextInt();

			switch (choice) {
				case 0:	System.exit(0);

				case 1: l.append();
						break;
				case 2: l.display();
						break;
				case 3: l.addAtBeg();
						break;
				case 4: l.addAtAft();
						break;
				case 5: l.delete();
						break;
			}
		}
	}
}