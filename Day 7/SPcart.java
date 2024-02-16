//Create a shoping cart application having following Features
/*1.Input data :- Item number,Item Price,Item Name
  2.Display :- Tabular Format
  3.Update :- Enter Item Number, ino
  4.Delete
  5.EXit */

  import java.util.*;

  class Cart{

  	Scanner sc = new Scanner(System.in);
  	ArrayList<Integer> item = new ArrayList<>();
  	ArrayList<Integer> price = new ArrayList<>();
  	ArrayList<String> name = new ArrayList<>();

  	public void Input(){
  		System.out.println("Enter Item number ");
      int it = sc.nextInt();
  		item.add(it);
  		System.out.println("Enter Price of Item ");
      int pr = sc.nextInt();
  		price.add(pr);
  		System.out.println("Enter Name of Item ");
      String str = sc.next();
  		name.add(str);
  	}

  	public void display(){
  		System.out.println("----------- Cart Items ------------");
  		System.out.println("No.Item ------ Price ------ Name");
  		for(int i=0;i<item.size();++i){
  			System.out.println("  "+item.get(i)+"            "+price.get(i)+"         "+name.get(i));
  		}
  	}

  	public void update(){
  		int ino;
      int choice;
  		System.out.println("Enter Item number to Update ");
  		ino = sc.nextInt();

  		for(int i=0;i<item.size();++i){
        //System.out.println(i);
  			if(item.get(i)==ino){
  				System.out.println("Choose to Change ");
  				System.out.println("1. "+name.get(i));
  				System.out.println("2. "+price.get(i));
  				System.out.println("Enter choice : ");
  				choice = sc.nextInt();

  				switch(choice){
  				case 1: 
  					System.out.println("Enter new Name ");
            String s = sc.next();
  					name.add(i,s);
  					break;

  				case 2:
  					System.out.println("Enter new Price ");
            int p = sc.nextInt();
  					price.add(i,p);
  					break;
  				}

  			}
  			else if(item.get(i)!=ino && i==item.size()){
  				System.out.println("Item not found ");
  				break;
  			}
  		}
  	}
  }

  class SPcart extends Cart{
  	public static void main(String[] args) {
  		
  		Scanner sc = new Scanner(System.in);
  		Cart c = new Cart();

  		int choice;
  		while(true){
  			System.out.println("\n1.Input Data");
  			System.out.println("2.Display");
  			System.out.println("3.Update");
  			System.out.println("4.Delete");
  			System.out.println("5.Exit");
  			System.out.println("Enter choice : ");
  			choice = sc.nextInt();
  			System.out.println();

  			switch(choice){
  				case 1: c.Input();
  						break;
  				case 2: c.display();
  						break;
  				case 3: c.update();
  						break;
  				case 5: System.exit(0);
  				default: System.out.println("Invalid Choice ");
  						break;
  			}
  		}
  	}
  }