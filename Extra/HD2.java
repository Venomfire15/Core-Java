import java.util.Scanner;

class solution{
        public void solve(double meal_cost, int tip_percent, int tax_percent){
                double m = meal_cost;
                double tip = tip_percent;
                double tax = tax_percent;
                double total=0;
        
                tip = (m/100)*tip;
                tax = (tax/100)*m;
                total = m+tip+tax;
        
                System.out.println(Math.round(total));
        } 
}      

class HD2{
        public static void main(String[] args) {
                solution sol = new solution();
                Scanner sc = new Scanner(System.in);

                double meal;
                int tip;
                int tax;
                System.out.println("Enter meal ");
                meal = sc.nextDouble();
                System.out.println("Enter Tip ");
                tip = sc.nextInt();
                System.out.println("Enter Tax ");
                tax = sc.nextInt();

                sol.solve(meal,tip,tax);
        }
}  


        