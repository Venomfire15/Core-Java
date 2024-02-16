import java.util.*;

class Stack1{
	int top =-1;
	int stack[] = new int[5];

	Scanner sc = new Scanner(System.in);

	public void push(){
		int data;
		if(top<stack.length-1){
			System.out.println("Enter data to push : ");
			data = sc.nextInt();
			++top;
			stack[top] = data;
			System.out.println(data+" is Pushed");
		}
		else
			System.out.println("Stack is Full ");
		
	}

	public void pop(){
		int data;
		if(top!=-1){
			data = stack[top];
			System.out.println("Deleted element : "+data);
			--top;
		}
		else
			System.out.println("Stack is Empty ");
		
	}

	public void peek(){
		if(top!=-1){
			System.out.println("Top element is : "+stack[top]);
		}
		else
			System.out.println("Stack is Empty ");
	}

	public void display(){
		if(top!=-1){
			System.out.println("Elements in stack are : ");
			for(int i=top; i>=0; --i){
				System.out.println(stack[i]+" ");
			}
		}
		else
			System.out.println("Stack is Empty ");
	}
}




class data {
	public static void main(String[] args) {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		Stack1 s =new Stack1();

		while(true){
			System.out.println("\n1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.println("\nEnter choice : ");
			choice = sc.nextInt();

			switch(choice){

			case 1: s.push();
					break;
			case 2: s.pop();
					break;
			case 3: s.peek();
					break;
			case 4: s.display();
					break;
			case 5: System.exit(0);

			default: System.out.println("Invalid Choice");
			}
		}
	}
}